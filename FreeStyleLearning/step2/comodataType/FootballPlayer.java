import java.util.Scanner;

public class FootballPlayer {
	
	static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	public static void main(String [] args) {
		
		System.out.print(" Enter your favirate player: ");
		String name = sc.nextLine();
		System.out.print(" Enter his score per match: ");
		double goal = sc.nextDouble();
		System.out.print(" Enter his speed in 10 Seconds: ");
		int speed = sc.nextInt();

		System.out.println("Name: " + name);
		System.out.println("Goal per Match: " + goal);
		System.out.println("Speed per 10s: " + speed + "ft");
	}
}
