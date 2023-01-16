
public class EncapsulationDemo {
	public static void main(String[] args) {
		Car sonata = new Car();
		//sonata.name = "소나타";
		sonata.setName("소나타"); //Operation을 통하여 이름(소나타)을 대입
		//sonata.price = 30_000_000;
		sonata.setPrice(30_000_000);
//		System.out.println("이름은 "+sonata.name + ", 가격은 "+sonata.price +"원입니다");
		System.out.println("이름은 "+sonata.getName() + ", 가격은 "+sonata.getPrice() +"원입니다");
	}
}
