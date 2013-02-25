package towered.core;

import towered.core.services.ExternalPipe;
import towered.core.services.InternalPipe;
import towered.core.services.SettingsFactory;

/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase {
    
    /** The services. */
    private SettingsFactory settingsFactory; //SettingsFactory
    private ExternalPipe externalPipe; //ExternalPipe
    private InternalPipe internalPipe; // InternalPipe
    
    /**
     * Instantiates a new abstract base.
     */
    public AbstractBase() {
        
    }

}
