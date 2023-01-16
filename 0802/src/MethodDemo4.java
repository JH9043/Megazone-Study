
public class MethodDemo4 {

	public static void main(String[] args) {

		int original = 5;
		System.out.println("Before calling method, original = " + original);
		mymethod(original);
		System.out.println("After calling method, original = " + original);

//		mymethod(5,62.8,'A', "Hello, World");
//		mymethod(new int[] {3,4,5,6});
//		Student jimin = new Student();
//		jimin.name = "한지민";
//		jimin.age = 26;
//		mymethod(jimin); // jimin = 학생 주소

	}

	static void mymethod(int target) {
		System.out.println("In method, target =" + target);
		target = 100;
		System.out.println("In method, target =" + target);

	}

	// Call by value는 순서도 맞아야되고 개수도 맞아야된다
	// static void mymethod(int su,double weight, char grade, String str) {
//		static void mymethod(int[] array) { //배열은 주소로 받는다 call by reference
//	static void mymethod(Student mystudent) { //student가 넘어오면 student로 받아야한다
//		
//	}
}
