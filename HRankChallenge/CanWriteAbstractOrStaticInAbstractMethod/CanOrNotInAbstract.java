/*	In a abstract Class sample static are work well 
	But abstract static are illegral 
	All instance member are all well
*/

abstract class Book {

	// static variable
	 static String bookType;
	// instance variable
	String title;

/* ***
*    static abstract method have not access illegal combination
*
*	 abstract static void setBookType(String bookType);
*** */

	// instatnce abstract method
	abstract void setTitle(String title);

	// static method
	 static String getBookType() {
		 return bookType;
	   } 

	// instance method
	String getTitle() {
		return title;
	}

}

class BookLoader extends Book {

	void setTitle(String name) {
		title = name;
	}
}