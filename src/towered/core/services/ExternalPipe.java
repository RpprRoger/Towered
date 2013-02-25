package towered.core.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExternalPipe extends Service {
    
    public ExternalPipe() {}
    
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
