import java.util.Scanner;

public class SungjukMgmt {

	public static void main(String[] args) {
		System.out.println("성적관리프로그램 시작");
		Student jimin = new Student();
		Input.input(jimin);
		Calc.calc(jimin);
		Output.output(jimin);
		System.out.println("성적관리프로그램 끝");
	}

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

	static void output(Student student) {
		System.out.println("<<<<<부산정보산업고등학교 성적관리프로그램>>>>>");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%c\n", student.name, student.hakbun, student.kor, student.eng,
				student.mat, student.tot, student.avg, student.grade);
	}

	static void calc(Student student) {
		student.tot = student.kor + student.eng + student.mat;
		student.avg = student.tot / 3;
		student.grade = (student.avg >= 90 && student.avg <= 100) ? 'A'
				: (student.avg < 90) ? 'B' : (student.avg < 80) ? 'C' : (student.avg < 70) ? 'D' : 'F';
	}

}
