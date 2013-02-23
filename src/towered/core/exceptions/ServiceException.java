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
public class ServiceException extends AbstractException {
    
    public ServiceException() {
        super("Service exception: ");
    }
    
    public ServiceException(String message) {
        
    }
}
