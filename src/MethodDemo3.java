
public class MethodDemo3 {

	public static void main(String[] args) {
//		System.out.println(mymethod(50));
	}
	static Student mymethod() {
		Student jimin = new Student(); //서로 다른 타입 두개를 넘김
		jimin.name = "한지민";
		jimin.age = 26;
		return jimin;
	}
//	static int[] mymethod() {
//	return new int[] {5,9,4,3,2,8,9};
//	}
//	static String mymethod(int su) {//return은 한번 밖에 못한다 //동시에 2개 리턴 불가
//		if(su % 2 ==0) return "Hello";
//		else return "World";

	
	}

