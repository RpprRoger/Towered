/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 6 Mar 2013
 * @project Towered
 */
package towered.core.services;

import towered.core.Settings;
import towered.core.factories.SettingsFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class SettingsManager.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 6 Mar 2013
 * @project Towered
 */
public class SettingsManager {
    
    /** The active settings. */
    private Settings activeSettings;
    
    /**
     * Instantiates a new settings manager.
     */
    public SettingsManager() {
        setActiveSettings(SettingsFactory.instantiateDefaultSettings());
    }
    
    /**
     * Inits the settings using the instance of externalpipe.
     *
     * @param ePipe the e pipe
     * @return the settings manager
     */
    public SettingsManager init(ExternalPipe ePipe) {
        
        // Do foo on the pipe to gather the settings file from the default location.        
        
        return this;
    }
    
    /**
     * Gets the Settings currently in use.
     *
     * @return the settings
     */
    public Settings get() {
        return this.activeSettings;
    }
    
    /**
     * Change.
     *
     * @return the settings manager
     */
    public SettingsManager change() {
        
        return this;
    }

    /**
     * Sets the active settings.
     *
     * @param activeSettings the activeSettings to set
     * @return the settings manager
     */
    public SettingsManager setActiveSettings(Settings activeSettings) {
        this.activeSettings = activeSettings;
        return this;
    }

}
