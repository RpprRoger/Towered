/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
package towered.core;

import java.util.HashMap;
import java.util.Map;

import towered.core.exceptions.KeyNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Class Keys.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 10 Mar 2013
 * @project Towered
 */
public class Keys extends HashMap<String, Integer> {
    
    /**
     * Instantiates a new keys.
     *
     * @param keyPairs the key pairs
     */
    public Keys(String... keyPairs) {
        
        for(int i = 0; i < keyPairs.length; i++) {
            
            String key = keyPairs[i].split(".")[0];
            
            int keyCode = Integer.parseInt(keyPairs[i].split(".")[1]);
            
            put(key, keyCode);
            
        }
        
    }
    
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
