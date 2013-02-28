/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 25 Feb 2013
 * @project Towered
 */
package towered.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import towered.core.services.ExternalPipe;
import towered.core.services.Service;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 25 Feb 2013
 *
 * @project Towered
 */
public class Logger extends Service {
    
    private static String logFile = getJarDir() + Settings.WINDOW + "_" + Settings.VERSION + ".log";
    
    /**
     * Instantiates a new logger.
     *
     */
    public Logger() {}
    
    /**
     * Log a string to the default logging directory
     * @param message to append to the file
     * @return boolean
     */
    public static boolean logToFile(String message) {
        return ExternalPipe.appendToFile(logFile, message);
    }
    
    /**
     * Log an array to the default logging directory
     * @param message to append to the file
     * @return boolean
     */
    public static boolean logToFile(Object[] array) {
        return ExternalPipe.appendToFile(logFile, array.toString());
    }
    
    /**
     * Log an Info level log.
     *
     * @param message the message
     */
    public static String log(String message, String level) {
        String msg = String.format(
                "[ %1 %2 %3 ]<%4>: %5", 
                Settings.WINDOW, 
                getDate(),
                getTime(),
                level,
                message)
        ;
        
        logToFile(msg);
        
        return msg;
    }
    
    /**
     * Print to the console.
     * @param message to print
     */
    public static void info(String message) {
        System.out.println(log(message, "INFO"));
    }
    
    /**
     * Print to the console.
     * @param message to print
     */
    public static void error(String message) {
        System.err.println(log(message, "ERROR"));
    }
    
    /* Private helper functions
     * ============================*/
    
    /**
     * Get the current date formatted in dd.MM.yyyy
     * @return The formatted String
     */
    private static String getDate() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(cal.getTime());
    }
    
    /**
     * Get the current time formatted in HH:mm:ss
     * @return The formatted String
     */
    private static String getTime() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    
}
