
/**
 * 
 * <font color='red' size='5'>Static 용법 4가지</font>
 * <ol>
 * 	<li>static variable</li> : 참조 없이 클래스의 이름으로 접근하기 위한 공유 변수 </li>
 * 	<li>static method</li> : 참조 없이 클래스의 이름으로 메소드에 접근하기 위해서 </li>
 * 	<li>static initialization block</li> : static 변수와 상수의 초기화 </li>
 * 	<li>static class</li>
 * </ol>
 * @author Henry
 * @version 1.0
 * @since 2022-08-11
 *
 */
public class StaticDemo {
	private String name; // member 변수
	private final double PI; // member 상수
	private static int age; // static 변수
	private static final boolean FLAG; // static 상수
	
	{ //Initialization block 초기화 블럭
		this.name = "한지민"; //멤버 변수 초기화
		System.out.println("나는 생성자보다 먼저 호출되는데, 다시는 재호출할 수 없다.");
	}
	
	public StaticDemo() {
		this.PI=3.141596; //멤버 상수 초기화
		System.out.println("나는 생성자다");
	}
	
	/**
	 * Program의 시작점
	 * @param args : String Array
	 * @return Nothing
	 * @see https:www.naver.com
	 */
	
	static { //static Initialization block(static 초기화 블럭)
		age = 26; //static 변수 초기화
		FLAG = true; //static 상수 초기화
		System.out.println("나는 static 초기화 블록이다. 항상 제일 먼저 메모리에 올라온다");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("나이 = " + age);
		System.out.println("FLAG = " + FLAG);
		StaticDemo sd = new StaticDemo(); // 멤버 변수들 출력하기 위해 선언
		System.out.println("이름 = " +sd.name);
		System.out.println("PI = " + sd.PI);
		
		
	}
	

}
