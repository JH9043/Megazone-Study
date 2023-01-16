
public class Car extends Object /*implements Comparable<Car>*/{
	private String name;
	private int price, cc;
	private String maker;
	
	public Car(String name, int price, int cc, String maker) {
		this.name = name;
		this.price = price;
		this.cc = cc;
		this.maker = maker;
	}
	
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
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	@Override
	public String toString() {
		return String.format("Car [name=%s, price=%s, cc=%s, maker=%s]", name, price, cc, maker);
	}

//	@Override
//	public int compareTo(Car other) {
//		return this.name.compareTo(other.name);
//	}
	
	
}
