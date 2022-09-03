
public class CastDemo {
	public static void main(String[] args) {
		//Demo d = new Test();
//		Test t = (Test)new Demo(); //부모님의 Demo는 자식한테 형 변환이 안된다
		Demo d = new Demo();
		Test t = new Test();
		if(d instanceof Test) {
			t=(Test)d; //컴파일에서는 에러가 안 나나 런타임에서 에러가 나서 형변환 안 된다
		}else {
			System.out.println("안돼요.");
		}

		Object obj = "Hello, World";
		if(obj instanceof String) {
			String another = (String)obj;
			System.out.println("잘돼요.");
		}else {
			System.out.println("안돼요.");
		}
		
	}
}

class Demo{}
class Test extends Demo{}
