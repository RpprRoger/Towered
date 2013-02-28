/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
package towered.window;

import java.awt.Canvas;

import javax.swing.JFrame;

import towered.core.Resolution;
import towered.core.Settings;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 18 Feb 2013
 *
 * @project Towered
 */
public class WindowFactory {
    
    /**
     * Generate a window using.
     * @param settings object to create the window from.
     */
    public Canvas getCanvas(Settings settings) {
        Canvas canvas = new Canvas();
        
        if(settings.isFullscreen()) {
            
        }
        
        return canvas;
    }
    
    public Canvas getCanvas(Resolution res) {
        
        return new Canvas();
    }
    
    public Canvas getFullscreenCanvas(Resolution res) {
        return new Canvas();
    }
    
    public JFrame getFrame(Settings settings) {
        
        return new JFrame();
    }

}
