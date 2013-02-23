package towered.core;

import java.util.HashMap;

import towered.core.exceptions.ServiceException;
import towered.resources.externals.ExternalPipe;

/**
 * The Class AbstractBase.
 */
public abstract class AbstractBase throws ServiceException, FileNotFoundException {
    
    private HashMap<String, Object> services;
    private Logging logger;
    
    /**
     * Instantiates a new abstract base.
     */
    public AbstractBase() {
        this.services = new HashMap<String, Object>();
    }
    
    public void addService(String serviceName, Object service) {
        this.services.put(serviceName, service);
    }
    
    public Object get(String serviceName) {
        try {
            
            if(this.services.get(serviceName) == null) {
                throw new ServiceException();
            }
            
        } catch(ServiceException sEx) {
            sEx.throwException(message)
            
        }
    }
    
    /**
     * Gets the external pipe instance.
     *
     * @return the external pipe instance
     */
    public ExternalPipe getExternalPipeInstance() {
        return new ExternalPipe();
    }

}
