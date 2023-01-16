
public class PolymorphismDemo {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
//		base = derived;
//		derived = base;(오류)
//		if(base instanceof Derived) { //형변환이 되냐?
//			derived=(Derived)base;
//		}else {
//			System.out.println("형변환 불가능");
//		}
//		Derived d = new Base(); //자식은 부모님의 주소를 받을 수 있냐?
		Base b = new Derived(); //부모님이 자식 자원을 쓰려고 자식 주소를 받음
		
	}

}

class Base {} //부모

class Derived extends Base {} //자식
