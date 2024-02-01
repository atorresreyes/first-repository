//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  StringBuilders, Lists, Sets, & Maps
// Java Week 04 Lab  
//
package week04;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {

		System.out.println("1. StringBuilder");
		// 1. Why would we use a StringBuilder instead of a String?
		//		Strings are immutable. StringBuilder is dynamic, so we can change it multiple times and then change it to a String.
		// 		a. Instantiate a new StringBuilder
				StringBuilder sb = new StringBuilder();
		//		b. Append the characters 0 through 9 to it separated by dashes
				for (int i = 0; i < 9; i++) {
					sb.append(i + "-");
				}	
				sb.append(9);
				System.out.println(sb.toString());		
		// 				Note:  make sure no dash appears at the end of the StringBuilder

		

		// 2. List of String:
		//		a. Create a list of Strings 
				List<String> listOfStrings = new ArrayList<String>();
		//		b. Add 5 Strings to it, each with a different length
				listOfStrings.add("Tri");
				listOfStrings.add("Four");
				listOfStrings.add("Cinco");
				listOfStrings.add("SixSix");
				listOfStrings.add("7Seven7");
		
		System.out.println();//blank
		System.out.println("3. findShortestString");		
		// 3. Write and test a method that takes a list of strings 
		//			and returns the shortest string
				System.out.println(findShortestString(listOfStrings));
		
				
		System.out.println();//blank
		System.out.println("4. switchFirstLast");	
		// 4. Write and test a method that takes a list of strings 
		//			and returns the list with the first and last element switched
		List<String> listFirstLast = new ArrayList<String>();
		
		listFirstLast.add("Last");
		listFirstLast.add("Second");
		listFirstLast.add("Third");
		listFirstLast.add("Fourth");
		listFirstLast.add("First");
		System.out.print("Before Method: ");
		System.out.println(listFirstLast);
		
		System.out.print("After Method: ");
		System.out.println(switchFirstLast(listFirstLast));
		
		
		
		System.out.println();//blank
		System.out.println("5. concatStrings");
		// 5. Write and test a method that takes a list of strings 
		//			and returns a string with all the list elements concatenated to each other,
		// 			separated by a comma
		System.out.println(concatStrings(listFirstLast));
		
		
		
		
		System.out.println();//blank
		System.out.println("6. createListWithContains");
		// 6. Write and test a method that takes a list of strings and a string 
		//			and returns a new list with all strings from the original list
		// 			containing the second string parameter (i.e. like a search method)
		System.out.println(createListWithContains(listFirstLast, "o"));
		
		
		
		System.out.println();//blank
		System.out.println("7. Four Integer Lists");
		// 7. Write and test a method that takes a list of integers 
		//			and returns a List<List<Integer>> with the following conditions specified
		//			for the return value:
		//		a. The first List in the returned value contains any number from the input list 
		//			that is divisible by 2
		//		b. The second List contains values from the input list that are divisible by 3
		//		c. The third containing values divisible by 5, and 
		//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		List<Integer> numberList = new ArrayList<Integer>();
		for (Integer i = 1; i <= 10; i++) {
			numberList.add(i);
		}
		
		System.out.println("Original List: " + numberList);
		System.out.println("New Lists: ");
		System.out.println(fourIntegerLists(numberList));
		
		
		
		
		System.out.println();//blank
		System.out.println("8. Lengths of Strings");
		// 8. Write and test a method that takes a list of strings 
		//			and returns a list of integers that contains the length of each string
		System.out.println(findLengths(listFirstLast));

		
		System.out.println();//blank
		System.out.println("9. Set of Strings");
		// 9. Create a set of strings and add 5 values
		Set<String> fruits = new HashSet<String>();
		fruits.add("Orange");
		fruits.add("Pear");
		fruits.add("Peach");
		fruits.add("Apricot");
		fruits.add("Pomegranate");
		
		System.out.println(fruits);
		
		
		System.out.println();//blank
		System.out.println("10. startsWith ");
		// 10. Write and test a method that takes a set of strings and a character 
		//			and returns a set of strings consisting of all the strings in the
		// 			input set that start with the character parameter.
		System.out.println(startsWith(fruits, 'P'));

		
		System.out.println();//blank
		System.out.println("11. To List of Same Strings");
		// 11. Write and test a method that takes a set of strings 
		//			and returns a list of the same strings
		System.out.println(makeList(fruits));
		
		System.out.println();//blank
		System.out.println("12. Evens");
		// 12. Write and test a method that takes a set of integers 
		//			and returns a new set of integers containing only even numbers 
		//			from the original set
		Set<Integer> numberSet = new HashSet<Integer>();
		for (Integer i = 1; i <= 10; i++) {
			numberSet.add(i);
		}
		System.out.println(findEvens(numberSet));
		
		
	
		// 13. Create a map of string and string and add 3 items to it where the key of each
		// 			is a word and the value is the definition of the word
		Map<String, String> learnSpanish = new HashMap<String, String>();
		learnSpanish.put("Fruta" , "Fruto comestible de las plantas, como la manzana, el melón, el mango, el plátano, la nuez, etc: ensalada de frutas");
		learnSpanish.put("Verdura" , "Hoja o fruto comestible de las plantas herbáceas, como el chayote, las espinacas, los ejotes y los nopales");
		learnSpanish.put("Jitomate" , "(Lycopersicum esculentum) Planta herbácea de la familia de las solanáceas que da ese fruto. Mide cerca de un metro de altura, tiene flores amarillas en racimos y tallo semileñoso. Es originario de América y se cultiva en climas cálidos)");
	
		System.out.println();//blank
		System.out.println("14. Language Dictionary Lookup");
		// 14. Write and test a method that takes a Map<String, String> and a string 
		// 			and returns the value for a key in the map that matches the
		// 			string parameter (i.e. like a language dictionary lookup)
			System.out.println("Fruta: ");
			System.out.println(defineWord(learnSpanish, "Fruta"));
		

			System.out.println();//blank
			System.out.println("15. Make Map from List");
			
		// 15. Write and test a method that takes a List<String> 
		//			and returns a Map<Character, Integer> containing a count of 
		//			all the strings that start with a given character
		System.out.println(listToMap(makeList(fruits)));
			

	}

	// Method 15:
	private static Map<Character, Integer> listToMap(List<String> fruits) {
		Map<Character, Integer> newMap = new HashMap<Character, Integer>();
		for (String fruit : fruits) {
			newMap.put(fruit.charAt(0), 0);
		}
		for (String fruit : fruits) {
			for (char c : newMap.keySet())
				if (fruit.charAt(0) == c) {
					newMap.put(c, (newMap.get(c) + 1)); 
				}		
		}
		return newMap;
	}
	
	
	
	// Method 14:
	private static String defineWord(Map<String, String> dictionary, String word) {
		for (String term : dictionary.keySet()){
			if (term.equals(word)) {
				return dictionary.get(term);
			}	
		}
		return "Word Not Found";
	}

	
	// Method 12:
	private static Set<Integer> findEvens(Set<Integer> numbers) {
		Set<Integer> evenNumbers = new HashSet<Integer>();
		for (Integer number : numbers) {
			if (number % 2 == 0) {
				evenNumbers.add(number);
			}
		}
		return evenNumbers;
	}

	
	// Method 11:
	private static List<String> makeList(Set<String> fruits) {
		List<String> fruta = new ArrayList<String>();
		for (String fruit : fruits) {
			fruta.add(fruit);
		}
		
		return fruta;
	}


	// Method 10:
	private static Set<String> startsWith(Set<String> fruits, char letter) {
		Set<String> startsWith = new HashSet<String>();
		for (String fruit : fruits) {
			String fruitTest = fruit.toUpperCase();
			if (fruitTest.charAt(0) == letter) {
				startsWith.add(fruit);
			}
		}
		return startsWith;
	}


	// Method 8:
	private static List<Integer> findLengths(List<String> listFirstLast) {
		List<Integer> foundLengths = new ArrayList<Integer>();
		Integer temp = 0; 
		for (String word : listFirstLast) {
			temp = word.length();
			foundLengths.add(temp);
		}
		
		return foundLengths;
	}
	

	
	// Method 7:
	private static List<List<Integer>> fourIntegerLists(List<Integer> numberList) {
		List<List<Integer>> fourIntegerLists = new ArrayList<List<Integer>>();
		fourIntegerLists.add(new ArrayList<Integer>());
		fourIntegerLists.add(new ArrayList<Integer>());
		fourIntegerLists.add(new ArrayList<Integer>());
		fourIntegerLists.add(new ArrayList<Integer>());
		for (Integer number : numberList) {
			if (number % 2 == 0) {
				fourIntegerLists.get(0).add(number);
			}
			if (number % 3 == 0) {
				fourIntegerLists.get(1).add(number);
			}
			if (number % 5 == 0 ) {
				fourIntegerLists.get(2).add(number);
			}
			if (!(number % 2 == 0) && !(number % 3 == 0) && !(number % 5 == 0)) {
				fourIntegerLists.get(3).add(number);
			}
		}
		return fourIntegerLists;
	}

	
	// Method 6:
	private static List<String> createListWithContains(List<String> list, String string) {
		List<String> newList = new ArrayList<String>();
		for (String word : list) {
			if (word.contains(string)) {
				newList.add(word);
			}
		}
		return newList;
	}

	
	// Method 5:
	private static String concatStrings(List<String> listFirstLast) {
		StringBuilder stringList = new StringBuilder();
		for (int i = 0; i < (listFirstLast.size() - 1); i++) {
			stringList.append(listFirstLast.get(i) + ", ");
		}
		stringList.append(listFirstLast.get(listFirstLast.size()-1));
		
		return stringList.toString();
	}
	
	
	
	// Method 4:
	private static List<String> switchFirstLast(List<String> listFirstLast) {
		String x = listFirstLast.get(0);
		listFirstLast.set(0, listFirstLast.get(listFirstLast.size()-1));
		listFirstLast.set((listFirstLast.size() - 1), x);
		
		return listFirstLast;
	}
	
	
	
	
	// Method 3:
	private static String findShortestString(List<String> ofStrings) {
		int howLong = 100;
		String shortest = "";
		for (String word : ofStrings) {
			if (word.length() < howLong) {
				howLong = word.length();
				shortest = word;
			}
		}
		return shortest;
	}
	

/////////////////////////////////////////////////////////////////////////////////////////	
}