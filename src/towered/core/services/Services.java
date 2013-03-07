package towered.core.services;


// TODO: Auto-generated Javadoc
/**
 * The Class AbstractBase.
 */
public class Services {
    
    /** Services. */
    
    /** External pipe */
    public ExternalPipe external; //ExternalPipe
    
    /** The internal pipe. */
    public InternalPipe internal; // InternalPipe
    
    /** The screen manager. */
    public ScreenManager screen;
    
    /** The settings manager. */
    public SettingsManager settings;
    
    //private Logger logger; // Logger maybe just be static
    
    /**
     * Instantiates a new abstract base.
     */
    public Services() {
        this.setExternalPipe(new ExternalPipe())
            .setInternalPipe(new InternalPipe())
            .setScreenManager(new ScreenManager())
            .setSettingsManager(new SettingsManager());
    }

    /**
     * Gets the external pipe.
     *
     * @return the externalPipe
     */
    public ExternalPipe getExternalPipe() {
        return external;
    }

    /**
     * Sets the external pipe.
     *
     * @param externalPipe the externalPipe to set
     * @return the abstract base
     */
    public Services setExternalPipe(ExternalPipe externalPipe) {
        this.external = externalPipe;
        return this;
    }

    /**
     * Gets the internal pipe.
     *
     * @return the internalPipe
     */
    public InternalPipe getInternalPipe() {
        return internal;
    }

    /**
     * Sets the internal pipe.
     *
     * @param internalPipe the internalPipe to set
     * @return the abstract base
     */
    public Services setInternalPipe(InternalPipe internalPipe) {
        this.internal = internalPipe;
        return this;
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
     * @return the settingsManager
     */
    public SettingsManager getSettingsManager() {
        return settings;
    }

    /**
     * @param settingsManager the settingsManager to set
     */
    public Services setSettingsManager(SettingsManager settingsManager) {
        this.settings = settingsManager;
        return this;
    }
}
