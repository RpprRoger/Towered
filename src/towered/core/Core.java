package towered.core;

import java.awt.Rectangle;

import towered.core.factories.SettingsFactory;

/**
 * The Class Core.
 */
public abstract class Core extends AbstractBase {

    /** The settings. */
    private Settings settings;
    
    private boolean running;
    
    public Core start() {
        running = true;
        
        return this;
    }
    
    public Core exit() {
        running = false;
        
        return this;
    }
    
    public boolean isRunning() {
        return running;
    }
    
    /**
     * 
     */
    public Core init() {
        // Do some foo 
        // Launch window
        Logger.info("Game launched!");
        
        setSettings(SettingsFactory.instantiateDefaultSettings());
        
        getScreenManager().init(settings);
        
        return this;
    }
    
    public void gameLoop() {
        
        while(isRunning()) {
            
            
            getScreenManager().getGraphics().draw(new Rectangle(0, 0, 600, 600));
            
        }
        
    }
    
    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * @param settings the settings to set
     */
    public Core setSettings(Settings settings) {
        this.settings = settings;
        return this;
    }
}