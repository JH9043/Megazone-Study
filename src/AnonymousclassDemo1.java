
public class AnonymousclassDemo1 {
	public static void main(String[] args) {
		AnonymousclassDemo1 acd = new AnonymousclassDemo1();
//		acd.exec(acd.new MyClass());
//		acd.exec(acd.new MyMultiple());
		acd.exec(new MyInterface() { //우리 클래스 바깥 쪽에 있는 interface이기 때문에 주소 필요 X
			@Override
			public int calculate(int a,int b) {
				return a+b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a,int b) {
				return a-b;
			}
		});
		acd.exec(new MyInterface() {
			@Override
			public int calculate(int a,int b) {
				return a*b;
			}
		});
		acd.exec(new MyInterface() { //익명 클래스를 이용하면 인터페이스의 자식 클래스를 따로 정의할 필요없다
			@Override
			public int calculate(int a,int b) {
				return a/b;
			}
		});
		
	}
	void exec(MyInterface mi) { //멤버 메소드
		int result = mi.calculate(5, 9);
		System.out.println("Result = " + result);
	}
//	class MyMultiple implements MyInterface{
//		@Override
//		public int calculate(int front, int back) {
//			return front * back;
//		}
//	}
//	
//	class MyClass implements MyInterface{ //멤버 클래스
//		@Override
//		public int calculate(int front, int back) {
//			return front + back;
//		}
//	}
}

@FunctionalInterface
interface MyInterface { // 해당 메소드에 멤버가 하나밖에 없다면 람다로 변환 가능
	int calculate(int front, int back);
}