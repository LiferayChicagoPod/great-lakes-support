 //This is where we'll define the functions and other actions for the TimeTracker project.
 
//CPTimeStamp.java

import java.sql.Timestamp;
import java.time.Instant;

public class CPTimeStamp {
	
	// 2023.08.30.12.14-0700
	//private static final SimpleDateFormat dateAndTimeStamp = new //SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");

	public static void main (String[] args) {

	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	System.out.println(timestamp);
	System.out.println(timestamp.getTime()); 

	Instant instant = timestamp.toInstant();
	System.out.println(instant);

	}
}
