/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
package towered.window;

import java.awt.GraphicsDevice;
import java.awt.Window;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import towered.core.exceptions.FrameNullException;
import towered.core.exceptions.WindowNullException;
import towered.core.workers.WindowFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ScreenManager.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
public class ScreenManager {
    
    /** The active game canvas. */ //TODO: isn't window better?
    private Window activeGameWindow;
    
    /** The active game frame. */
    private JFrame activeGameFrame;
    
    /** The active graphics device. */
    private GraphicsDevice activeGraphicsDevice;
    
    /**
     * Instantiates a new screen manager.
     */
    public ScreenManager() {
        setActiveGraphicsDevice(
                WindowFactory.getDefaultGraphicsDevice()
        );
    }
    
    /**
     * Update.
     */
    public void update() {
        
    }
    
    /**
     * Centre active window.
     */
    public void centre() {
        getActiveGameFrame().setLocationRelativeTo(null);
    }
    
    /**
     * Gets the buffer strategy.
     *
     * @return the buffer strategy
     */
    public BufferStrategy getBufferStrategy() {
        
        
        return null;
    }
    
    /* getters and setters */
    
    /**
     * Gets the active game canvas.
     *
     * @return the activeGameCanvas
     */
    public Window getActiveGameCanvas() {
        if(this.activeGameWindow != null) {
            return activeGameWindow;
        } else {
            throw new WindowNullException();
        }
    }
    
    /**
     * Sets the active game canvas.
     *
     * @param activeGameCanvas the activeGameCanvas to set
     * @return the screen manager
     */
    public ScreenManager setActiveGameCanvas(Window activeGameCanvas) {
        this.activeGameWindow = activeGameCanvas;
        return this;
    }

    /**
     * Gets the active game frame.
     *
     * @return the activeGameFrame
     */
    public JFrame getActiveGameFrame() {
        if(this.activeGameFrame != null) {
            return activeGameFrame;
        } else {
            throw new FrameNullException();
        }
    }

    /**
     * Sets the active game frame.
     *
     * @param activeGameFrame the activeGameFrame to set
     * @return the screen manager
     */
    public ScreenManager setActiveGameFrame(JFrame activeGameFrame) {
        this.activeGameFrame = activeGameFrame;
        return this;
    }  
    
    /**
     * Gets the active graphics device.
     *
     * @return the activeGraphicsDevice
     */
    public GraphicsDevice getActiveGraphicsDevice() {
        return activeGraphicsDevice;
    }

    /**
     * Sets the active graphics device.
     *
     * @param activeGraphicsDevice the activeGraphicsDevice to set
     * @return the screen manager
     */
    public ScreenManager setActiveGraphicsDevice(GraphicsDevice activeGraphicsDevice) {
        this.activeGraphicsDevice = activeGraphicsDevice;
        return this;
    }

}
