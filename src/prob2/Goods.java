package prob2;

public class Goods {
	
	//field
	private String name;
	private int price;
	private int count;
	
	//constructor
	public Goods(String name, int price, int count) {
		this.name=name;
		this.price=price;
		this.count=count;
	}
	//method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}

