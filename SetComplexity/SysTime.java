package SetComplexity;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SysTime {
	public static int count=0;
	
	  public static String time () {
		  count++;
	        Calendar cal = Calendar.getInstance();
	                        //1000 milliseconds is one second.

	        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	       String val= String.valueOf(sdf.format(cal.getTime()) )+"_"+String.valueOf(count);
	        
	      return( String.valueOf(sdf.format(cal.getTime()))) ;

	    }

}
