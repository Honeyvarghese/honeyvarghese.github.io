package SetComplexity;

import java.io.IOException;
import java.io.PrintWriter;

public class POVRayExecution {
	// public static void povfileE(String args[]) throws IOException
	public static void executer(String a) throws IOException, InterruptedException {
		/*
		 * System.setProperty("user.dir",
		 * "C:\\Program Files\\POV-Ray\\v3.7\\bin");
		 * 
		 * Runtime rt = Runtime.getRuntime();
		 * 
		 * rt.exec(new String[]{"cmd.exe","/c",
		 * "pvengine.exe ,/EXIT /RENDER \"  D:\\iDynomics\\resultss\\Contact(20151014_1750)\\povray\\it(900).pov \" "
		 * });  
		 */

		// String a=
		// "D:\\iDynomics\\resultss\\Contact(20151014_1750)\\povray\\it(100).pov";
		// String a
		// ="D://DelinResultImages//Contact(20151031_1017)//povray//it(020).pov";

		String filename = "\"" + a + "\"";

		String[] command1 = {

				"C:\\Program Files\\POV-Ray\\v3.7\\bin\\pvengine.exe", "/EXIT", "/RENDER", filename, };
		Process process = Runtime.getRuntime().exec(command1);
		while(process.isAlive());
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		String a = "D://DelinResultImages//Contact(20151031_1017)//povray//it(3180).pov";
		executer(a);
	}
}
