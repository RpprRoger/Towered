/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 3 Mar 2013
 * @project Towered
 */
package towered.game.entity;

import java.awt.Graphics2D;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 3 Mar 2013
 *
 * @project Towered
 */
public interface Entity {
    
    public void draw(Graphics2D d);
    
    public void update(double delta);

}
