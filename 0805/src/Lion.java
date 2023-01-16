
public class Lion extends Mammal {
	private int age;

	public Lion(String name, int age) {
		super(name); // 자식이 부모의 기본 생성자가 아닌 다른 생성자를 호출할 때 사용
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "이름은 " + getName() + ", 나이는" + this.age;
	}

}
