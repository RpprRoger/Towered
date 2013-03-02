/**
 * @author Robert
 */
package towered.core;

import java.awt.DisplayMode;

/**
 * @author Robert
 * TODO: is this required? Isn't displaymode better, or extend dm and add to string and from string.
 */
public class Resolution {

    /**
     * Generated serialVersionUID
     */
    private static final long serialVersionUID = 2962767746398723223L;
    
    private DisplayMode displayMode;
    
    public Resolution() {
        this.displayMode = new DisplayMode(0, 0, 0, 0);
    }
    
    public DisplayMode g() {
        return this.displayMode;
    }
    
}
