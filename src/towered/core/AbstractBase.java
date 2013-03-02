package towered.core;

import towered.core.services.ExternalPipe;
import towered.core.services.InternalPipe;
import towered.core.workers.SettingsFactory;

/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase {
    
    /** The services. */
    private SettingsFactory settingsFactory; //SettingsFactory
    private ExternalPipe externalPipe; //ExternalPipe
    private InternalPipe internalPipe; // InternalPipe
    //private Logger logger; // Logger maybe just be static
    
    /**
     * Instantiates a new abstract base.
     */
    public AbstractBase() {
        this.setExternalPipe(new ExternalPipe())
            .setInternalPipe(new InternalPipe())
            .setSettingsFactory(new SettingsFactory());
    }

    /**
     * @return the settingsFactory
     */
    public SettingsFactory getSettingsFactory() {
        return settingsFactory;
    }

    /**
     * Sets the settings factory.
     *
     * @param settingsFactory the settingsFactory to set
     * @return the abstract base
     */
    public AbstractBase setSettingsFactory(SettingsFactory settingsFactory) {
        this.settingsFactory = settingsFactory;
        return this;
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
}
