
public class ThirdJava {
	public static void main(String[] args) {
		
		Integer addr = 5; //autuboxing  heap에서의 address의 값은 5이고
							 //주소를 stack에 있는 애가 알고 있다
		//int su = addr.intValue() + 100; 옛날에 이렇게 사용
		int su = addr + 100; //heap에 있는 값을 heap 주소를 이용하여 가져와서 stack에서 unboxing해서 100을 더한다
		System.out.println("su = " + su);
		
	}
}
