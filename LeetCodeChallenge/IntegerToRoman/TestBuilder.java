class TestBuilder {

	StringBuilder builder = new StringBuilder();

	public String ok(int num) {

		String result = test(num, builder);

		return result;
	}


	public String test(int num,StringBuilder builder) {
		builder.append(num);
		return builder.toString();
	}
}