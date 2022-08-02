
public class MethodDemo2 {

	public static void main(String[] args) {
		System.out.println("Program is Starting");
		MethodDemo2 md = new MethodDemo2();
		int start = 1, last = 100;
		int result = md.makeSum(start, last); // 지역변수
		System.out.println(start + "부터 " + last + "까지의 합은 " + result);
		start = 30;
		last = 30;
		result = md.makeSum(start, last); // (값을 반환할시) 메소드가 끝난 뒤에 result로 출력 가능
		System.out.println(start + "부터 " + last + "까지의 합은 " + result);
		System.out.println("Program is Over..");
	}

//method : 필요할 때 사용하기 위해서 코드를 분리하는 것
	// (int last) : Call by value (값을 이용한 호출)
	int makeSum(int start, int last) { // Call by Name (이름에 의한 호출)
		// *호출하기 전까지 일을 하지 않는다
		// <메소드의 필수 3요소>
		// 메소드는 이름이 있어야 된다
		// 메소드는 괄호가 있어야 된다
		// 메소드 끝나고 난 뒤에 복귀 타임 (return이 있어야 된다)
		// void : 함수가 끝날 때 난 아무것도 반환하지 않을거임 (return이랑 같이 쓸수 없음)
		System.out.println("Method is Starting");
		int sum = 0;
		for (int i = start; i <= last; i++) {
			sum = sum + i;

		}
		System.out.println(start + "부터 " + last + "까지의 합은 " + sum);
		System.out.println("Method is Over...");
		return sum;
	}
}