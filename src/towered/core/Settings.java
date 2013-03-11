package towered.core;

import java.awt.DisplayMode;
import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Settings.
 */
public class Settings implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 4664286911493991225L;

    /** The resolution. */
    private DisplayMode resolution;
    
    /** Keys used for re-bindings. */
    private GameKeys keys;
    
    /** The difficulty. */
    private double difficulty;
    
    /** The fullscreen. */
    private boolean fullscreen;
    
    /*
     * Getters and setters
     *=============================================================*/

    /**
     * Set the resolution of the game.
     *
     * @param r the r
     * @return this
     */
    public Settings setResolution(DisplayMode r) {
        this.resolution = r;
        
        return this;
    }
    
    /**
     * Get resolution.
     *
     * @return Resolution
     */
    public DisplayMode getResolution() {
        return this.resolution;
    }
    
    /**
     * Put keys.
     *
     * @param keyPairs the key pairs separated by :
     * @return the settings
     */
    public Settings setKeys(String... keyPairs) {
        
        this.keys = new GameKeys(keyPairs);
        
        return this;
    }
    
    /**
     * Sets the key.
     *
     * @param name the name
     * @param keyCode the key code
     * @return the settings
     */
    public Settings setKey(String name, int keyCode) {
        
        if(keys == null)
            keys = new GameKeys();
        
        keys.put(name, keyCode);
        
        return this;
    }
    
    /**
     * Gets the key.
     *
     * @param name the name
     * @return the key
     */
    public int getKey(String name) {       
        return keys.getKey(name);
    }
    
    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public GameKeys getKeys() {
        return this.keys;
    }
    
    /**
     * Gets the difficulty.
     *
     * @return the difficulty
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * Sets the difficulty.
     *
     * @param difficulty the difficulty to set
     * @return the settings
     */
    public Settings setDifficulty(double difficulty) {
        this.difficulty = difficulty;
        return this;
    }
    
    /**
     * Checks if is fullscreen.
     *
     * @return the fullscreen
     */
    public boolean isFullscreen() {
        return fullscreen;
    }

    /**
     * Sets the fullscreen.
     *
     * @param fullscreen the fullscreen to set
     * @return the settings
     */
    public Settings setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
        return this;
    }

    /**
     * @param k
     */
    public Settings setKeys(GameKeys keys) {
        this.keys = keys;
        return this;
    }

}