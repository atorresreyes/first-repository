package week06;

import java.util.Scanner;

public class Gameboard {

	 
	String[] boardSquares = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9"};
	Scanner sc = new Scanner(System.in); 
	
	
	
	public int askingForSquare() {
		System.out.print("Which square? "); //prompt for user
		int chosenSquare = sc.nextInt();
			return chosenSquare;
	}
	
	
	public void oneTurn (String playerTurn, String[] boardSquares) {
		int chosenSquare = askingForSquare();
		Boolean checkedNumber = false;
		Boolean checkedSpace = false;
		while (checkedNumber == false || checkedSpace == false) {
			if ((chosenSquare < 1) || (chosenSquare > 9)) {
				System.out.println("Please choose a valid space.");
				chosenSquare = askingForSquare();
			} else {
				checkedNumber = true;
			}
			if ((boardSquares[chosenSquare-1] == "X") || (boardSquares[chosenSquare-1] == "O")) {
				System.out.println("That space is taken! Please choose a valid space.");
				chosenSquare = askingForSquare();
			} else {
				checkedSpace = true;
			}
		}
		
		boardSquares[chosenSquare - 1] = playerTurn;
	}
	
	
	public void display(String[] boardSquares) {
		String line = "----+---+----";		
		System.out.println(); // spacing
		System.out.println("  " + boardSquares[0] + " | " + boardSquares[1] + " | " + boardSquares[2]);
		System.out.println(line);
		System.out.println("  " + boardSquares[3] + " | " + boardSquares[4] + " | " + boardSquares[5]);
		System.out.println(line);
		System.out.println("  " + boardSquares[6] + " | " + boardSquares[7] + " | " + boardSquares[8]);
		System.out.println(); // spacing
	}

	
	public Boolean checkWinStatus(String[] boardSquares, Boolean winStatus) {
		if ((boardSquares[0] == boardSquares[1]) && (boardSquares[1] == boardSquares[2])) {
			winStatus = true;
		} else if ((boardSquares[3] == boardSquares[4]) && (boardSquares[4] == boardSquares[5])) {
			winStatus = true;
		} else if ((boardSquares[6] == boardSquares[7]) && (boardSquares[6] == boardSquares[8])) {
			winStatus = true;	
		} else if ((boardSquares[0] == boardSquares[3]) && (boardSquares[0] == boardSquares[6])) {
			winStatus = true;	
		} else if ((boardSquares[1] == boardSquares[4]) && (boardSquares[1] == boardSquares[7])) {
			winStatus = true;	
		} else if ((boardSquares[2] == boardSquares[5]) && (boardSquares[2] == boardSquares[8])) {
			winStatus = true;	
		} else if ((boardSquares[0] == boardSquares[4]) && (boardSquares[0] == boardSquares[8])) {
			winStatus = true;	
		} else if ((boardSquares[2] == boardSquares[4]) && (boardSquares[2] == boardSquares[6])) {
			winStatus = true;	
		} else {
			return winStatus;
		}
		
		return winStatus;
	}//end checkWinStatus

	
}//
