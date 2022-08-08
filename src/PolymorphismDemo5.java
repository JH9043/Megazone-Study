
public class PolymorphismDemo5 {
	public static void main(String[] args) {
		//Object와 String의 관계
		Object obj = new String("Hello, World");
		String str = new String("Hello, World");
		obj = str; //자식 String은 부모 Object로 형변환 가능
		System.out.println(obj.toString());
		
		if(obj instanceof String) {
			System.out.println(obj instanceof String);
			String another = (String)obj;
			System.out.println(another);
		}else {
			System.out.println("Disabled");
		}
	}
}
