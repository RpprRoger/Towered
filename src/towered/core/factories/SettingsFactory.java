package towered.core.factories;

import java.awt.DisplayMode;

import towered.core.Settings;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Settings objects.
 */
public class SettingsFactory {
    
    /**
     * Creates a new Settings object.
     *
     * @param difficulty the difficulty
     * @param fullscreen the fullscreen
     * @param jump the jump key
     * @param left the left key
     * @param right the right key
     * @param reslution the reslution
     * @return the settings
     */
    public static Settings createSettings(double difficulty, boolean fullscreen, int jump, int left, int right, DisplayMode resolution) {
        Settings s = new Settings();
        
        s.setDifficulty(difficulty)
            .setFullscreen(fullscreen)
            .setJump(jump) // Er space key? TODO: need to get the key numbers for keys..
            .setLeft(left) // left arrow
            .setRight(right) // right arrow
            .setResolution(resolution);

        return s;        
    }
    
    /*
     * Private helper functions
     *====================================*/
    
    /**
     * Instantiate default settings.
     *
     * @return the settings
     */
    public static Settings instantiateDefaultSettings() {
        Settings s = new Settings();
        
        s.setDifficulty(0.5)
            .setFullscreen(false)
            .setJump(1) // Er space key? TODO: need to get the key numbers for keys..
            .setLeft(2) // left arrow
            .setRight(3) // right arrow
            .setResolution(
                    new DisplayMode(600, 600, 16, 60)
            );

        return s;
    }
    
}