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

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Window objects.
 * TODO: Investigate extending jframe and window.
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
public class ScreenFactory {
    
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
     * Gets the window.
     *
     * @param res the res
     * @return the window
     */
    public static Window getWindow(JFrame jframe, boolean fullscreen) {
        
        Window window = new Window(jframe);
        
        window.setFocusable(true);
        
        window.setIgnoreRepaint(true);
        
        window.setSize(jframe.getSize());
        
        window.setVisible(true);
        
        window.createBufferStrategy(2);
        
        return window;
    }
    
    /**
     * Gets the frame.
     *
     * @param settings the settings
     * @return the frame
     */
    public static JFrame getJFrame(String name, DisplayMode displayM) {
        
        JFrame jframe = new JFrame();
        
        jframe.setTitle(name);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setUndecorated(false);
        jframe.setResizable(false);
        jframe.setVisible(true);
        jframe.setSize(displayM.getWidth(), displayM.getHeight());
        
        return jframe;
    }
    
    public static DisplayMode[] getSupportedDisplayModes(GraphicsDevice graphicsD) {
        DisplayMode[] modes = {};  
        
        modes = graphicsD.getDisplayModes();
        
        return modes;
    }

}
