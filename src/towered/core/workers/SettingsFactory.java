package towered.core.workers;

import towered.core.Resolution;
import towered.core.Settings;
import towered.core.services.Service;

/**
 * A factory for creating Settings objects.
 */
public class SettingsFactory extends Service {
    
    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public static Settings getSettings() {
        // Before we get and set in file system lets use a default.

        return instantiateDefaultSettings();
    }
    
    /*
     * Private helper functions
     *====================================*/
    
    private static Settings instantiateDefaultSettings() {
        Settings s = new Settings();
        
        s.setDifficulty(0.5)
            .setFullscreen(false)
            .setJump(1) // Er space key? TODO: need to get the key numbers for keys..
            .setLeft(2) // left arrow
            .setRight(3) // right arrow
            .setResolution(new Resolution());

        return s;
    }
    
}