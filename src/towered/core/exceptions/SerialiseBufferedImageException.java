/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 7 Mar 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class SerialiseBufferedImageException.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 7 Mar 2013
 * @project Towered
 */
public class SerialiseBufferedImageException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2779851729979205560L;

    /**
     * No supported graphics modes exception.
     */
    public SerialiseBufferedImageException() {
        Logger.error("Failed to ");
        
        Logger.logToFile(getStackTrace().toString());
    }
    
}
