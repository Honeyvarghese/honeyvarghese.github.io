
package SetComplexity;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import javax.imageio.ImageIO;

import Constatnts.JgapConstants;

public class PNGFilesCompressor {
	//CHANGE NAME TO COMPRESSION
	
	public static  void compressor(String dirName, String OutputFilePathName) throws InterruptedException
	
	{//povTopng.converter();
	int ImageCount=46;
	double k=1/(ImageCount*(ImageCount-1));
	
	//pngreader
	// File representing the folder that you select using a FileChooser
    final File dir = new File(dirName);

    // array of supported extensions (use a List if you prefer)
    final String[] EXTENSIONS = new String[]{
        "png" // and other formats you need
    };
    // filter to identify images based on their extensions
    final FilenameFilter IMAGE_FILTER = new FilenameFilter() {

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
    
    
    if (dir.isDirectory()) { // make sure it's a directory
        for (final File f : dir.listFiles(IMAGE_FILTER)) {
            BufferedImage img = null;
            String pngFilename;
            try {
                img = ImageIO.read(f);
                pngFilename=dirName+f.getName();
                
                Compression.compression(pngFilename, f.getName(),OutputFilePathName);
                
                //  
               //   

              //   
               //  
               //  
            } catch (final IOException e) {
                // handle errors here
            }
        }


}}}



