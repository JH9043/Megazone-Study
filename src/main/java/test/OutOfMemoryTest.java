package test;

public class OutOfMemoryTest {
	
	static String str = null;

	public static void main(String[] args) {
		
		OutOfMemoryTest test = null;
		
		while(true) {
			str += "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
			System.out.println(str);
			new OutOfMemoryTest();
		}
	}
	
}
