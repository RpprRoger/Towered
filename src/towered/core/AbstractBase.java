package towered.core;

import towered.externals.ExternalPipe;

/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase {
    
    /**
     * Instantiates a new abstract base.
     */
    public AbstractBase() {}
    
    /**
     * Gets the external pipe instance.
     *
     * @return the external pipe instance
     */
    public ExternalPipe getExternalPipeInstance() {
        return new ExternalPipe();
    }

}
