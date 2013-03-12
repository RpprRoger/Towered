/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
package towered.core;

import java.util.HashMap;

import towered.core.exceptions.KeyNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class Keys.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
public class GameKeys extends HashMap<String, Integer> {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 6716077170305118680L;

    /**
     * Instantiates a new keys.
     *
     * @param keyPairs the key pairs
     */
    public GameKeys(String... keyPairs) {
        
        for(int i = 0; i < keyPairs.length; i++) {

            String keyPair = keyPairs[i];
            
            Logger.info(keyPair);
            
            if(keyPair.indexOf(":") > 0) {
            
                String key = keyPairs[i].split(":")[0];
                
                int keyCode = Integer.parseInt(keyPairs[i].split(":")[1]);
                
                put(key, keyCode);
                
            }
            
        }
        
    }
    
    public GameKeys() {}
    
    /**
     * Gets the key.
     *
     * @param key the key
     * @return the key
     */
    public int getKey(String key) {
        
        try {
            
            if(!containsKey(key)) {
                throw new KeyNotFoundException(key);
            }
            
            return get(key);
            
        } catch(KeyNotFoundException knfe) {
            
            return get(key);
        }
        
    }
    
    /**
     * Gets the key, if the key doesn't exist
     * we set and get the default.
     * 
     * @param key the key
     * @param defaultKey the default code
     * @return the key
     */
    public int getKey(String key, int defaultKey) {
        
        if(!containsKey(key)) {
            put(key, defaultKey);
            
            return defaultKey;
        }
        
        return get(key);
        
    }

}
