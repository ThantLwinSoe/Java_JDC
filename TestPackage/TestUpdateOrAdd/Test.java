class UpdateOrAdd {

	public void addOrUpdate(Item item) {

	}
}

class Item {

	private List<Item> list;
	private String name;
	private int id;
	private int quantity;

	{
		list = new ArrayList<>();
	}

	Item(String name, int id , int quantity) {
		this.name = name;
		this.id = id;
		this.quantity = quantity;
	}

	void setId(int i) {
		
	}

	boolean add() {

	}
}