
public class AnonymousClassDemo {
	public static void main(String[] args) {
		Demo d = new Demo() { //익명 객체
							  //새로운 객체를 붙이지는 못하고 재정의만 가능하다
			@Override
			public void display() {
				System.out.println("나는 재정의된 메소드");
			}
			public void print() {
				System.out.println("나는 새로운 메소드");
			}
		}; //세미콜론 빼먹지말 것
		d.display();
//		d.print(); //재정의하려는 클래스의 멤버가 아니기 떄문에 사용 불가
	}
}

class Demo{					//익명 클래스
	public void display() { //상속을 받고 싶지는 않은데 메소드를 사용하고 싶을 때
		System.out.println("나는 원형 메소드");
	}
}
