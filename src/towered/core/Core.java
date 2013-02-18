package towered.core;

/**
 * The Class Core.
 */
public class Core extends AbstractBase {

    /** The settings. */
    private Settings settings;
    
    /**
     * Instantiates a new core.
     */
    public Core() {}
    
    /**
     * 
     */
    public Core initSettings() {
        
        return this;
    }
    
    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings() {
        return this.settings;
    }
}