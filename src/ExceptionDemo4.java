import java.util.Scanner;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();

		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
		try {
			Student chulsu = new Student(kor, math);
			System.out.println(chulsu);
		} catch (KoreanException e) {
			System.out.println(e.getMessage());
		} catch (MathException e) {
			System.out.println(e.getMessage());
		}
//		try {
//			Student chulsu = new Student(120);
//			System.out.println(chulsu);
//		} catch (KoreanException ex) {
//			System.out.println(ex.getMessage());
//		}

	}
}

class Student {
	private int kor, math;

	public Student(int kor, int math) throws KoreanException, MathException {
		if(kor >= 0 && kor <=100)
			{
			this.kor = kor;
			}
		else throw new KoreanException("국어점수는 0부터 100점까지입니다");
		if(math >= 0 && math<=100)
		{
			this.math = math;
		}
		else throw new MathException("수학점수는 0부터 100점까지입니다");
	}

//	public Student(int kor) throws KoreanException { // 메소드를 쓰는 사람에게 오류 발생 가능성 알려주기 위해 throws 사용
//		if (kor >= 0 && kor <= 100) {
//			this.kor = kor;
//		} else
//			throw new KoreanException("국어점수는 0부터 100점까지여야 합니다");
//		// 유저에게 메시지 보여주기
//
//	}

	@Override
	public String toString() {
		return String.format("Student [kor=%s, math=%s]", kor, math);
	}

}
