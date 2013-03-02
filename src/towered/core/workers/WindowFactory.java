/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
package towered.core.workers;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;

import towered.core.Resolution;
import towered.core.Settings;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Window objects.
 * TODO: Investigate extending jframe and window.
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
public class WindowFactory {
    
    /**
     * Gets the default graphics device.
     *
     * @return the default graphics device
     */
    public static GraphicsDevice getDefaultGraphicsDevice() {
        return GraphicsEnvironment.
                getLocalGraphicsEnvironment().
                    getDefaultScreenDevice();
    }
    
    /**
     * Generate a window using.
     *
     * @param settings object to create the window from.
     * @param jframe the jframe
     * @return the window
     */
    public static Window getWindow(Settings settings, JFrame jframe) {
        Window window;
        
        if(settings.isFullscreen()) {
            window = getFullscreenWindow(settings.getResolution());
        } else {
            window = getWindow(settings.getResolution());
        }
        
        return window;
    }
    
    /**
     * Gets the window.
     *
     * @param res the res
     * @return the window
     */
    public static Window getWindow(Resolution res) {
        
        return new Window(new JFrame());
    }
    
    /**
     * Gets the fullscreen window.
     *
     * @param res the res
     * @return the fullscreen window
     */
    public static Window getFullscreenWindow(Resolution res) {
        return new Window(new JFrame());
    }
    
    /**
     * Gets the frame.
     *
     * @param settings the settings
     * @return the frame
     */
    public static JFrame getJFrame(Settings settings) {
        
        return new JFrame();
    }
    
    public static DisplayMode[] getSupportedDisplayModes(GraphicsDevice graphicsD) {
        DisplayMode[] modes = {};  
        
        modes = graphicsD.getDisplayModes();
        
        return modes;
    }

}
