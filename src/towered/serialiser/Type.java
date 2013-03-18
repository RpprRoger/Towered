/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 9 Mar 2013
 * @project Towered
 */
package towered.serialiser;

/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 *
 * @created 9 Mar 2013
 *
 * @project Towered
 */
public enum Type {
    
    SERIALISE_START(0x01),
    SERIALISE_END(-1),
    SERIALISE_BUFFERED_IMAGE(1);
    
    private int code;

    private Type(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }

}
