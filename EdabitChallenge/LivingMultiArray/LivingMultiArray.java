/* 	
	Living Two Dimisional Array = {{}}
	Enter name : Alex ...
	will be add one room of second array with name ...
*/
import java.util.Scanner;
import java.util.Arrays;

public class LivingMultiArray {

	public String [][] info;
	private String name;
	private Scanner sc;

	public LivingMultiArray() {
		this.info = new String [][] {{}};
	}

	{
		sc = new Scanner(System.in);
	}

	public void test() {

		System.out.print("Enter your name: ");
		setName();

//		return info;
	}

	public void setName(){
		this.name = sc.nextLine();

		// it is a little bit of Complex because of multideminsional array
		// format was array = Arrays.copyOf(array , array.lenght + 1)
		// This is One room of array will be added
		info[info.length - 1] = Arrays.copyOf(info[info.length - 1] , info[info.length - 1].length + 1);

		// this format was info[0][0] = name;
		// {{"KO Thant"}}
		info[info.length - 1][info[info.length - 1].length -1 ] = name;
	}

	public String [][] getArray() {

		return this.info;
	}
}