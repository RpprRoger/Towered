package towered.core;

import towered.core.services.ExternalPipe;
import towered.core.services.InternalPipe;
import towered.core.services.ScreenManager;
import towered.core.services.SettingsManager;

// TODO: Auto-generated Javadoc
/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase {
    
    /** Services. */
    
    /** External pipe */
    private ExternalPipe externalPipe; //ExternalPipe
    
    /** The internal pipe. */
    private InternalPipe internalPipe; // InternalPipe
    
    /** The screen manager. */
    private ScreenManager screenManager;
    
    /** The settings manager. */
    private SettingsManager settingsManager;
    
    //private Logger logger; // Logger maybe just be static
    
    /**
     * Instantiates a new abstract base.
     */
    public AbstractBase() {
        this.setExternalPipe(new ExternalPipe())
            .setInternalPipe(new InternalPipe())
            .setScreenManager(new ScreenManager());
    }

    /**
     * Gets the external pipe.
     *
     * @return the externalPipe
     */
    public ExternalPipe getExternalPipe() {
        return externalPipe;
    }

    /**
     * Sets the external pipe.
     *
     * @param externalPipe the externalPipe to set
     * @return the abstract base
     */
    public AbstractBase setExternalPipe(ExternalPipe externalPipe) {
        this.externalPipe = externalPipe;
        return this;
    }

    /**
     * Gets the internal pipe.
     *
     * @return the internalPipe
     */
    public InternalPipe getInternalPipe() {
        return internalPipe;
    }

    /**
     * Sets the internal pipe.
     *
     * @param internalPipe the internalPipe to set
     * @return the abstract base
     */
    public AbstractBase setInternalPipe(InternalPipe internalPipe) {
        this.internalPipe = internalPipe;
        return this;
    }

    /**
     * Gets the screen manager.
     *
     * @return the screenManager
     */
    public ScreenManager getScreenManager() {
        return screenManager;
    }

    /**
     * Sets the screen manager.
     *
     * @param screenManager the screenManager to set
     * @return the abstract base
     */
    public AbstractBase setScreenManager(ScreenManager screenManager) {
        this.screenManager = screenManager;
        return this;
    }

    /**
     * @return the settingsManager
     */
    public SettingsManager getSettingsManager() {
        return settingsManager;
    }

    /**
     * @param settingsManager the settingsManager to set
     */
    public AbstractBase setSettingsManager(SettingsManager settingsManager) {
        this.settingsManager = settingsManager;
        return this;
    }
}
