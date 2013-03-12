/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 12 Mar 2013
 * @project Towered
 */
package towered.game.entity;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

// TODO: Auto-generated Javadoc
/**
 * The Class Map.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 12 Mar 2013
 * @project Towered
 */
public class Map implements Entity {
    
    /** The map view. */
    private BufferedImage mapView;
    
    /** The clipping mask. */
    private byte[][] clippingMask;

    /* (non-Javadoc)
     * @see towered.game.entity.Entity#draw(java.awt.Graphics2D)
     */
    @Override
    public void draw(Graphics2D d) {
        // TODO Auto-generated method stub
        
    }

    /* (non-Javadoc)
     * @see towered.game.entity.Entity#update(double)
     */
    @Override
    public void update(double delta) {
        // TODO Auto-generated method stub
        
    }
    
    /*private something clippingMask;*/

}
