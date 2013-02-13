package towered.core;

// TODO: Auto-generated Javadoc
/**
 * The Class Settings.
 */
public class Settings {
    
    /** The version. */
    private static String version = "v0.1";
    
    /** The window. */
    private static String window = "Towered";
    
    /** The resolution. */
    private Resolution resolution;
    
    /** Keys used for re-bindings */
    private int jump,
                left,
                right;
    
    /** The difficulty. */
    private double difficulty;
    
    /**
     * Instantiates a new settings.
     *
     * @param String the settings
     */
    public Settings(Settings s) {
        
    }
    
    /**
     * Instantiates a new settings.
     */
    public Settings() {}
    
    /**
     * Set the resolution of the game.
     *
     * @param r the r
     * @return this
     */
    public Settings setResolution(Resolution r) {
        this.resolution = r;
        
        return this;
    }
    
    /**
     * Get resolution.
     *
     * @return Resolution
     */
    public Resolution getResolution() {
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
     * @return the difficulty
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * @param difficulty the difficulty to set
     */
    public Settings setDifficulty(double difficulty) {
        this.difficulty = difficulty;
        return this;
    }

}