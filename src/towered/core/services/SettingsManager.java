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
    public SettingsManager() {}
    
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
