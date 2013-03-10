package towered.core.factories;

import java.awt.DisplayMode;
import java.util.HashMap;

import towered.core.Logger;
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
     * @param resolution the display mode to use 
     * @return the settings
     */
    public static Settings createSettings(
            double difficulty, boolean fullscreen, int jump, int left, int right, DisplayMode resolution) {
        Settings s = new Settings();
        
        s.setDifficulty(difficulty)
            .setFullscreen(fullscreen)
            .setJump(jump) // Er space key? TODO: need to get the key numbers for keys..
            .setLeft(left) // left arrow
            .setRight(right) // right arrow
            .setResolution(resolution);

        return s;        
    }
    
    /**
     * Serialize.
     *
     * @param settings the settings
     * @return the string
     */
    public static String serialize(Settings settings) {
        
        return "";
    }
    
    /**
     * Settings object HashMap array.
     *
     * @param settings the settings
     * @return the hash map
     */
    public HashMap<String, String> toHashMap(Settings settings) {
        HashMap<String, String> settingsMap = new HashMap<String, String>();
        
        settingsMap.put("", "");
        
        return settingsMap;
    }
    
    /**
     * Display mode to string.
     *
     * @param subject the subject
     * @return the string
     */
    public String toString(DisplayMode subject) {
        return String.format(
                "(%s,%s,%s,%s)",
                subject.getWidth(),
                subject.getHeight(),
                subject.getRefreshRate(),
                subject.getBitDepth()
        );
    }
    
    /**
     * Display mode from string.
     * In the format (width, height, bitDepth, refreshrate)
     *
     * @param subject the subject
     * @return the display mode
     */
    public DisplayMode displayModeFromString(String subject) {
        String[] data = subject.split(",");
        
        if(subject.matches("^\\([0-9]+,[0-9]+,[0-9]+,[0-9]+\\)$") && data.length == 4) {
            
            return new DisplayMode(
                    Integer.valueOf(data[0]),
                    Integer.valueOf(data[1]),
                    Integer.valueOf(data[2]),
                    Integer.valueOf(data[3]));
            
        }
        
        Logger.info("Failed to convert String to DisplayMode.");
        
        return new DisplayMode(0, 0, 0, 0);
    }
    
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