

//상속 시 주의할 점 4가지
// 1. 생성자는 상속이 되지 않는다
//- 자식은 부모의 기본 생성자만 호출하기 때문이다
//- 만일 부모의 기본 생성자가 없다면 에러가 발생하고 이를 해결하기 위해서는!
//1. 부모 기본 생성자를 명시적으로 해주거나
//2.  super(); 사용
//-super는 생성자 안에서만 사용하고, 반드시 생성자 안에서 첫줄에 와야 한다.

public class InheritanceDemo2 {
	public static void main(String[] args) {
		Lion lion = new Lion("Lion King", 26);
		System.out.println(lion);
	}
}
