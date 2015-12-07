package idynomicsJgap;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	//public static void main(String[] args) throws IOException {

		public static void write(String value) throws IOException {
		File file = new File("Memmory");
		String text = "Hello world";
		BufferedWriter output = null;

		output = new BufferedWriter(new FileWriter(file, true));
		output.write(value);
		output.write("\r\n");
		output.close();

	}

}
