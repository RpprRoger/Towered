/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 6 Mar 2013
 * @project Towered
 */
package towered.core.factories;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import towered.Main;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 6 Mar 2013
 *
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
     * Get the jar file path
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

}
