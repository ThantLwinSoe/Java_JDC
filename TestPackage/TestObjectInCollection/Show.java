import java.util.Scanner;
public class Show {

	Scanner sc = new Scanner(System.in);
	String name;
	public void getshow(){
		System.out.printf("\tEnter your name: ");
		name = sc.nextLine();
	}
}