/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
package towered.game;

import java.awt.Color;
import java.awt.Graphics2D;

import towered.core.Core;
import towered.core.Logger;

// TODO: Auto-generated Javadoc
/**
 * The Class Towered.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 23 Feb 2013
 * @project Towered
 */
public class Towered extends Core implements Runnable {
    
    public Core init() {
        
        
        
        return super.init();
    }
    
    /* (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    public void run() {
        // TODO Auto-generated method stub
        
        try {
            
            init();
            
            start();
            
            gameLoop();
            
        } finally {
            Logger.info("Game closed!");
        }
        
    }

    /* (non-Javadoc)
     * @see towered.core.Core#update(long)
     */
    @Override
    public synchronized void update(double delta) {
        // TODO Auto-generated method stub
    }

    /* (non-Javadoc)
     * @see towered.core.Core#draw(java.awt.Graphics2D)
     */
    @Override
    public synchronized void draw(Graphics2D g) {
        // TODO Auto-generated method stub
        g.setColor(Color.red);
        g.drawString("hello world", 50, 50);
        g.fillRect(0, 0, 600, 600);
    }
}