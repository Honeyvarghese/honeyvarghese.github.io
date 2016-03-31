package idynomicsJgap;

import java.io.FileWriter;

import SetComplexity.SetComplexityFinder;

public class GAExperiments {
	
	public static void main(String args[]) throws Exception
	{
	//	SetComplexityFinder s=new ();
		//System.out.println(s.calcuate());
		//WriteToFile.write("SetComplexity: "+s.calcuatSetComplexityFindere());
		
		SetComplexityOfKnownFiles S1=new SetComplexityOfKnownFiles();
		WriteToFile.write("SetComplexity: "+S1.calcuate());
		
		
	}

}
