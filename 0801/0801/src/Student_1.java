
public class Student_1 {
	String name, hakbun; // member variable, instance variable
	int kor, eng, mat, tot;
	double avg;
	char grade;

	// 주소 없이 접근하는 거는 static

	void calcTot() { // member method, instance method
		tot = kor + eng + mat;
	}

	void calcAvg() {
		avg = tot / 3;
	}

	void caclGrade() {
		grade = (avg <= 100 && avg >= 90) ? 'A' : (avg >= 80) ? 'B' : (avg >= 70) ? 'C' : (avg >= 60) ? 'D' : 'F';
	}

	void display() {
		System.out.printf("이름 : %s(%s) \t국어 점수 : %d\t영어 점수 : %d\t수학 점수 : %d\t총점 : %d\t평균 : %.2f\t학점 : %c\n", name,
				hakbun, kor, eng, mat, tot, avg, grade);
	}
}
