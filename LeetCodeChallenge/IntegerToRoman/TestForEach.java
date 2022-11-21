class TestForEach {

	static int cup;
	static SortedMap<Integer,String> sm = new TreeMap<>(Map.of(1,"I",5,"V",10,"X",50,"L",100,"C",500,"D",1000,"M"));

	public static int test(int num) {


//		StringBuilder str = new StringBuilder();
		sm.forEach((a , b) -> {

			if(num >= a){
				cup = a;
			}

		});
		return cup;
	}

}