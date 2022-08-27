import java.util.Iterator;

public class ArrayDemo {
	public static void main(String[] args) {
		// 배열의 선언 방법
		// 1.
		int[] array = null; // Declaration
		// array에는 주소만을 저장해야한다
		// 배열은 객체이기 때문에 new를 사용해야한다
		array = new int[4]; // Creation
		// array에 방 4개를 만들겠다
		array[0] = 5;
		array[1] = 6;
		array[2] = 7;
		// ----------------------------------------
		// 2. Creation & Assignment을 함께 하는 방법
		int[] array1 = null; // Declaration
		array1 = new int[] { 5, 6, 7, 8 }; // Creation & Assignment 생성과 할당을 함께 하는 방법

		// ----------------------------------------------------
		// 3. Initialization (선언과 할당과 생성을 같이 하는 방법)
		int[] array2 = { 5, 6, 7, 8 }; // Initialization

		// ===================================================
		// 2차원 배열 : Rectangular Array, Ragged Array
		// Rectangular Array = 각 층의 열의 개수가 같다
		// Ragged Array = 각 층의 열의 개수가 다르다
		// Java는 보통 Ragged Array를 많이 사용

		// 1. Rectangular Array 선언 방법
		int[][] array3 = null; // Declaration
		array3 = new int[2][3]; // Creation
		array3[0][0] = 5; // Assignment

		// 2. Rectangular Array
		int[][] array4 = null; // Declaration
		array4 = new int[][] { { 5, 6, 7 }, { 8, 9, 10 } }; // Creation & Assignment

		// 3. Rectangular Array
		int[][] array5 = { { 5, 6, 7 }, { 8, 9, 10 } }; // Initialization

		// =====================================================
		// 1. Ragged Array 선언 방법
		int[][] array6 = null; // Declaration
		array6 = new int[3][]; // Creation
		array6[0] = new int[4];
		array6[1] = new int[2];
		array6[2] = new int[5]; // 자바는 각 층의 열의 개수를 다르게 할 수 있다
		array6[0][0] = 5; // Assignment

		// 2. Ragged Array
		int[][] array7 = null; // Declaration
//		array7 = new int[3][];
//		array7[0] = new int[] { 3, 4, 5, 6 }; //Creation & Assignment
//		array7[1] = new int[] { 7, 8 };
//		array7[2] = new int[] { 9, 10, 11, 12, 13 }; 
		array7 = new int[][] { // Creation & Assignment
				{ 3, 4, 5, 6 },
				{ 7, 8 },
				{ 9, 10, 11, 12, 13 }
				};
	

	// 3. Ragged Array
	int[][] array8 = { //Initialization
			{ 3, 4, 5, 6 },
			{ 7, 8 },
			{ 9, 10, 11, 12, 13 }
			};
	
	System.out.println("0층의 방 갯수 : " + array8[0].length);
	System.out.println("1층의 방 갯수 : " + array8[1].length);
	System.out.println("2층의 방 갯수 : " + array8[2].length);
	
	for (int i = 0; i < array8.length; i++) {
		System.out.print(i + "층 : ");
		for (int j = 0; j < array8[i].length; j++) {
			System.out.print(array8[i][j] + ", ");
		}
		System.out.println();
	}
	
	//array[0]과 array[1]을 swapping(바꾼다)
	int [] temp = array8[0]; //임시 배열을 선언
	array8[0] = array8[1];
	array8[1] = temp;
	
	//배열 주소를 바꾸는 것이다
	
	System.out.println("변경 후");
	for (int i = 0; i < array8.length; i++) {
		System.out.print(i + "층 : ");
		for (int j = 0; j < array8[i].length; j++) {
			System.out.print(array8[i][j] + ", ");
		}
		System.out.println();
	}
	
	}
}
