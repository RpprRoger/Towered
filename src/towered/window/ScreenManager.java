/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
package towered.window;

import java.awt.Canvas;
import java.awt.GraphicsDevice;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import towered.core.exceptions.CanvasNullException;

// TODO: Auto-generated Javadoc
/**
 * The Class ScreenManager.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
public class ScreenManager {
    
    /** The window factory. */
    private WindowFactory windowFactory;
    
    /** The active game canvas. */ //TODO: isn't window better?
    private Canvas activeGameCanvas;
    
    /** The active game frame. */
    private JFrame activeGameFrame;
    
    /** The active graphics device. */
    private GraphicsDevice activeGraphicsDevice;
    
    /**
     * Instantiates a new screen manager.
     */
    public ScreenManager() {
        this.setWindowFactory(new WindowFactory())
            .setActiveGraphicsDevice(
                    this.getWindowFactory().getDefaultGraphicsDevice()
            )
        ;
    }
    
    /**
     * Update.
     */
    public void update() {
        
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
     * @throws CanvasNullException the canvas null exception
     */
    public Canvas getActiveGameCanvas() {
        if(this.activeGameCanvas != null) {
            return activeGameCanvas;
        } else {
            throw new CanvasNullException();
        }
    }
    
    /**
     * Sets the active game canvas.
     *
     * @param activeGameCanvas the activeGameCanvas to set
     * @return the screen manager
     */
    public ScreenManager setActiveGameCanvas(Canvas activeGameCanvas) {
        this.activeGameCanvas = activeGameCanvas;
        return this;
    }

    /**
     * Gets the active game frame.
     *
     * @return the activeGameFrame
     */
    public JFrame getActiveGameFrame() {
        return activeGameFrame;
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
     * Gets the window factory.
     *
     * @return the windowFactory
     */
    public WindowFactory getWindowFactory() {
        return windowFactory;
    }

    /**
     * Sets the window factory.
     *
     * @param windowFactory the windowFactory to set
     * @return the screen manager
     */
    public ScreenManager setWindowFactory(WindowFactory windowFactory) {
        this.windowFactory = windowFactory;
        return this;
    }

    /**
     * @return the activeGraphicsDevice
     */
    public GraphicsDevice getActiveGraphicsDevice() {
        return activeGraphicsDevice;
    }

    /**
     * @param activeGraphicsDevice the activeGraphicsDevice to set
     */
    public ScreenManager setActiveGraphicsDevice(GraphicsDevice activeGraphicsDevice) {
        this.activeGraphicsDevice = activeGraphicsDevice;
        return this;
    }

}
