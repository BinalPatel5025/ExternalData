package data;

import org.apache.log4j.Logger;

public class LoggingExample {

	public static void main(String[] args) {
		
		//add logj.jar to the project - to build path
		//copy log4j.properties directly to src folder
		//create the object of Logger in the code
		
		Logger print = Logger.getLogger("devpinoyLogger");
		
		print.debug("Hello");//same as System.out.println();
		print.debug("We are writing into log File");
		print.debug("Starting the test case 1");
		print.debug("Starting the test case 2");
		print.debug("Binal");
		
		

	}

}
