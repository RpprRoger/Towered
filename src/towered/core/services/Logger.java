/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 25 Feb 2013
 * @project Towered
 */
package towered.core.services;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import towered.core.Settings;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 25 Feb 2013
 *
 * @project Towered
 */
public class Logger extends Service {
    
    private String logFile;
    
    public Logger() {
        this.logFile = this.getJarDir() + Settings.WINDOW + "_" + Settings.VERSION + ".log";
    }
        
    /**
     * Instantiates a new logger.
     *
     * @param logFile the log file
     */
    public Logger(String logFile) {
        this.logFile = logFile;
    }
    
    /**
     * 
     * @param message to append to the file
     * @return boolean
     */
    public boolean logToFile(String message) {
        return ExternalPipe.appendToFile(logFile, message);
    }
    
    /**
     * Info.
     *
     * @param message the message
     */
    public void info(String message) {        
        String msg = String.format("", Settings.WINDOW, this.getDate(), this.getTime(), message);
        
        logToFile(msg);
    }
    
    /* Private helper functions
     * ============================*/
    
    /**
     * Get the current date formatted in dd.MM.yyyy
     * @return The formatted String
     */
    private String getDate() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return sdf.format(cal.getTime());
    }
    
    /**
     * Get the current time formatted in HH:mm:ss
     * @return The formatted String
     */
    private String getTime() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    
}
