
public class ArrayDemo3 {

	public static void main(String[] args) {
		// 배열의 초기값
		// 정수형 = 0으로 초기화
		int array[] = new int[4];
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array[i] + "\t");
		}

		// 실수형 : 0.0으로 초기화
		double array2[] = new double[4];
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array2[i] + "\t");
		}
		// 참조형 :
		String array3[] = new String[4];
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array3[i] + "\t");
		}
		// boolean 형 : false
		boolean array4[] = new boolean[4];
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array4[i] + "\t");
		}

		// 문자형 : 널값, "\0", "\u0000"
		char array5[] = new char[4];
		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]=" + array5[i] + "\t");
		}
	}

}
