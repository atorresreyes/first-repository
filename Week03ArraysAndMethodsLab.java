//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] numbersArray = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(numbersArray[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(numbersArray[numbersArray.length - 1]);
		
		// 4. Print out the element in the array at position 6, what happens?
		//System.out.println(numbersArray[6]);
		//Output: "Index 6 out of bounds for length 6"
		
		// 5. Print out the element in the array at position -1, what happens?
		//System.out.println(numbersArray[-1]);
		//Output: Index -1 out of bounds for length 6
			
		System.out.println(); //blank line
		System.out.println("Question 6:");
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i = 0; i < numbersArray.length; i++) {
			System.out.println(numbersArray[i]);
		}
		
		System.out.println(); //blank line
		System.out.println("Question 7:");
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int number : numbersArray) {
			System.out.println(number);
		}
		
		System.out.println(); //blank line
		System.out.println("Question 8:");
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int number : numbersArray) {
			sum = number + sum;
		}
		
		System.out.println(sum);		
			
		
		System.out.println(); //blank line
		System.out.println("Question 9:");
		// 9. Create a new variable called average and assign the average value of the array to it
		double average = 0;
		double sum2 = 0.0;
		for (int number : numbersArray) {
			sum2 = number + sum2;
		}
		average = sum2 / (numbersArray.length);
		System.out.println(average);
		
		
		System.out.println(); //blank line
		System.out.println("Question 10:");
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int number : numbersArray) {
			if (!(number % 2 == 0)) {
				System.out.println(number);
			}
		}
		
		System.out.println(); //blank line
		System.out.println("Question 11:");
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] firstName = {"Sam" , "Sally" , "Thomas", "Robert"};
		for (String name : firstName) {	
			System.out.println(name);
		}
		
		System.out.println(); //blank line
		System.out.println("Question 12:");
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : firstName) {
			sumOfLetters = name.length() + sumOfLetters;
		}
		System.out.println(sumOfLetters);
		

		//
		// Methods:
		//
		
		System.out.println(); //blank line
		System.out.println("Question 13:");
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		makeGreeting("Thomas");
		
		
		
		System.out.println(); //blank line
		System.out.println("Question 14:");
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		System.out.println(makeGreeting2("Mary"));
		
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		// 			I suppose the first method is less code but it doesn't have a return?
		//				Answer was supposed to be one prints something and the other doesn't? bad answer
		//				but they did also say you can't store a void value so can't say like
		//				String name = makeGreeting; bc it can't convert a Void to a String, that'd be wild
		
		System.out.println(); //blank line
		System.out.println("Question 15:");
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isGreater("Test" , 3)); 
		
		
		
		System.out.println(); //blank line
		System.out.println("Question 16:");
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		String[] listOfNames = {"Thomas" , "Patrick" , "Mary"};
		System.out.println(isContained(listOfNames , "Mary")); // true
		System.out.println(isContained(listOfNames , "Jay")); //false
		
	
		
		System.out.println(); //blank line
		System.out.println("Question 17:");
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		int[] listOfNumbers = { 5 , 8 , 22 , 25 , 26 , 27 , 3 , 10 , 1000 };
		System.out.println(findSmallest(listOfNumbers));
		
		
		
		System.out.println(); //blank line
		System.out.println("Question 18:");
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] arrayOfDouble = { 5.5 , 6.6 , 7.7 , 8.8 , 9.99 };
		findAverage(arrayOfDouble);

		
		System.out.println(); //blank line
		System.out.println("Question 19:");
		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] arrayOfStrings = { "T" , "Te" , "Tes" , "Test" , "Audio" };
		
		for (int number : (findLength(arrayOfStrings))) {
			System.out.println(number);
		}

		
		System.out.println(); //blank line
		System.out.println("Question 20:");		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		String[] arrayOfLongStrings = { "to" , "events" ,"sum" , "of" , "those" , "letters" , "for" , "all" , "strings" , "with" , "even" , "amount" , "than", "ones"};
		System.out.println(evenGreater(arrayOfLongStrings));
		
	
		System.out.println(); //blank line
		System.out.println("Question 21:");	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		System.out.println("Hannah");
		System.out.println(testPalindrome("Hannah"));
		System.out.println(); //blank line
		System.out.println("Hanaenah");
		System.out.println(testPalindrome("Hanaenah"));
		System.out.println(); //blank line
		System.out.println("Racecar");
		System.out.println(testPalindrome("Racecar"));
		
		
		

		
		
	}

	








	// Method 13:
	public static void makeGreeting(String name) {   
		System.out.println("Hello, " + name + "!");
		
	}

	// Method 14:
	public static String makeGreeting2(String name) {
		String greeting = "Hi there, " + name + "!";	
		return greeting;
	}
	
	// Method 15:
	public static Boolean isGreater(String word, int i) {
		Boolean isGreater =  word.length() > i;
		return isGreater;
	}	
	
	// Method 16:

	public static Boolean isContained(String[] list, String wordTest) {
		int i = 0;
		Boolean isPresent = false;
		while ((i < list.length) && (isPresent == false)) {
			if (list[i].equals(wordTest)) {
				isPresent = true;
			} else {
				i++;
			}		
		}
		return isPresent;
		
	}	
	
	// Method 17:
	public static int findSmallest(int[] listOfNumbers) {
		int smallest = listOfNumbers[0];
		for (int i = 0; i < listOfNumbers.length; i++) {
			if (smallest > listOfNumbers[i]) {
				smallest = listOfNumbers[i];
			}
		}
		return smallest;
	}
	
	// Method 18:
	public static void findAverage(double[] arrayOfDouble) {
		double sum = 0;
		for (double number : arrayOfDouble) {
			sum = number + sum;
		}
		double average = sum / arrayOfDouble.length;
		System.out.printf("%.2f%n", average);
	}
	
	// Method 19:
	public static int[] findLength(String[] arrayOfStrings) {
		int x = arrayOfStrings.length;
		int[] stringLengths = new int[x];
		int i = 0;
		for (String word : arrayOfStrings) {
			stringLengths[i] = word.length();
			i++;
			}
		return stringLengths;
		
		
	}
	
	// Method 20:
	// takes an array of strings and 
	//	returns true if the sum of letters for all strings with an even amount of letters
	//	is greater than the sum of those with an odd amount of letters.
	public static Boolean evenGreater(String[] arrayOfLongStrings) {
		Boolean evenGreaterResult = false;
		int evenWord = 0;
		int oddWord = 0;
		for (String word : arrayOfLongStrings) {
			if (word.length() % 2 == 0) {
				evenWord = (word.length()) + evenWord;
			} else {
				oddWord = (word.length()) + oddWord;
			}
		}
		System.out.println("Even: " + evenWord);
		System.out.println("Odd: " + oddWord);	
		evenGreaterResult = evenWord >  oddWord;
		
		return evenGreaterResult;
		
	}
	
	// Method 21:
	// takes a string and 
	//	returns true if the string is a palindrome
	public static Boolean testPalindrome(String testWord) {
		Boolean isPalindrome = true;
		String word = testWord.toLowerCase();
		char[] wordArray = word.toCharArray();
		
		int half = word.length() / 2; 
		
		int start = 0;
		int end = word.length() - 1;
		

		while ((start < half) && (isPalindrome == true)) {
			if (wordArray[start] == wordArray[end]) {
				isPalindrome = true;
			//	System.out.println(wordArray[start] + "=" + wordArray[end]); //testing
			//	System.out.println(isPalindrome); //testing
			} else {
				isPalindrome = false;
			//	System.out.println(wordArray[start] + "=" + wordArray[end]); //testing
			//	System.out.println(isPalindrome); //testing
			}
			start ++;
			end --;
		}
		
		return isPalindrome;
	}
}