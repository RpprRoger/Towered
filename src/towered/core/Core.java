package towered.core;

import java.awt.Graphics2D;

import towered.core.factories.SettingsFactory;
import towered.core.services.ScreenManager;

// TODO: Auto-generated Javadoc
/**
 * The Class Core.
 */
public abstract class Core extends AbstractBase {

    /** The settings. */
    private Settings settings;
    
    /** The running. */
    private boolean running;
    
    /**
     * Start.
     *
     * @return the core
     */
    public Core start() {
        running = true;
        
        return this;
    }
    
    /**
     * Exit.
     *
     * @return the core
     */
    public Core exit() {
        running = false;
        
        return this;
    }
    
    /**
     * Checks if is running.
     *
     * @return true, if is running
     */
    public boolean isRunning() {
        return running;
    }
    
    /**
     * Inits the.
     *
     * @return the core
     */
    public Core init() {
        // Do some foo 
        // Launch window
        Logger.info("Game launched!");
        
        setSettings(SettingsFactory.instantiateDefaultSettings());
        
        getScreenManager().init(settings);
        
        return this;
    }
    
    /**
     * Game loop.
     */
    public void gameLoop() {
       long lastLoopTime = System.nanoTime(),
            lastFpsTime = 0;
       int fps = 0;
       ScreenManager screen = getScreenManager();
       final int TARGET_FPS = 60;
       final long OPTIMAL_TIME = 1000000000 / TARGET_FPS;

       // keep looping round til the game ends
       while (isRunning()) {
          // work out how long its been since the last update, this
          // will be used to calculate how far the entities should
          // move this loop
          long now = System.nanoTime();
          long updateLength = now - lastLoopTime;
          lastLoopTime = now;
          double delta = updateLength / ((double)OPTIMAL_TIME);

          // update the frame counter
          lastFpsTime += updateLength;
          fps++;
          
          // update our FPS counter if a second has passed since
          // we last recorded
          if (lastFpsTime >= 1000000000) {
             System.out.println("(FPS: "+fps+")");
             lastFpsTime = 0;
             fps = 0;
          }
          
          // update the game logic
          update(delta);
          
          // draw everyting
          Graphics2D graphics = screen.getGraphics();
          draw(graphics);
          graphics.dispose();
          screen.update();
          
          // we want each frame to take 10 milliseconds, to do this
          // we've recorded when we started the frame. We add 10 milliseconds
          // to this and then factor in the current time to give 
          // us our final value to wait for
          // remember this is in ms, whereas our lastLoopTime etc. vars are in ns.
          try{
              Thread.sleep(
                      (lastLoopTime - System.nanoTime() + OPTIMAL_TIME) / 1000000
              );
          } catch(Exception e) {
              e.printStackTrace();
          }
       }
    }
    
    /**
     * Update.
     *
     * @param timePassed the time passed
     */
    public abstract void update(double delta);
    
    /**
     * Draw.
     *
     * @param g the g
     */
    public abstract void draw(Graphics2D g);

    /**
     * Gets the settings.
     *
     * @return the settings
     */
    public Settings getSettings() {
        return this.settings;
    }

    /**
     * Sets the settings.
     *
     * @param settings the settings to set
     * @return the core
     */
    public Core setSettings(Settings settings) {
        this.settings = settings;
        return this;
    }
}