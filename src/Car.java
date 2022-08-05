
public class Car {
	private String name; //멤버 변수
	private int price;
	//private 바깥 클래스에서 접근 불가 (메소드를 통하여 접근)
	//public 어디서든지 접근 가능
	
	public void setName(String name) {//파라미터를 통해 이름 받아옴
		this.name = name;
		//this
		//지역 변수와 멤버 변수(같은 이름일 경우) 구별하기 위하여 사용

	} //이름 세팅하기 위한 메소드
	
	public Car() {
		System.out.println("방금 객체가 생성되었습니다.");
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	} 
	
	public String getName() {
		return name;
	} //내가 얘를 부르면 저장돼있는 이름을 넘겨줌
	
	public int getPrice() {
		return price;
	}
	
	public void myprint() {
		System.out.println(this);
	}
	
	
}
