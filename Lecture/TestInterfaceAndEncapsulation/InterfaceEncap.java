class UsingInterfaceEncap {

}

interface Shape() {

	void draw();
	void computeArea(double width, double height);
}

class Rectangle implements Shape {

	public double width, height;

	Rectangle(double width, double height) {
		this.width = width;
		this.height = height
	}



	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public void draw() {

	}

	public computeArea(double width, double height){
		
	}

}