/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
package towered.core.services;

import java.awt.DisplayMode;
import java.awt.Graphics2D;
import java.awt.GraphicsDevice;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JFrame;

import towered.Main;
import towered.core.Settings;
import towered.core.exceptions.ContentsLostException;
import towered.core.exceptions.FrameIsNullException;
import towered.core.factories.ScreenFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class ScreenManager.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 27 Feb 2013
 * @project Towered
 */
public class ScreenManager {
    
    /** The active game frame. */
    private JFrame activeGameFrame;
    
    /** The active graphics device. */
    private GraphicsDevice activeGraphicsDevice;
    
    /**
     * Instantiates a new screen manager.
     */
    public ScreenManager() {
        setActiveGraphicsDevice(
                ScreenFactory.getDefaultGraphicsDevice()
        );
    }
    
    /**
     * Adds the key listener.
     *
     * @param keyListener the key listener
     * @return the screen manager
     */
    public ScreenManager addKeyListener(KeyListener keyListener) {
        
        getActiveFrame().addKeyListener(keyListener);
        
        return this;
    }
    
    /**
     * Display.
     *
     * @param settings the settings
     * @return the screen manager
     */
    public ScreenManager init(DisplayMode displayM) {
        
        String name = Main.WINDOW + " " + Main.VERSION;        
        
        setActiveFrame(ScreenFactory.getJFrame(name, displayM));
        
        centre();
        
        return this;
    }
    
    /**
     * Centre active window.
     */
    public void centre() {
        getActiveFrame().setLocationRelativeTo(null);
    }
    
    /**
     * Update.
     */
    public void update() {
        if(!getBufferStrategy().contentsLost()) {
            getBufferStrategy().show();
        } else {
            throw new ContentsLostException();
        }
    }
    
    /**
     * Gets the graphics.
     *
     * @return the graphics
     */
    public Graphics2D getGraphics() {
        return (Graphics2D)getBufferStrategy().getDrawGraphics();
    }
    
    /**
     * Fullscreen.
     */
    public void fullscreen() {
        getActiveGraphicsDevice().setFullScreenWindow(getActiveFrame());
    }
    
    /**
     * Windowed.
     */
    public void windowed() {
        getActiveGraphicsDevice().setFullScreenWindow(null);
    }
    
    /* getters and setters */
    
    /**
     * Gets the buffer strategy.
     *
     * @return the buffer strategy
     */
    public BufferStrategy getBufferStrategy() {
        return getActiveFrame().getBufferStrategy();
    }
    
    /**
     * Gets the active game frame.
     *
     * @return the activeGameFrame
     */
    public JFrame getActiveFrame() {
        if(this.activeGameFrame != null) {
            return activeGameFrame;
        } else {
            throw new FrameIsNullException();
        }
    }

    /**
     * Sets the active game frame.
     *
     * @param activeGameFrame the activeGameFrame to set
     * @return the screen manager
     */
    public ScreenManager setActiveFrame(JFrame activeGameFrame) {
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
