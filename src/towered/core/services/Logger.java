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
        this.logFile = Service.JAR_FILE + "towered.log";
    }
        
    /**
     * Instantiates a new logger.
     *
     * @param logFile the log file
     */
    public Logger(String logFile) {
        this.logFile = logFile;
    }
    
    public boolean logToFile(String message) {
        return ExternalPipe.appendToFile(logFile, message);
    }
    
    public void info(String message) {
        String name = Settings.getWindow();
        
        String start = String.format("", name, date, time);
    }
    
    /* Private helper functions
     * ============================*/
    
    private String getDate() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    
    private String getTime() {
        Calendar cal = Calendar.getInstance();
        cal.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(cal.getTime());
    }
    
}
