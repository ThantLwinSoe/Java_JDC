class TestForEach {


	static HashMap<Integer,String> hello = new HashMap<>(Map.of(1,"I",5,"V",10,"X",50,"L"));


	public static StringBuilder test(int num) {
		StringBuilder str = new StringBuilder();
		hello.forEach((a , b) -> {

			if(num == a){
				str.append(b);
			}

		});
		return str;
	}

}