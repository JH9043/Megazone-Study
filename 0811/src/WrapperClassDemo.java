
public class WrapperClassDemo {
	public static void main(String[] args) {
		//Until JDK 1.4
//		int age = 26; //stack에 있다
//		Integer in = new Integer(age); // stack에 있는 값을 heap에 옮기는 것을 wrapping,boxing
//		int su = in.intValue(); //heap에 옮기는 것을 stack에 옮기는 것을 unwrapping,unboxing
//		System.out.println("su = " + su);
		
		//Since JDK 1.5
		Integer in = 26 + 5; //Integer in = new Integer(26 + 5); (자동으로 박스에 담아준다)
		int su = in + 100;
		System.out.println("su = " + su);
	}
}
