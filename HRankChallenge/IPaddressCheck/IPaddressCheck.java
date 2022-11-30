/* Code by me
Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:

IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.

Some valid IP address:

000.12.12.034
121.234.12.12
23.45.12.56

Some invalid IP address:

000.12.234.23.23
666.666.23.23
.213.123.23.32
23.45.22.32.
I.Am.not.an.ip

In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.

Just write the MyRegex class which contains a String

. The string should contain the correct regular expression.

(MyRegex class MUST NOT be public)

Sample Input

000.12.12.034
121.234.12.12
23.45.12.56
00.12.123.123123.123
122.23
Hello.IP

Sample Output

true
true
true
false
false
false



*/

import java.util.Scanner;

class IPaddressCheck {

	static Scanner sc;
	static{
		sc = new Scanner(System.in);
	}

	private static String[] toArray(String str) {

		return str.split("[.]");
	}

	private static boolean checkLength(String[] array) {

		return array.length == 4 ? true : false;
	}

/*	private static int count() {

		return null;
	} 
*/
	public static boolean operation() {

		boolean sensor = false;

		System.out.print("Please Enter your ip address: ");

		var str = sc.nextLine();

		if(str.matches("[^a-zA-Z]+")) {
			var array = toArray(str);

				if(checkLength(array)){
					
					for(int i = 0; i < array.length ; i ++) {

						if(array[i].length()>3) {
							sensor = false;
							return sensor;
						}
						
						if(Integer.parseInt(array[i])>255 || Integer.parseInt(array[i])<0) {
							sensor = false;
						} else {
							sensor = true;
						}
					}
				}else {
					return sensor;
				}

		} else {
			return sensor;
		}
		
		

		return sensor;
	}
}