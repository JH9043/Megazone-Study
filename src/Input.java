import java.util.Scanner;

public class Input {
	static void input(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : ");
		student.name = sc.nextLine();
		System.out.println("Hakbun : ");
		student.hakbun = sc.nextLine();
		System.out.println("Korean : ");
		student.kor = sc.nextInt();
		System.out.println("English : ");
		student.eng = sc.nextInt();
		System.out.println("Math : ");
		student.mat = sc.nextInt();

	}
}
