import java.util.Scanner;

public class Input {
	void input(Student student) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name : ");
		String name = sc.nextLine();

		System.out.println("Hakbun : ");
		String hakbun = sc.nextLine();
		
		System.out.println("Korean : ");
		int kor = sc.nextInt();
		
		System.out.println("English : ");
		int eng = sc.nextInt();
		
		System.out.println("Math : ");
		int mat = sc.nextInt();
		
		Student jimin = new Student(hakbun, name, kor, eng, mat);

	}
}
