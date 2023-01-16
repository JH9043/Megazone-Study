

public class InheritanceDemo4 {
public static void main(String[] args) {
	Sub sub = new Sub();
	System.out.println("국어 점수는 " + sub.kor);
	System.out.println("영어 점수는 " + sub.eng);
	System.out.println("영어 점수는 " + Super.eng);
}
}
