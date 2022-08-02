import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Row : ");
//	int row = sc.nextInt();
//	int array[][] = null;
//	int rows [] = new int[row];
//	for (int i = 0; i < rows.length; i++) {
//		System.out.println(i + "행의 Column : ");
//		int column = sc.nextInt();
//		int cols [] = new int[column];
//		rows = cols; 
		int array[][] = { { 1, 2, 3, 4, 5 }, { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 } };
		System.out.println("Before Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));

		int temp[] = array[0];
		array[0] = array[1];
		array[1] = temp;
		System.out.println("After Swapping");
		System.out.println("<<0층>>");
		System.out.println(Arrays.toString(array[0]));
		System.out.println("<<1층>>");
		System.out.println(Arrays.toString(array[1]));
		

	}
}
