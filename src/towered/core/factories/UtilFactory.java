/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 6 Mar 2013
 * @project Towered
 */
package towered.core.factories;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import towered.Main;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Util objects.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 6 Mar 2013
 * @project Towered
 */
public class UtilFactory {
    
    /** The Constant JAR_FILE. */
    private final static String JAR_FILE = Main.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    
    /**
     * Append to file.
     *
     * @param fileName the file name
     * @param message the message
     * @return true, if successful
     */
    public static boolean appendToFile(String fileName, String message) {
        FileWriter output = null;
        try {
            output = new FileWriter(fileName, true);
            BufferedWriter writer = new BufferedWriter(output);
            writer.write(message);
            writer.newLine();
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
    
    
    /**
     * Get the jar file path.
     *
     * @return the path
     */
    public static String getJarFile() {
        return JAR_FILE;
    }
    
    /**
     * Gets the jar dir.
     *
     * @return the jar dir
     */
    public static String getJarDir() {
        int i = getJarFile().lastIndexOf('/');
        String dir = JAR_FILE.substring(0, i);
        return dir;
    }
    
    /**
     * Join array.
     *
     * @param subject the subject
     * @param joiner the joiner
     * @return the string
     */
    public static String joinArray(String[] subject, String joiner) {
        
        String joined = "";
        
        for(int i = 0; i < subject.length; i++) {
            joined += subject[i];
            
            if(i < subject.length - 1)
                joined += joiner;
        }
        
        return joined;
    }
    
    /**
     * Sep.
     *
     * @return the string
     */
    public static String getSeperator() {
        return System.getProperty("file.separator");
    }
    
    /**
     * Gets the home directory.
     *
     * @return the home directory
     */
    public static String getHomeDirectory() {
        
        String home = System.getProperty("user.home"),
                sep = System.getProperty("file.separator"),
                dir = String.format("%s%s.%s", home, sep, Main.WINDOW);
        
        File tester = new File(dir);
        
        if(!tester.exists()) {
            tester.mkdirs();
        }
        
        return dir;
        
    }
    
    /**
     * Read hash map.
     *
     * @param location the location
     * @return the hash map
     */
    public static HashMap<String, String> readHashMap(String location) {
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
    public static boolean writeHashMapToDisk(String location, HashMap<String, String> map) {
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
    public static String readTextFile(String fileName) {
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
    public static boolean writeTextFile(String fileName, String s) {
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
