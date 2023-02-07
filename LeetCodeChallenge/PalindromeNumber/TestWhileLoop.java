class TestWhileLoop {

	public static int lenghtOfInt(int i){
		int count = 0;
		while(i != 0){

			count ++;
			i = i / 10;
			
		}

		return count;
	}

	public static int divisor(int num) {

		var count = lenghtOfInt(num);
		int sensor = 1;
		int div = 1;  

		while(count > sensor) {
			div *= 10;
			sensor ++;
		}

		return div;
	}
}