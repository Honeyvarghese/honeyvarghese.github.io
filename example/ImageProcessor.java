package example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import idynomicsJgap.ConvolveFilter;
import idynomicsJgap.GaussianFilter;

public class ImageProcessor
{
	public static void main(String args[]) throws IOException
	{
		GaussianFilter cv= new GaussianFilter();
		File sfile = new File("C:\\Users\\Honey\\Desktop\\Imageblur\\3.png");
		
		File ddfile = new File("C:\\Users\\Honey\\Desktop\\Imageblur\\1b.png");
		File dddfile = new File("C:\\Users\\Honey\\Desktop\\Imageblur\\1bb.png");

		BufferedImage src= ImageIO.read(sfile);

		
		BufferedImage dst= ImageIO.read(sfile);
		dst=cv.filter(src, dst);
		ImageIO.write(dst, "png",ddfile );
		BufferedImage dst1 = cv.filter(dst, dst);

	dst1=	cv.filter(cv.filter(cv.filter(cv.filter(src, dst), dst), dst), dst1);
		

	ImageIO.write(dst1, "png",dddfile );

		
	}
}