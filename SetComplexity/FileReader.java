package SetComplexity;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import javax.imageio.ImageIO;
import Constatnts.JgapConstants;
public class FileReader {
	
	    // File representing the folder that you select using a FileChooser
	    static final File dir = new File(JgapConstants.FILE_PATH);

	    // array of supported extensions (use a List if you prefer)
	    static final String[] EXTENSIONS = new String[]{
	        "pov" // and other formats you need
	    };
	    // filter to identify images based on their extensions
	    static final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

	        @Override
	        public boolean accept(final File dir, final String name) {
	            for (final String ext : EXTENSIONS) {
	                if (name.endsWith("." + ext)) {
	                    return (true);
	                }
	            }
	            return (false);
	        }
	    };

	    public static void main(String[] args) throws InterruptedException {

	        if (dir.isDirectory()) { // make sure it's a directory
	            for (final File f : dir.listFiles(IMAGE_FILTER)) {
	                BufferedImage img = null;
                    String povFilename;
	                try {
	                    img = ImageIO.read(f);
	                    povFilename=JgapConstants.FILE_PATH+f.getName();
	                    POVRayExecution.executer(povFilename);
	                    
	                    
	                   //  
	                  //   
	                   //  
	                   //  
	                } catch (final IOException e) {
	                    // handle errors here
	                }
	            }
	        }
	    }
	}



