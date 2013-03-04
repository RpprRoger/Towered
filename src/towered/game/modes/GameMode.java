/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 4 Mar 2013
 * @project Towered
 */
package towered.game.modes;

import java.awt.Graphics2D;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 4 Mar 2013
 *
 * @project Towered
 */
public abstract class GameMode {

    public abstract void draw(Graphics2D g);
    
    public abstract void update();
    
}
