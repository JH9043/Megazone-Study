import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ArrayDemo7 {

	public static void main(String[] args) throws IOException {
		System.out.println("학생 몇 명? :");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		sc.nextLine();
		
		Student_1 array[] = new Student_1[count];
		for (Student_1 std : array) {
			std = new Student_1();
			System.out.println("Name : ");
			std.name = sc.nextLine();
			System.out.println("Hakbun : ");
			std.hakbun = sc.nextLine();
			System.out.println("Korean : ");
			std.kor = sc.nextInt();
			System.out.println("English : ");
			std.eng = sc.nextInt();
			System.out.println("Math : ");
			std.mat = sc.nextInt();

			std.calcTot();
			std.calcAvg();
			std.caclGrade();
			std.display();

		}

	}

}
