/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class NoSupportedGraphicsModes.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
public class NoSupportedGraphicsModesException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -7992856215931568607L;

    public NoSupportedGraphicsModesException() {
        Logger.error("Could not find supported graphics modes for this device.");
        
        Logger.logToFile(getStackTrace().toString());
    }
    
}
