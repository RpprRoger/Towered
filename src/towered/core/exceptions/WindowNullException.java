/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

/**
 * The Class CanvasNullException.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
public class WindowNullException extends RuntimeException {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -639552504695083559L;

    /**
     * Instantiates a new canvas null exception.
     */
    public WindowNullException() {
        Logger.error("Canvas is null.");
        
        Logger.logToFile(getStackTrace());
    }

}
