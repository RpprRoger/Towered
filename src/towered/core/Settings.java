/*
 * Robert Preus-MacLaren
 */
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
    private int jump,
                left,
                right;
    
    /** The difficulty. */
    private double difficulty;
    
    /** The fullscreen. */
    private boolean fullscreen;

    /**
     * Instantiates a new settings.
     */
    public Settings() {}
    
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
     * Sets the jump.
     *
     * @param key the key
     * @return the settings
     */
    public Settings setJump(int key) {
        this.jump = key;
        
        return this;
    }
    
    /**
     * Gets the jump.
     *
     * @return the jump
     */
    public int getJump() {
        return this.jump;
    }
    
    /**
     * Sets the left.
     *
     * @param key the key
     * @return the settings
     */
    public Settings setLeft(int key) {
        this.left = key;
        
        return this;
    }
    
    /**
     * Gets the left.
     *
     * @return the left
     */
    public int getLeft() {
        return this.left;
    }
    
    /**
     * Sets the right.
     *
     * @param key the key
     * @return the settings
     */
    public Settings setRight(int key) {
        this.right = key;
        
        return this;
    }
    
    /**
     * Gets the right.
     *
     * @return the right
     */
    public int getRight() {
        return this.right;
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

}