package towered.core.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import towered.core.Settings;
import towered.core.factories.SettingsFactory;
import towered.core.factories.UtilFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ExternalPipe.
 */
public class ExternalPipe {
    
    /** The settings path. */
    private String settingsPath;
    
    /** The game mod path. */
    private String gameModPath;
    
    /**
     * Instantiates a new external pipe.
     */
    public ExternalPipe() {
        String filePath = String.format("%s%s",
                UtilFactory.getHomeDirectory(),
                UtilFactory.sep());
        
        settingsPath = filePath + "settings";
        gameModPath = filePath + "";
    }
    
    /**
     * Write settings.
     *
     * @param settings the settings
     * @return true, if successful
     */
    public boolean writeSettings(Settings settings) {
        return writeHashMapToDisk(settingsPath, SettingsFactory.toHashMap(settings));
    }
    
    /**
     * Read settings.
     *
     * @return the settings
     */
    public Settings readSettings() {
        
        
        return SettingsFactory.fromHashMap(readHashMap(settingsPath));
    }
    
    /**
     * Read hash map.
     *
     * @param location the location
     * @return the hash map
     */
    public HashMap<String, String> readHashMap(String location) {
        String[] read = readTextFile(location).split("\n");
        
        HashMap<String, String> map = new HashMap<String, String>();
        
        for(int i = 0; i < read.length; i++) {
            
            String subject = read[i];
            
            while(subject.startsWith(" ") && subject.length() > 0) {
                subject = subject.substring(1);
            }
            
            if(!subject.startsWith("#") && subject.indexOf("=") > -1) {
                map.put(subject.split("=")[0], subject.split("=")[1]);
            }
            
        }
        
        return map;
    }
    
    /**
     * Write hash map to disk.
     *
     * @param location the location
     * @param map the map
     * @return true, if successful
     */
    public boolean writeHashMapToDisk(String location, HashMap<String, String> map) {
        String full = "";
        
        for(Map.Entry<String, String> entry: map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            
            full += String.format("%s=%s\n", key, value);    
        }
        
        return writeTextFile(location, full);
        
    }
    
    /**
     * This method reads a text file line by line and returns the string.
     *
     * @param fileName the file name
     * @return String of the file contents
     */
    public String readTextFile(String fileName) {
        String returnValue = "";
        FileReader file = null;
        String line = "";
        try {
            file = new FileReader(fileName);
            BufferedReader reader = new BufferedReader(file);
            while ((line = reader.readLine()) != null) {
                returnValue += line + "\n";
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException("File not found: " + fileName);
        } catch (IOException e) {
            throw new RuntimeException("IO Error occured");
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return returnValue;
    }

    /**
     * Write text file.
     *
     * @param fileName is the file that you wish to write.
     * @param s is the file to print
     * @return true, if successful
     */
    public boolean writeTextFile(String fileName, String s) {
        FileWriter output = null;
        try {
            output = new FileWriter(fileName);
            BufferedWriter writer = new BufferedWriter(output);
            String[] lines = s.split("\n");
            for(int i = 0;i < lines.length;i++) {
                writer.write(lines[i]);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output != null) {
                try {
                    output.close();
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
    
}
