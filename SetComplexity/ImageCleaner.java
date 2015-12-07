package SetComplexity;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ImageCleaner {
	 
	public static void clean(String contactpathname)
	{//String filepath = "c:\\folder";
	  // String extension = ".txt";
		
		 // String dir = "C:\\Users\\Honey\\Desktop\\trial";
		String dir =contactpathname;
		   String ext= ".inc";
			
	File source = new File("CleanerHeader");
	File dest = new File(dir);
	try {
		
		new ImageCleaner().deleteFile(dir,ext);

		//FileUtils.forceDelete("C:\\Users\\Honey\\Desktop\\trial\\");
	    FileUtils.copyDirectory(source, dest);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	

}
	
	public void deleteFile(String folder, String ext){
		
	     GenericExtFilter filter = new GenericExtFilter(ext);
	     File dir = new File(folder);
		
	     //list out all the file name with .txt extension
	     String[] list = dir.list(filter);
		     
	     if (list.length == 0) return;

	     File fileDelete;
		    
	     for (String file : list){
	   	String temp = new StringBuffer(folder)
	                      .append("\\")
	                      .append(file).toString();
	    	fileDelete = new File(temp);
	    	boolean isdeleted = fileDelete.delete();
	    	 
	     }
	   }
	  
	   //inner class, generic extension filter 
	   public class GenericExtFilter implements FilenameFilter {
		
	       private String ext;
		
	       public GenericExtFilter(String ext) {
	         this.ext = ext;             
	       }
		       
	       public boolean accept(File dir, String name) {
	         return (name.endsWith(ext));
	       }
	    }
	}

