/**
 * @author Robert
 */
package towered.core;

import java.awt.Rectangle;

/**
 * @author Robert
 * TODO: is this required? Isn't displaymode better, or extend dm and add to string and from string.
 */
public class Resolution extends Rectangle {

    /**
     * Generated serialVersionUID
     */
    private static final long serialVersionUID = 2962767746398723223L;

    public Resolution(int width, int height) {
        // Can't remember if the screen auto draws to the center, I'll write this anyway
        super(0, 0, width, height);
    }
}
