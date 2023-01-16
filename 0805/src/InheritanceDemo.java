
public class InheritanceDemo {
	public static void main(String[] args) {
		ThreeD td = new ThreeD();
		td.print();
		Car car = new Car(" ",22," ");
		
	}
}



class TwoD {
	int x = 5, y = 10;
	public TwoD() {
		System.out.println("나는 TwoD");
	}
	void print() {
		System.out.printf("(x,y) = (%d, %d)\n", this.x, this.y);
	}
}

class ThreeD extends TwoD {
	int z = 100;
	public ThreeD() {
		System.out.println("나는 ThreeD"); //부모를 먼저 만들고 자식을 만든다
	}
}