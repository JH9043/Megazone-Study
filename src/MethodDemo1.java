
public class MethodDemo1 {

	public static void main(String[] args) {
		System.out.println("Program is Starting");
		MethodDemo1 md = new MethodDemo1();
		md.makeSum(1,100);
		md.makeSum(30,50);
		System.out.println("Program is Over..");
	}
//method : 필요할 때 사용하기 위해서 코드를 분리하는 것
	//(int last) : Call by value (값을 이용한 호출)
	void makeSum(int start, int last) { //Call by Name (이름에 의한 호출)
		//*호출하기 전까지 일을 하지 않는다 
		// <메소드의 필수 3요소>
		// 메소드는 이름이 있어야 된다
		// 메소드는 괄호가 있어야 된다
		// 메소드 끝나고 난 뒤에 복귀 타임 (return이 있어야 된다)
		// void : 함수가 끝날 때 난 아무것도 반환하지 않을거임
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum = sum + i;

		}
		System.out.println(start +"부터 " + last + "까지의 합은 " +sum);
		System.out.println("Method is Over...");
	}
}