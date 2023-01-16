
public class ConstructorDemo3 {

	public static void main(String[] args) {
		Sawon jimin = new Sawon();
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}

}

class Sawon {
	String name;
	int salary;

	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public Sawon(String name) {
		this(name,500000);		
//		this.name = name;		
	
//		new Sawon(name,500000); //new를 쓰는 순간 주소를 새로 만들어서 첨 주소가 사라져서 이건 못씀
	}							//this 메소드를 쓰려면!
								//this() :new 없이 생성자를 쓰기 위한 메소드 (생성자끼리 호출)
								//생성자 메소드에서만 사용
								//생성자 메소드 내의 반드시 첫 줄에 와야한다

	public Sawon(int salary) {
		this("Unknown",salary);
//		this.salary = salary;
	
//		new Sawon("Unknown",salary);
	}

	public Sawon() {
		this("Unknown",500000);
//		new Sawon("Unknown",500000);

	}
}
