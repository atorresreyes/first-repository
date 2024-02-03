package com.promineotech;

import java.util.Scanner;

public class W4Project {

	public static void main(String[] args) {

		/*
		 * 
		 * 
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 */ 
		  int[] ages = {3 , 9 , 23 , 64 , 2 , 8 , 28 , 93};
		 
				 /* a. Programmatically subtract the value of the first element in the array from
				 * the value in the last element of the array (i.e. do not use ages[7] in your
				 * code). Print the result to the console.
				 */
		  		System.out.print("1a: ");
		  		System.out.println(ages[ages.length - 1] - ages[0]); 
		  			//array.length - 1 will always be the last index in the array since the array is 0 based
		  
				 /* b. Create a new array of int called ages2 with 9 elements (ages2 will be
				 * longer than the ages array, and have more elements).
						 * 
						 * i. Make sure that there are 9 elements of type int in this new array.
						 * 
						 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
						 * value of the first element in the new array ages2 from the last element of
						 * ages2).
						 * 
						 * iii. Show that using the index values for the elements is dynamic (works for
						 * arrays of different lengths).
						 */
		  		int[] ages2 = { 3 , 5 , 7 , 9 , 10 , 30 , 50 , 60 , 100};
		  		System.out.print("1b: ");
		  		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		  			//array.length - 1 will always be the last index in the array since the array is 0 based
		  		
				 /* 
				 * c. Use a loop to iterate through the array and calculate the average age.
				 * Print the result to the console.
				 */
		  		int sum = 0;
		  		for (int age : ages) {
		  			sum += age;
		  		}
		  		int averageAge = sum / ages.length;
		  			//here we need the length of the array to find the number of elements, 
		  			//not the index of where the last element is , so we do not -1 from length
		  		
		  		System.out.print("1c: ");
		  		System.out.println(averageAge);
		/* 
		 * 
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		  	String[] names = {"Sam" , "Tommy" , "Tim" , "Sally" , "Buck" , "Bob"};
				 /* a. Use a loop to iterate through the array and calculate the average number
				 * of letters per name. Print the result to the console.
				 */
		  		int sumNames = 0;
		  		for (String name : names) {
		  			sumNames += name.length(); //for each name, we add the length of the name to sumNames
		  		}
		  		int averageLength = sumNames / names.length; //divide by the number of names to find average
		  		System.out.print("2a. ");
		  		System.out.println(averageLength);
		  		
				 /* b. Use a loop to iterate through the array again and concatenate all the
				 * names together, separated by spaces, and print the result to the console.
				 */
		  		StringBuilder allNames = new StringBuilder(); //using StringBuilder to practice using StringBuilder
		  		for (String name : names) {
		  			allNames.append(name + " ");
		  		}
		  		System.out.print("2b. ");
		  		System.out.println(allNames.toString()); //convert StringBuilder to String
		  
		 // 3. How do you access the last element of any array?
		  		System.out.println("3.  names[names.length - 1]"); //array.length - 1 will always be the last index in the array since the array is 0 based
		  		System.out.println("    Output: " +  names[names.length - 1]);
		 
		 // 4. How do you access the first element of any array?
		  		System.out.println("4.  names[0]"); //array is 0 based so the first element will always be at 0
		  		System.out.println("    Output: " +  names[0]);
		 
		 /* 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */
		  	int[] nameLengths = new int[names.length];
		  	for (int i = 0; i < names.length; i++) {
		  		nameLengths[i] = names[i].length(); //puts all the lengths into the array
		  	}
		  	StringBuilder nameLengthsPrint = new StringBuilder(); //using StringBuilder to practice using StringBuilder
		  	for (int length : nameLengths) {
		  		nameLengthsPrint.append(length + " "); //puts the array elements into the String so we can print them
		  	}
		  	System.out.print("5.  nameLengths = ");
		  	System.out.println(nameLengthsPrint.toString()); //convert StringBuilder to String
		  	
		 /* 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		  	int sumLengths = 0;
		  	for (int nameLength : nameLengths) {
		  		sumLengths += nameLength; // for each element, we add it to sumLengths to find the total sum
		  	}
		 	System.out.print("6.  nameLengths sum = ");
		  	System.out.println(sumLengths);
		  	
		 /* 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */ 
		  	
		  	System.out.print("7.  wordTimesNum = ");
		  	System.out.println(wordTimesNum("Hello", 3)); //calling on the method
		  
		  	
		 /* 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */
		  	String firstName = "Norm";
		  	String lastName = "Umane";
		  	System.out.print("8.  Full Name: ");
		  	System.out.println(makeFullName(firstName, lastName));
		  	
		  	/* 
		 * 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */
		  	System.out.print("9.  Sum Greater than 100?: ");
		  	System.out.println(isGreaterThan100(ages)); 
		  	
		 /* 10. Write a method that takes an array of double and returns the average of
		 * all the elements in the array.
		 */
		  	double[] arr = {1.2 , 2.3 , 4.5 , 6.7 , 8.9 , 0.01};
		  	System.out.print("10. Average of Double: ");
		  	System.out.printf("%.3f %n" , findsAverage(arr)); //printing out the average up to 3 points and 
		  	
		 /* 
		 * 11. Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */ 
		  	double[] arr2 = {0.9 , 8.7, 6.5, 4.3 , 2.1}; 
		  	System.out.print("11. First is Greater: ");
		  	System.out.println(oneIsGreater(arr, arr2)); 
		  	
		  	
		 /* 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		 * a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */
		  	Boolean isHotOutside = true; 
		  	double moneyInPocket = 15.75;
		  	System.out.print("12. I will buy a nice drink today: ");
		  	System.out.println(willBuyDrink(isHotOutside, moneyInPocket)); 
		  		
		  	
		  	
		  	
		  	System.out.println(); // This Line Has Been Left Intentionally Blank (for spacing) 
		 
		  	
		  	
		 /* 
		 * 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 * 
		 */
		  	//Creating a method that makes an ice cream cone
		  	//Practice using a do while loop, scanner, and looping until getting an acceptable answer from user
		  	//To create a visual for the end of the create ice cream program
		  	
		  	System.out.println("13. Ice Cream time! ");
		  	System.out.println("Hello! You can have up to 3 scoops of ice cream.");
		  	
		  	//Entering ice cream making process
		  	askHowManyScoops();

		  	
		  	
	} // end public static void main

	//Method for 13a
	public static void askHowManyScoops() {
		Scanner sc = new Scanner(System.in); //scanner to ask for user input
	  	System.out.print("How many scoops of ice cream would you like? "); //prompt for user
	  	int scoops = sc.nextInt(); //user enters a number 
	  	if (scoops > 0 && scoops < 4) { //checking to see if number is either 1 , 2 , or 3
	  		System.out.println("Enjoy!"); 
	  		buildIceCream(scoops); //if 1 , 2 , or 3, enter into building Ice Cream method
	  	} else if (scoops > 0 && scoops >= 4) { //if entered 4 or above, remind user it is up to 3
	  		System.out.print("That's too much ice cream! You can have up to ");
	  		System.err.print("3");
	  		System.out.print(" scoops.");
	  		askHowManyScoops(); //loop to ask user again
	  	} else {
	  		System.out.println("Okay, no ice cream. Good Bye!"); //if 0 scoops or below, end program
	  	}
	  	
	}
	
	//Method for 13b
  	public static void buildIceCream(int scoops) {
  		//Cherry on top
	  	System.out.println("      )    ");
	  	System.err.println("     O     ");
	  	System.out.println("     -     ");
  		//Number of scoops
  		int i = 0;
  		do {
		  	System.out.println("   - - -   ");
		  	System.out.println("  - - - -  ");
			System.out.println("   - - -   ");
			i++;
  		} while (i < scoops); //do while loop will always go at least Once , so the scoop will be at least once, until it reaches the number of scoops needed
  		//Cone
	  	System.out.println("   \\###/   ");
	  	System.out.println("    \\#/    ");
	  	System.out.println("     V     "); 
  	}
  	
	//Method for 12
	public static Boolean willBuyDrink(Boolean isHotOutside, double moneyInPocket) {
		Boolean buyDrink;
		if ((isHotOutside == true) && (moneyInPocket > 10.50)) { //testing that BOTH are true
			buyDrink = true;
		} else {
			buyDrink = false;
		}
		return buyDrink;
	}

	//Method for 11
	public static Boolean oneIsGreater(double[] arr, double[] arr2) {
		Boolean isGreater;
		double sum1 = 0;
		double sum2 = 0;
		
		//finding the total sum of each array
		for (double num : arr) {
			sum1 += num;
		}
		for (double num : arr2) {
			sum2 += num;
		}
		//testing to see if sum1 is bigger than sum2 and returning true or false
		if (sum1 > sum2) {
			return isGreater = true;
		} else {
			return isGreater = false;
		}
	}
	
	//Method for 10
	public static double findsAverage(double[] arr) {
		double sum = 0;
		for (double num : arr) { //for each number in our array, adding it to sum
			sum += num;
		}
		double average = sum / arr.length; //sum divided by the length of the array to find the average
		return average;
	}
	
	
	//Method for 9
	public static Boolean isGreaterThan100(int[] ages) {
		Boolean isGreater;
		int sum = 0; 
		for (int age : ages) { // for each age in the array, adding it to sum
			sum += age; 
		}
		if (sum > 100) { //if it is greater than 100, will return true
			isGreater = true;
		} else {
			isGreater = false; //if it is less than 100, will return false
		}
		return isGreater;
	}
	
	
	//Method for 8
	public static String makeFullName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName; 
		return fullName;
	}
	
	
	//Method for 7 
	public static String wordTimesNum(String word, int n) {
		StringBuilder newWord = new StringBuilder();
		for (int i = 0; i < n; i++) { //until loop has gone through n loops, will add the word again
			newWord.append(word);
		}
		
		return newWord.toString();
	}
	

	}// end public class
