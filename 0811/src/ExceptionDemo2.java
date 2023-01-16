
public class ExceptionDemo2 {
	public static void main(String[] args) {
		a();
	}
	static void a() { //오류 미해결 시 Virtual Machine에게 간다
		try {
			b();	//상위단계로 가면 안 되기 때문에 try catch
		} catch (ArithmeticException e) {
			System.out.println("여기서 잡았음");
		}
		                        //↑
	} 
	static void b() { //오류 미해결시 a로 던진다
		c();					//↑
	}
	static void c() { //오류 미해결시 b로 던진다
		d();					//↑
	}
	static void d() { //Exception 발생 오류 해결을 위해 c로 던진다(스택에 있는 복귀 주소로 인하여 c로 던진다)
		System.out.println(5/0);
	}
}
