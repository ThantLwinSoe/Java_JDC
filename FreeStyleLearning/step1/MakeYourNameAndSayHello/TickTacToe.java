import java.util.Scanner;
import java.util.Arrays;

public class TickTacToe {

	
	static final char maRu = 'O';
	static final char baTsu = 'X';
	static Scanner sc;

	static String[] playerOne = {};

	static {
		
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
		
		System.out.println("********** Welcome to the Tick Tac Toe Game **********");
		
		System.out.println("Do you want to know How To Play Tic Tac Toe!!!");
		System.out.print("Please type Here: yes or no ==>> ");

		String userOption = sc.nextLine();
		
		if ( userOption.equalsIgnoreCase ( "yes" ) || userOption.equalsIgnoreCase ("y")) {
			System.out.println("************************************************************************");
			System.out.println();		
			System.out.println("You can choose the number of the following figure once when you get turn");
			System.out.println("It will be show you maru that instance of you choice the number");
		        System.out.println("************************************************************************");
			System.out.println();		
			System.out.println("""
				\t 1 | 2 | 3 
				\t---+---+---
				\t 4 | 5 | 6 
				\t---+---+---
				\t 7 | 9 | 10 """);
			System.out.println();

			System.out.println("\t\tLet's get started");
			System.out.println();
			System.out.println("************************************************************************");

		} else {
			System.out.println("************************************************************************");
			System.out.println();	
			System.out.println("\t\tLet's get started");
			System.out.println();
			System.out.println("************************************************************************");
			System.out.println();	
			
			System.out.println("Hello");
			System.out.println("Hello");
			mainFrame();
			System.out.println("Hello");
		}
	}

	public static void mainFrame() {
		
		System.out.println("Here we go");
		for ( int i = 0 ; i <= 4 ; i++ ) {
			
			System.out.print("\t");

			for ( int j = 0 ; j <=10 ; j++ ) {
				
				if ( j == 0||2||4||6||8||10  ) {
					System.out.print(" ");
				} else if ( j == 3 || 7 ) {
					System.out.print("|");
				}else {
					System.out.println("Ok");
				}
			}

			System.out.println();
		}	
	
	}

	public static void playGame() {
		
		do {
			System.out.print("\t Player-1 Turn!!! Please choose number: ");

			String strOne = sc.nextLine();
			playerOne = Arrays.copyOf( playerOne , playerOne.length + 1);
			playerOne [ player.length - 1 ] = strOne ;

			

		}while(false);
	}

}













