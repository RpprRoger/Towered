/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class KeyNotFoundException.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
public class KeyNotFoundException extends Exception {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 5092804416647620846L;

    /**
     * Instantiates a new key not found exception.
     */
    public KeyNotFoundException() {
        Logger.error("Key could not be found.");
        
        Logger.logToFile(getStackTrace().toString());
    }
    
    /**
     * Instantiates a new key not found exception.
     */
    public KeyNotFoundException(String key) {
        Logger.error("Key could not be found:" + key);
        
        Logger.logToFile(getStackTrace().toString());
    }

}
