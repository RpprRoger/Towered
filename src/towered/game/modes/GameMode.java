/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
package towered.game.modes;

import java.awt.Graphics2D;

/**
 * This is the abstract game mode class,
 * this class will contain simple draw and update
 * methods so game modes and be loaded dynamicly.
 * 
 * When extended the draw method will draw all the assets
 * to the screen according the positional data held in the 
 * object/ in the physics thread.
 * 
 * The classes which extend this one should contain all the
 * assets for the game mode, in the scaled size for the res.
 * 
 * After being passed through a scaler function, based on
 * scaler2x
 * 
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
public abstract class GameMode {
    
    public abstract void init();

    public abstract void draw(Graphics2D g);
    
    public abstract void update();
    
}
