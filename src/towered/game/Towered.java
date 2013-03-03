/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
package towered.game;

import towered.core.Core;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 23 Feb 2013
 *
 * @project Towered
 */
public class Towered extends Core implements Runnable {
    
    public Towered() {
        init();
        run();
    }
    
    /**
     * 
     */
    public void run() {
        // TODO Auto-generated method stub
        
        start();
        
        gameLoop();
        
    }
    
    
    
}