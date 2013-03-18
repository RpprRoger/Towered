package towered.core.factories;

import java.awt.DisplayMode;
import java.util.HashMap;
import java.util.Map;

import towered.core.GameKeys;
import towered.core.Logger;
import towered.core.Settings;

// TODO: Convert serialisation to use yaml parsers.
/**
 * A factory for creating Settings objects.
 */
public class SettingsFactory {
    
    /**
     * Creates a new Settings object.
     *
     * @param difficulty the difficulty
     * @param fullscreen the fullscreen
     * @param resolution the display mode to use
     * @param keys the keys
     * @return the settings
     */
    public static Settings createSettings(
            double difficulty, 
            boolean fullscreen, 
            DisplayMode resolution, 
            GameKeys keys) {
        
        Settings s = new Settings();
        
        s.setDifficulty(difficulty)
            .setFullscreen(fullscreen)
            .setResolution(resolution)
            .setKeys(keys);

        return s;        
    }
    
    /**
     * Settings object HashMap array.
     *
     * @param settings the settings
     * @return the hash map
     */
    public static HashMap<String, String> toHashMap(Settings settings) {
        HashMap<String, String> settingsMap = new HashMap<String, String>();
        
        settingsMap.put("difficulty", 
                String.valueOf(
                        settings.getDifficulty()));
        
        settingsMap.put("keys", 
                toString(
                        settings.getKeys()));
        
        settingsMap.put("resolution", 
                toString(
                        settings.getResolution()));
        
        settingsMap.put("fullscreen", 
                String.valueOf(
                    settings.isFullscreen()));
        
        return settingsMap;
    }
    
    /**
     * From hash map.
     *
     * @param hashMap the hash map
     * @return the settings
     */
    public static Settings fromHashMap(HashMap<String, String> hashMap) {
        
        return createSettings(
                Double.valueOf(hashMap.get("difficulty")),
                Boolean.valueOf(hashMap.get("fullscreen")),
                displayModeFromString(hashMap.get("resolution")),
                keysFromString(hashMap.get("keys")));       
        
    }
    
    /**
     * Display mode from string.
     * In the format (width, height, bitDepth, refreshrate)
     *
     * @param subject the subject
     * @return the display mode
     */
    public static DisplayMode displayModeFromString(String subject) {
        String[] data = subject.split(",");
        
        if(data.length == 4) {
            
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
            .setResolution(
                    new DisplayMode(600, 600, 16, 60)
            )
            .setKeys(new GameKeys(new String[]{
                    "left:1",
                    "right:2",
                    "jump:3"
            }));

        return s;
    }
    
    /**
     * Display mode to string.
     *
     * @param subject the subject
     * @return the string
     */
    public static String toString(DisplayMode subject) {
        return String.format(
                "%s,%s,%s,%s",
                subject.getWidth(),
                subject.getHeight(),
                subject.getRefreshRate(),
                subject.getBitDepth()
        );
    }

    /**
     * To string.
     *
     * @param keys the keys
     * @return the string
     */
    public static String toString(GameKeys keys) {

        String[] settingStrings = new String[keys.size()];
        int i = 0;
        
        for(Map.Entry<String, Integer> entry : keys.entrySet()) {
            
            String name = entry.getKey();
            
            String keyCode = "" + entry.getValue();
            
            settingStrings[i] = String.format("%s:%s", name, keyCode);
            
            i++;
        }

        return UtilFactory.joinArray(settingStrings, ",");
        
    }
    
    /**
     * From string.
     *
     * @param keyHashMap the key hash map
     * @return the keys
     */
    public static GameKeys keysFromString(String keyHashMap) {
            
        String[] keys = keyHashMap.split(",");
        
        return new GameKeys(keys);
    }
    
}