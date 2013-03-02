package towered.core;

import towered.core.services.Service;
import towered.core.workers.SettingsFactory;

/**
 * The Class Core.
 */
public class Core extends AbstractBase {

    /** The settings. */
    private Settings settings;
    
    
    /**
     * Instantiates a new core.
     */
    public Core() {
        super();
        init();
    }
    
    /**
     * 
     */
    public Core init() {
        this.settings = this.getSettingsFactory().getSettings();
        // Do some foo 
        // Launch window
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