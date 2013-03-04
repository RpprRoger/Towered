/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
package towered.game;

import towered.core.Core;

// TODO: Auto-generated Javadoc
/**
 * The Class Towered.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
public class Towered extends Core implements Runnable {
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
        // TODO Auto-generated method stub
        
        start();
        
        gameLoop();
        
    }    
}