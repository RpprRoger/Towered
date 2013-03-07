/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 25 Feb 2013
 * @project Towered
 */
package towered.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import towered.Main;
import towered.core.factories.UtilFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Logger.
 * TODO: This should open an output stream to the logger file
 * and write to it, to enable 
 *          exception.printstacktrace(logger file)
 *          
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 25 Feb 2013
 * @project Towered
 */
public class Logger {
    
    /** The log file. */
    private static String logFile = UtilFactory.getJarDir() + "/" + Main.WINDOW + "_" + Main.VERSION + ".log";
    
    /**
     * Log a string to the default logging directory.
     *
     * @param message to append to the file
     * @return boolean
     */
    public static boolean logToFile(String message) {
        return UtilFactory.appendToFile(logFile, message);
    }
    
    /**
     * Log an Info level log.
     *
     * @param message the message
     * @param level the level
     * @return the string
     */
    public static String log(String message, String level) {
        String msg = String.format(
                "[ %s %s %s ]<%s>: %s", 
                Main.WINDOW, 
                getDate(),
                getTime(),
                level,
                message)
        ;
        
        if(Main.DEBUG)
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
     * Info.
     *
     * @param message the message
     */
    public static void info(boolean message) {
        info(message ? "true" : "false");
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
     * Get the current time formatted in HH:mm:ss.
     *
     * @return The formatted String
     */
    private static String getTime() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }

}
