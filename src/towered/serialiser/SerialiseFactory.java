/**
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 7 Mar 2013
 * @project Towered
 */
package towered.serialiser;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

import towered.core.GameKeys;
import towered.core.exceptions.SerialiseBufferedImageException;
import towered.core.factories.UtilFactory;

// TODO: Auto-generated Javadoc
/**
 * This classes job is to convert objects into arrays
 * of objects which can be serialised and written on
 * output streams.
 * 
 * @author Robert Preus-MacLaren <rpprroger@gmail.com>
 * @created 7 Mar 2013
 * @project Towered
 */
public class SerialiseFactory {
    
    /**
     * Write buffered image to the output
     * stream. The data is written the following 
     * format: 
     * header   : TODO: use enum to hold header data.
     *
     * @param objectOS the object out stream
     * @param subject the BufferedImage
     */
    public static void writeBufferedImage(ObjectOutputStream objectOS, BufferedImage subject) {
        
        int width = subject.getWidth(),
                height = subject.getHeight();
        int[] image = SerialiseFactory.getIntArray(subject);
        
        try {
            objectOS.writeObject(
                    Type.SERIALISE_START);
            // * TODO: create some sort of header object to store this crap.
            objectOS.writeObject(
                    Type.SERIALISE_BUFFERED_IMAGE);
            
            objectOS.writeInt( // Start with width
                    width);
            
            objectOS.writeInt( // then the height
                    height);
            
            objectOS.writeObject( // then the object
                    image);
            
            objectOS.writeObject(
                    Type.SERIALISE_END);
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            throw new SerialiseBufferedImageException();
        }
    }
    
    /**
     * Converts buffered image to int array.
     * 
     * We make the assumption that buffered image has
     * an alpha channel. This is mainly here as a test,
     * this will be used to write data for the map editor.
     * 
     * TODO: Look into directly accessing the int argb
     * values of each pixel. Possible speed increase
     * 
     * @param subject the BufferedImage to convert
     * @return the int[] array of pixel colour
     */
    public static int[] getIntArray(BufferedImage subject) {
        
        int[] image = null;
        
        image = subject.getRaster()
                .getPixels(0, 0, subject.getWidth(), subject.getHeight(), image);
        
        return image;
        
    }
    
    /**
     * Gets the buffered image from the pixels passed.
     *
     * @param width the width
     * @param height the height
     * @param pixels the pixels
     * @return the buffered image
     */
    public static BufferedImage getBufferedImage(int width, int height, int[] pixels) {
        
        BufferedImage imageOut = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        
        imageOut.getRaster().setPixels(0, 0, width, height, pixels);
        
        return imageOut;
    }
    
}
