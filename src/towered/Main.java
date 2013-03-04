package towered;

import towered.game.Towered;

public class Main {
    
    /** The debug. */
    public static boolean DEBUG = true;
    /** The window. */
    public static final String WINDOW = "Towered";
    /** The version. */
    public static final String VERSION = "v0.1";
    
    /**
     * Main method.
     * 
     * This is where command line arguments are parsed.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        
        Towered t = new Towered();
        
        t.run();
        
        System.exit(0);
    }
}