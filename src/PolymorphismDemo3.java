import java.util.Date;

public class PolymorphismDemo3 {
	public static void main(String[] args) {
		Object obj = new String("Hello, World");
		System.out.println(obj.toString());
		obj = new Student();
		System.out.println(obj);
		obj = new Point(30, 20);
		System.out.println(obj);
		obj = new Integer(5);
		System.out.println(obj);
		obj = new Date();
		System.out.println(obj);
		//부모형 Object는 자식 주소를 다 받을 수 있다
	}
}
