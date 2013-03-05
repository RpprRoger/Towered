/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
package towered.core.factories;

import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

import towered.core.exceptions.NoSupportedGraphicsModesException;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Window objects.
 * TODO: Investigate extending jframe and window.
 * TODO: Also need to account for devices which don't allow
 * displaymode changes and fullscreen.
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
     * Gets the frame.
     *
     * @param name the name
     * @param displayM the display mode
     * @return the frame
     */
    public static JFrame getJFrame(String name, DisplayMode displayM) {
        
        JFrame jframe = new JFrame();
        
        jframe.setTitle(name);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setUndecorated(false);
        jframe.setResizable(false);
        jframe.setIgnoreRepaint(true);
        jframe.setSize(displayM.getWidth(), displayM.getHeight());
        jframe.setFocusable(true);
        jframe.setVisible(true);
        jframe.createBufferStrategy(2);
        
        return jframe;
    }
    
    /**
     * Gets the a supported display mode.
     *
     * @param graphicsD the graphics d
     * @return the a supported display mode
     */
    public static DisplayMode getASupportedDisplayMode(GraphicsDevice graphicsD) {
        
        DisplayMode[] suppDM = graphicsD.getDisplayModes();
        
        if(suppDM.length > 0) {
            return suppDM[0];
        } else {
            throw new NoSupportedGraphicsModesException();
        }
    }
    
    /**
     * Is the display mode supported on the graphics device?
     *
     * @param displayMode the display mode
     * @param gDev the graphics device
     * @return true, if successful
     */
    public static boolean supportedDisplayMode(DisplayMode displayMode, GraphicsDevice gDev) {
    
        DisplayMode[] suppDMs = gDev.getDisplayModes();
        
        for(int i = 0; i < suppDMs.length; i++) {
            
            if(suppDMs[i].equals(displayMode))
                return true;
            
        }
        return false;
    }

}
