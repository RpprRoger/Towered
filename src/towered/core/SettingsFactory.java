/**
 * Robert Preus-MacLaren
 */
package towered.core;

/**
 * A factory for creating Settings objects.
 */
public class SettingsFactory extends AbstractBase {
    
    /** The path. */
    private String path;
    
    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings() {
        return new Settings();
    }
    
}