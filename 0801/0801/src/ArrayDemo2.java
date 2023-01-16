import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayDemo2 {

	public static void main(String[] args) throws IOException {
//		int[] array = new int[4];
//
//
//		for (int i = 0; i < 4; i++) {
//			System.out.print(i + "번째 방의 값 : ");
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			int num = Integer.parseInt(br.readLine());
//			array[i] = num;
//
//		}
//		for (int i = 0; i < 4; i++) {
//			System.out.printf("array[%d] = %d\t", i, array[i]);
//		}

		Student array[] = new Student[2];
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("array[" + i + "]" + " = " + array[i]);
//		}
//		array[0] = new Student();
//		array[1] = new Student();
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("array[" + i + "]" + " = " + array[i]);
//		}
//		
		BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + "번째 학생의 이름 : ");
			BufferedReader name = new BufferedReader(new InputStreamReader(System.in));
			String name2 = name.readLine();
			array[i].name = name2;

			System.out.println(i + "번째 학생의 나이 : ");
			BufferedReader age2 = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(age2.readLine());
			array[i].age = num;
		}

		for (int i = 0; i < array.length; i++) {
			System.out.println("array[" + i + "]의 이름 : " + array[i].name + "\t");
			System.out.println("array[" + i + "]의 이름 : " + array[i].age + "\t");

		}

	}

}
