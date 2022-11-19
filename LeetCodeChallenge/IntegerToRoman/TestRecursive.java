class TestRecursive {

	int count = 0;

	public static int test(int num) {

		System.out.println(num);
		
		if(num == 0){
			return num;
		}

		return test(num -1) ;

	}
}