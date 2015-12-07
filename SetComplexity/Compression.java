package SetComplexity;


import java.io.*;
import java.util.*;
import java.awt.Graphics2D;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;
import javax.imageio.plugins.jpeg.JPEGImageWriteParam;


public class Compression
{
public static void compression(String imagePath,String initialFilename,String OutputFilePathName)
throws IOException
{
	
	// 
	 
	String OutputFilePath=OutputFilePathName+"//"+initialFilename;
	 

	//System.out.println ("pp"+OutputFilePath);


	//OutputFilePath=OutputFilePath+initialFilename;
	//System.out.println (OutputFilePath);

	
Iterator writers;
BufferedImage bufferedImage;
ImageOutputStream imageOutputStream;
ImageWriter imageWriter;
ImageWriteParam pngparams;
 
bufferedImage = ImageIO.read(new File(imagePath));
BufferedImage bufferedIm = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),   BufferedImage.TYPE_BYTE_BINARY);
Graphics2D graphics = bufferedIm.createGraphics();
graphics.drawImage(bufferedImage, 0, 0, null);

ImageIO.write(bufferedIm, "png", new File(OutputFilePath)); 
// 


//----------------------only second time needed
// 


// Get all the PNG writers
/*writers = ImageIO.getImageWritersByFormatName( "png" );
// 


// Fetch the first writer in the list
imageWriter = (ImageWriter) writers.next();

// Just to confirm that the writer in use is CLibPNGImageWriter
 

// Specify the parameters according to those the output file will be written

// Get Default parameters
pngparams = imageWriter.getDefaultWriteParam();

//Define compression mode
//pngparams.setCompressionMode( javax.imageio.ImageWriteParam.MODE_EXPLICIT );

// Define compression quality
//pngparams.setCompressionQuality( 0.6F );

// Define progressive mode
pngparams.setProgressiveMode( javax.imageio.ImageWriteParam.MODE_COPY_FROM_METADATA );

// Deine destination type - used the ColorModel and SampleModel of the Input Image
pngparams.setDestinationType(
new ImageTypeSpecifier( bufferedImage.getColorModel(), bufferedImage.getSampleModel() ) );

// Set the output stream to Second Argument
//imageOutputStream = ImageIO.createImageOutputStream( new FileOutputStream(args[1]) );
//String OutputFilePath="D://CompressedImages//";
//String OutputFilePath=OutputFilePathName+"//";
//System.out.println ("pp"+OutputFilePath);


//OutputFilePath=OutputFilePath+initialFilename;
//System.out.println (OutputFilePath);

imageOutputStream = ImageIO.createImageOutputStream( new FileOutputStream(OutputFilePath) );

imageWriter.setOutput( imageOutputStream );
//BufferedImage bufferedImag = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),   BufferedImage.TYPE_BYTE_BINARY);


// Write the changed Image
imageWriter.write( null, new IIOImage( bufferedIm, null, null ), pngparams );

// Close the streams
imageOutputStream.close();
imageWriter.dispose();
}*/
}}