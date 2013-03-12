package towered.core.services;

import java.io.File;

import towered.core.Settings;
import towered.core.factories.SettingsFactory;
import towered.core.factories.UtilFactory;
import towered.resources.Resources;


// TODO: Auto-generated Javadoc
/**
 * The Class AbstractBase.
 */
public class Services {
    
    /** Services. */
    
    /** The screen manager. */
    public ScreenManager screen;
    
    /** The settings manager. */
    public SettingsManager settings;
    
    /** The resources. */
    private Resources resources;
    
    /**
     * Instantiates a new abstract base.
     */
    public Services() {
        this.setScreenManager(new ScreenManager())
            .setSettingsManager(new SettingsManager())
            .setResources(new Resources());
    }
    
    /**
     * Inits the.
     */
    public void init() {
        
        if(settingsExists()) {
            settings.setActiveSettings(readSettings());
        } else {
            Settings s = SettingsFactory.instantiateDefaultSettings();
            
            writeSettings(s);
            
            settings.setActiveSettings(s);
        }
        
        screen.init(
                settings.get().getResolution());
        
    }
    
    /**
     * Settings exists.
     *
     * @return true, if successful
     */
    public boolean settingsExists() {
        return new File(resources.getSettingsPath()).exists();
    }
    
    /**
     * Write settings.
     *
     * @param settings the settings
     * @return true, if successful
     */
    public boolean writeSettings(Settings settings) {
        return UtilFactory.writeHashMapToDisk(
                resources.getSettingsPath(), SettingsFactory.toHashMap(settings));
    }
    
    /**
     * Read settings.
     *
     * @return the settings
     */
    public Settings readSettings() {
        return SettingsFactory.fromHashMap(
                UtilFactory.readHashMap(resources.getSettingsPath()));
    }
        
    /**
     * Gets the screen manager.
     *
     * @return the screenManager
     */
    public ScreenManager getScreenManager() {
        return screen;
    }

    /**
     * Sets the screen manager.
     *
     * @param screenManager the screenManager to set
     * @return the abstract base
     */
    public Services setScreenManager(ScreenManager screenManager) {
        this.screen = screenManager;
        return this;
    }

    /**
     * Gets the settings manager.
     *
     * @return the settingsManager
     */
    public SettingsManager getSettingsManager() {
        return settings;
    }

    /**
     * Sets the settings manager.
     *
     * @param settingsManager the settingsManager to set
     * @return the services
     */
    public Services setSettingsManager(SettingsManager settingsManager) {
        this.settings = settingsManager;
        return this;
    }

    /**
     * @return the resources
     */
    public Resources getResources() {
        return resources;
    }

    /**
     * @param resources the resources to set
     */
    public Services setResources(Resources resources) {
        this.resources = resources;
        return this;
    }

}
