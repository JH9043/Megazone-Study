
public class LambdaDemo {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterface() {
//
//			@Override
//			public int calculate(int a, int b) {
//				return a + b;
//			}
//		};
		MyInterface mi = (a, b) -> a + b;
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
		
		mi = (a, b) -> a * b;
		result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
		
		mi = (a, b) -> a - b;
		result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
		
	}
}

@FunctionalInterface
interface MyInterface {
	int calculate(int a, int b);
}
