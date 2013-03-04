/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 2 Mar 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class FrameIsNullException.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 2 Mar 2013
 * @project Towered
 */
public class FrameIsNullException extends RuntimeException {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -639552504695083559L;

    /**
     * Instantiates a new frame null exception.
     */
    public FrameIsNullException() {
        Logger.error("Frame is null.");
        
        Logger.logToFile(getStackTrace().toString());
    }

}
