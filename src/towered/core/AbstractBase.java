package towered.core;

import towered.core.services.ExternalPipe;
import towered.core.services.InternalPipe;
import towered.core.services.ScreenManager;
import towered.core.workers.SettingsFactory;

/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase {
    
    /** The services. */
    private ExternalPipe externalPipe; //ExternalPipe
    private InternalPipe internalPipe; // InternalPipe
    private ScreenManager screenManager;
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
     * @return the externalPipe
     */
    public ExternalPipe getExternalPipe() {
        return externalPipe;
    }

    /**
     * @param externalPipe the externalPipe to set
     */
    public AbstractBase setExternalPipe(ExternalPipe externalPipe) {
        this.externalPipe = externalPipe;
        return this;
    }

    /**
     * @return the internalPipe
     */
    public InternalPipe getInternalPipe() {
        return internalPipe;
    }

    /**
     * @param internalPipe the internalPipe to set
     */
    public AbstractBase setInternalPipe(InternalPipe internalPipe) {
        this.internalPipe = internalPipe;
        return this;
    }

    /**
     * @return the screenManager
     */
    public ScreenManager getScreenManager() {
        return screenManager;
    }

    /**
     * @param screenManager the screenManager to set
     */
    public AbstractBase setScreenManager(ScreenManager screenManager) {
        this.screenManager = screenManager;
        return this;
    }
}
