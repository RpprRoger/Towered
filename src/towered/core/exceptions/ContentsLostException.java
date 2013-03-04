/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
package towered.core.exceptions;

import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class ContentsLostException.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
public class ContentsLostException extends RuntimeException {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6759640116981117748L;

    /**
     * Instantiates a new frame null exception.
     */
    public ContentsLostException() {
        Logger.error("BufferedStrategy contents has been lost.");
        
        Logger.logToFile(getStackTrace().toString());
    }
    
}
