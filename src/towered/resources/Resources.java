/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
package towered.resources;

import towered.core.factories.UtilFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Resources.
 *
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 18 Feb 2013
 * @project Towered
 */
public class Resources {
    
    /** The settings path. */
    private String settingsPath;
    
    /** The external dir. */
    private String externalDir;
    
    /**
     * Instantiates a new resources.
     */
    public Resources() {
        
        settingsPath = String.format("%s%ssettings.conf", 
                UtilFactory.getHomeDirectory(),
                UtilFactory.getSeperator());
        
    }

    /**
     * @return the settingsPath
     */
    public String getSettingsPath() {
        return settingsPath;
    }

    /**
     * @param settingsPath the settingsPath to set
     */
    public Resources setSettingsPath(String settingsPath) {
        this.settingsPath = settingsPath;
        return this;
    }

    /**
     * @return the externalDir
     */
    public String getExternalDir() {
        return externalDir;
    }

    /**
     * @param externalDir the externalDir to set
     */
    public Resources setExternalDir(String externalDir) {
        this.externalDir = externalDir;
        return this;
    }
    
}