package idynomicsJgap;

	import java.awt.*;
	import java.awt.font.*;
	import java.awt.geom.*;
import java.awt.image.BufferedImage;

import javax.swing.*;

import Constatnts.JgapConstants;

import javax.imageio.ImageIO;
	import java.io.File;
import java.io.IOException;
import java.awt.Graphics2D;


	class ImageSmoothener {
		public static void main(String args[]) throws IOException
		{
		File file =new File("C:\\Users\\Honey\\Desktop\\0.png");
		BufferedImage bufferedImage=ImageIO.read(file);
		BufferedImage bufferedIm = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(),
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D graphics = bufferedIm.createGraphics();
		graphics.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setPaint(Color.green);
		graphics.fillOval(10, 10, 50, 50);
		graphics.dispose();

		ImageIO.write(bufferedImage, "png", new File("C:\\Users\\Honey\\Desktop\\r"));
	
	    
	}

	}
