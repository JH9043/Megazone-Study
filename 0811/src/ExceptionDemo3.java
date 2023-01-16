
public class ExceptionDemo3 {
	public static void main(String[] args) {
		Test t = new Test(); t.display();
		t= null; //주소 삭제
		try {
			t.display(); 
		} catch (NullPointerException ex) {
			System.out.println(ex.getMessage()); //메시지 출력
			System.out.println(ex); //ex.tostring() //오류 타입 출력 
			ex.printStackTrace(); //몇 라인에서 오류 발생했는지 출력
		}
	}
}

class Test{
	public void display() {
		System.out.println("Hello, World");
	}
}
