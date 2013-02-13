package towered.core;

/**
 * A factory for creating Settings objects.
 */
public class SettingsFactory extends AbstractBase {
    
    /** The path. */
    private String path;
    
    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings() {
        // Before we get and set in file system lets use a default.

        return this.instantiateDefaultSettings();
    }
    
    /*
     * Private helper functions
     *====================================*/
    
    private Settings instantiateDefaultSettings() {
        Settings s = new Settings();
        
        s.setDifficulty(0.5)
            .setFullscreen(false)
            .setJump(1) // Er space key? TODO: need to get the key numbers for keys..
            .setLeft(2) // left arrow
            .setRight(3) // right arrow
            .setResolution(new Resolution(800,600));

        return s;
    }
    
}