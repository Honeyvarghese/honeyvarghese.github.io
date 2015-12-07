/*package SetComplexity;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.stream.ImageOutputStream;

import Constatnts.JgapConstants;

public class SetComplex {
	
	
	public static void main(String args[]) throws InterruptedException, IOException{
	//povTopng.converter();
	PNGFilesCompressor.compressor(JgapConstants.FILE_PATH,JgapConstants.COMPRESSED_IMAGE_FILE_PATH);
	//joinImage-write-cpopulate
		//below step not necssary-sinc already in png 
	//PNGFilesCompressor.compressor(JgapConstants.COMBINED_IMAGE_FILE_PATH+"//",JgapConstants.COMBINED_COMPRESSED_IMAGE_FILE_PATH);//populate ccvalue
  // FLANN COMMENT  create a n by n array, precompute the NCD[i,j] from the copression sizes of the images
    

	int n=4;
	double k=1/n*(n-1);
	
	//ccValuePopulater();
	//cValuePopulater();

	

}
	
	static void ccValuePopulater() throws IOException{
		 final File dir = new File(JgapConstants.COMBINED_COMPRESSED_IMAGE_FILE_PATH);
   	           if (dir.isDirectory()) { // make sure it's a directory
	            for (final File f : dir.listFiles()) {
	        		ccValue.put(f.getName(), f.length());
	        		 
    	           
		
	}}}
	static void cValuePopulater() throws IOException{
		 final File dir = new File(JgapConstants.COMPRESSED_IMAGE_FILE_PATH);
  	           if (dir.isDirectory()) { // make sure it's a directory
	            for (final File f : dir.listFiles()) {
	        		cValue.put(f.getName(), f.length());
	        		 

   	           
		
	}}}
	
	// precoompute the NCD for all pairs
	 moving window set complexity
	 * for t from 0 to image.count()-4
	 *    setC[t] = setComplexity(t)
	 *        
	 * setComplexity (t)
	 * 
	 *   
	 *    
	 * 
	 *        
	 

}*/