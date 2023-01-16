
public class Calc {
	static void calc(Student student) {
		student.tot = student.kor + student.eng + student.mat;
		student.avg = student.tot / 3;
		student.grade = (student.avg >= 90 && student.avg <= 100) ? 'A'
				: (student.avg < 90) ? 'B' : (student.avg < 80) ? 'C' : (student.avg < 70) ? 'D' : 'F';
	}
}
