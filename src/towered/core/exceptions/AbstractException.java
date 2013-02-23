/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
package towered.core.exceptions;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 23 Feb 2013
 *
 * @project Towered
 */
public abstract class AbstractException extends RuntimeException {
    
    private String prefix;
    
    public AbstractException(String prefix) {
        this.prefix = prefix;
    }
    
    public void throwException(String message) {
    }

}
