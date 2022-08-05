
// 생성자의 역할은 멤버변수(필드, Property)의 초기화
// 파라미터가 없는 생성자를 기본 생성자라고 한다
// 파라미터가 없는 기본 생성자는 어떻게 멤버 변수를 초기화할 것인가?
// 0, 0.0, false, '\0' or '\u0000', null 기본 생성자가 각 변수의 타입에 맞춰서 초기화
//기본 생성자는 항상 해당 클래스의 생성자가 한 개도 없을 때 자동으로 만들어준다
//생성자 쓰는 이유 객체를 생성하면서 초기화하기 위하여

public class ConstructorDemo2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();// 기본 생성자
//		System.out.println(tiger.grade);
		MyCalendar mycalendar = new MyCalendar(2022, 12, 30);
		System.out.println(mycalendar.year + "-" + mycalendar.month + "-" + mycalendar.day);
	}
}

//class Tiger {
//	String name;
//	int age;
//	boolean flag;
//	double weight;
//	char grade;
//
//}

class MyCalendar {
	int year, month, day; // 0이 나오면 안될 경우에는 임의로 지정시켜줘야된다
//	public MyCalendar() {//재정의(Override) : 직접 기본 생성자를 정의했다
//		this.year = 2022;
//		this.month = 8;
//		this.day = 4;
//	}

	public MyCalendar() {
	}

	public MyCalendar(int year) {
	}

	public MyCalendar(int year, int month) { //생성자 오버로딩 쌉가능
	}

	public MyCalendar(int year, int month, int day) { // 기본 생성자가 아님 (생성자가 있으면 자동으로 만들지 않는다)
		this.year = year;
		this.month = month;
		this.day = day;
	}
}
