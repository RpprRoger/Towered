package towered.core;

import java.awt.Graphics2D;

import towered.core.services.Services;

// TODO: Auto-generated Javadoc
/**
 * The Class Core.
 */
public abstract class Core {

    /**
     * The Constant ONE_SECOND and ONE_MSECOND, for one second and one
     * millisecond in nanoseconds.
     */
    private static final long 
        ONE_SECOND  = 1000000000,
        ONE_MSECOND = 1000000;

    /** The running. */
    private boolean running;
    
    /** The services. */
    private Services services;

    /**
     * Instantiates a new core.
     */
    public Core() {
        setServices(new Services());
    }
    
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
        Logger.info("Game launched!");

        // Get a hashmap of resources from towered.resources.*
        // Foo

        // Launch screen
        getServices().screen.init(
                getServices().settings.get()
                    .getResolution());

        return this;
    }

    /**
     * Game loop.
     */
    public void gameLoop() {

        final int TARGET_FPS = 60; // TODO: Change this variable refresh rate.
        final long OPTIMAL_TIME = ONE_SECOND / TARGET_FPS;
        
        long 
            loopStartTime = System.nanoTime(),
            lastFpsTime = 0;
        
        int fps = 0;

        ScreenManager screen = getServices().screen;
        
        // keep looping round til the game ends
        while (isRunning()) {
            // work out how long its been since the last update, this
            // will be used to calculate how far the entities should
            // move this loop
            long 
                now = System.nanoTime(),
                updateLength = now - loopStartTime;

            loopStartTime = now;
            double delta = updateLength / ((double) OPTIMAL_TIME);

            // update the frame counter
            lastFpsTime += updateLength;
            fps++;

            // update our FPS counter if a second has passed since
            // we last recorded
            if (lastFpsTime >= ONE_SECOND) {
                System.out.println("(FPS: " + fps + ")");
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
            try {
                // System.out.println(String.valueOf((loopStartTime - System.nanoTime()) / ONE_MSECOND));
                Thread.sleep((loopStartTime - System.nanoTime() + OPTIMAL_TIME) / ONE_MSECOND);
            } catch (Exception e) {
                // e.printStackTrace(); TODO: Need to investigate why the result is sometimes negative
            }
        }
    }

    /**
     * Update.
     * 
     * @param delta the delta
     */
    public abstract void update(double delta);

    /**
     * Draw.
     * 
     * @param g the g
     */
    public abstract void draw(Graphics2D g);

    /**
     * Gets the services.
     *
     * @return the services
     */
    public Services getServices() {
        return services;
    }

    /**
     * Sets the services.
     *
     * @param services the services to set
     * @return the core
     */
    public Core setServices(Services services) {
        this.services = services;
        return this;
    }
}