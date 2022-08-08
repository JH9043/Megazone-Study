
public class PolymorphismDemo4 {
	public static void main(String[] args) {
		Mammal array[] = new Mammal[5]; // Heterogeneous(이종들의 집합)
										// 포유류 배열(이 속에 다양한 동물들이 있다)
		array[0] = new Lion(); // 서로 클래스가 다르지만 부모의 계열로 묶여있다
		array[1] = new Cat();
		array[2] = new Dog();
		array[3] = new Korean();
		array[4] = new American();
		for (Mammal m : array) {
			m.saySomething();
		}
		
		Car cars[] = {new Sonata("Black Sonata"),new Carnival("White Carnival"), new Matiz("Red Martiz")};
	for (Car car : cars) {
		System.out.println(car.getName()+"이(가) 잘 수리됐습니다");
	}
	}
}
