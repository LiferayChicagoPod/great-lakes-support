package main;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.Scanner;


/**
 * This class is the parent class for the time tracker
 * @author jmann
 */

public abstract class CPTimeTracker {

	/**
	 * Start Time Tracker.
	 */
		/**
	 * This provides transition text for easier reading
	 */
	public static void transitionText() {
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Press 'Enter' to continue");
		scan.nextLine();
		
	}

	public static void main(String[] args) {

		//Tracker running
		boolean endTracker = false;


		//Welcome Text
        System.out.println("------------------------------------------------------------");
        System.out.println("");
        System.out.println("Welcome to the Chicago Pod Time Tracker! What would you like to do today?");
        transitionText();

        //temporary loop counter, replace with exit function feature
       	int counter = 0;

        while(!endTracker){
        	System.out.println("1: Start Timer");
        	System.out.println("2: Print Current Timestamp");
        	System.out.println("3: Exit Time Tracker");
        	System.out.println("");
        	System.out.println("Please enter one of the options");
        	
        	
        	System.out.println("repeat");
        	counter++;
        	if(counter == 1){
        		endTracker = true;
        	}
        }
		//Starting Menu asking what to do
			//start/stop tracking time
				//start time
				//stop time
				//record current time block
			//record/print current time stamp
			//exit program

	};
	

}