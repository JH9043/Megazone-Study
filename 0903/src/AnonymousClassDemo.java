
public class AnonymousClassDemo {
	public static void main(String[] args) {
//		MyClass mc = new MyClass(); mc.mymethod();
		MyClass mc = new MyClass() {
			
			@Override
			public void mymethod() {
				System.out.println("World, Hello");
			}
			
		};
		mc.mymethod();
	}
}

class MyClass{
	public void mymethod() {
		System.out.println("Hello, World");
	}
}
