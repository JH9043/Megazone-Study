
public class Derived extends Base {
	String name = "박지민"; // overshadow variable

	void print() { // Override method
		System.out.println("나는 자식의 메소드");
	}

	void display() {
		System.out.println("나의 이름 = " + this.name);
		System.out.println("부모의 이름 = " + super.name);
		this.print();
		super.print();
	}
}
