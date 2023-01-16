import java.util.Date;

public class Car {
	private String name;
	private int price;
	private String maker;
	private Date today;
	private final double Pi; //상수 선언
	public Car(String name, int price, String maker) {
		super();
		this.name = name;
		this.price = price;
		this.maker = maker;
//		this.Pi= 3.141596; 
		System.out.println("방금 객체가 생성되었습니다");
	}
	{ //initialization Block = 객체를 메모리에 로딩할 때 단 한 번만 실행됨
		//생성자보다 먼저 호출되어야 할 때
		//대신 두 번은 못 부르고 파라미터도 못 넘김
		System.out.println("Hello, World");
		this.today = new Date();
		this.Pi = 3.141596;
	}
	
	@Override //나의 부모님이 쓰던 것을 재정의 했어요
	public String toString() {
		return "오늘은 "+ this.today +"입니다"; //앞에 문자열 붙여서 자동으로 문자열 전환돼서 오류 안 뜸
	}
	
	
}
