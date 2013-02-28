/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
package towered.window;

import java.awt.Canvas;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import towered.core.Resolution;
import towered.core.Settings;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Window objects.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
public class WindowFactory {
    
    public GraphicsDevice getDefaultGraphicsDevice() {
        return GraphicsEnvironment.
                getLocalGraphicsEnvironment().
                    getDefaultScreenDevice();
    }
    
    /**
     * Generate a window using.
     *
     * @param settings object to create the window from.
     * @return the canvas
     */
    public Canvas getCanvas(Settings settings) {
        Canvas canvas;
        
        if(settings.isFullscreen()) {
            canvas = getFullscreenCanvas(settings.getResolution());
        } else {
            canvas = getCanvas(settings.getResolution());
        }
        
        return canvas;
    }
    
    /**
     * Gets the canvas.
     *
     * @param res the res
     * @return the canvas
     */
    public Canvas getCanvas(Resolution res) {
        
        return new Canvas();
    }
    
    /**
     * Gets the fullscreen canvas.
     *
     * @param res the res
     * @return the fullscreen canvas
     */
    public Canvas getFullscreenCanvas(Resolution res) {
        return new Canvas();
    }
    
    /**
     * Gets the frame.
     *
     * @param settings the settings
     * @return the frame
     */
    public JFrame getFrame(Settings settings) {
        
        return new JFrame();
    }

}
