import java.util.Scanner;

public class ArrayDemo6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student_1 jimin = new Student_1();
		System.out.println("Name : ");
		jimin.name = sc.nextLine();
		System.out.println("Hakbun : ");
		jimin.hakbun = sc.nextLine();
		System.out.println("Korean : ");
		jimin.kor = sc.nextInt();
		System.out.println("English : ");
		jimin.eng = sc.nextInt();
		System.out.println("Math : ");
		jimin.mat = sc.nextInt();

		jimin.calcTot(); //협업하기 위해서 나눈다
		jimin.calcAvg();
		jimin.caclGrade();
		jimin.display();

//		jimin.tot = jimin.kor + jimin.eng + jimin.mat;
//		jimin.avg = jimin.tot / 3;
//		jimin.grade = (jimin.avg <= 100 && jimin.avg >= 90) ? 'A'
//				: (jimin.avg >= 80) ? 'B' : (jimin.avg >= 70) ? 'C' : (jimin.avg >= 60) ? 'D' : 'F';
//		System.out.printf("이름 : %s(%s) \t국어 점수 : %d\t영어 점수 : %d\t수학 점수 : %d\t총점 : %d\t평균 : %.2f\t학점 : %c\n", jimin.name, jimin.hakbun, jimin.kor, jimin.eng,
//				jimin.mat, jimin.tot, jimin.avg, jimin.grade);

	}

}
