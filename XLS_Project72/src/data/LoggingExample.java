package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//Generating log file
		//add log4j.jar to the project - to build path 
		//copy log4j.properties directly inside the src folder
		//create the object of Logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		print.debug("hello");//system.outprintln("hello")
		print.debug("We are writing in to a log file");//system.out.println("We are writting to a log file");
		print.debug("starting the test case xyz test");
		print.debug("starting the test case xyz test1");
		
		
		
	}

}
