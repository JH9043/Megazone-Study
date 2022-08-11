
/**
 * <h1>Final 용법 3가지</h1>
 * <ul>
 * <li><b>Final Variable</b> : 자바의 상수</li>
 * <li><b>Final Method</b> : Override 금지</li>
 * <li><b>Final Class</b> : 상속의 금지</li>
 * </ul>
 * 
 * 
 * @author Henry
 * @version 1.1
 * @since 2022-08-11
 *
 */
public class FinalDemo extends Super {
	private final double PI = Math.PI; // Member Constant(멤버 상수)
	private static final boolean FLAG = true; // Static Constant(Static 상수)

	public static void main(String[] args) {
		final String NAME = "한지민"; // Local Constant(로컬 상수)

	}

//	public final void display() {
//		System.out.println("나는 부모의 메소드");
//	}

	@Override
	public void print() {
		System.out.println("나는 자식의 메소드");

	}

}

abstract class Super {
	public final void display() { // abstract와 final은 같이 사용할 수 없다
		System.out.println("나는 부모의 메소드");
	}

	public abstract void print();

}

final class Parent{ //클래스에 final을 붙여버리면 안에 모두 final 메소드가 되어버린다
	public void display() {System.out.println("나는 부모의 메소드");
}
}
