import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		
		//created a blank array with 10 spots
		int[] myArray = new int [10];
		
		/*imported scanner from java.util.
		 *Scanner reads input and categorizes it
		 *(a door to take input from a user)*/
		Scanner s = new Scanner(System.in);
		
		//make a loop that starts at 0 and goes up to and including 9 
		for(int i = 0; i < myArray.length; i++) {
			System.out.print("Number, please: ");
			myArray[i] = s.nextInt();	
			
		} //CLOSES loop
		
		if(hasSeven(myArray))
			System.out.println("This one has seven");
		else
			System.out.println("No seven :-(");
		
		/*
		 * In the console window, input numbers. If they include 7, or if the if
		 * statement evaluates to true, it will print the if statement. If it doesn't
		 * include 7, or if the if statement evaluates to false, it will print the else
		 * statement.
		 */
		
		//no even numbers and all smaller than seven (must be > 7 and odd)
	
} //CLOSES main
	
	//This is a java doc comment
	/**
	 * Checks that the values of the given array are smaller than 7 and are all odd
	 * @param someArray
	 * @return true only if values are odd and less than 7
	 */
	public static boolean notEvenSmallerThanSeven(int[] someArray) { //testing for an error
		//traverse the array:
		for(int i = 0; i < someArray.length; i++) { 
			//test if it's equal to 7:
			if(someArray[i] >= 7 || someArray[i] % 2 == 0) //NOTE: return stops the method
					return false;
				}
				//after checking the whole array
				return true;
		
		
		} //CLOSES hasSeven
	
	
	//creating a new method that returns boolean
	//parameters are instructions. example: "clap x" activity
	//scope: important because it allows us to use i as an integer again.
	//java doc comment only useful if it sits on top of a header:
	/**
	 * Checks to see if any values in given array are equal to 7
	 * @param someArray
	 * @return true if it finds 7 
	 */
	public static boolean hasSeven(int[] someArray) {
		//traverse the array:
		for(int i = 0; i < someArray.length; i++) { 
			//test if it's equal to 7:
			if(someArray[i] == 7) //NOTE: return stops the method
					return true;
			
				//after checking the whole array
			
			}
		return false;
		
		} //CLOSES hasSeven
	
	} //CLOSES CLASS
