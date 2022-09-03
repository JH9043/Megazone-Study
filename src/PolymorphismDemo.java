
public class PolymorphismDemo {
	public static void main(String[] args) {
//		Animal ani = new Animal("동물의 이름");
		Animal ani = new Cat("Black Cat");	ani.saySomething();
		Animal ani1 = new Dog("White Dog"); ani1.saySomething();
		Animal ani2 = new Lion("Brave Lion"); ani2.saySomething();
		
		Animal [] array = {ani, ani1, ani2};
		for (Animal a : array) {
			a.saySomething();
		}
	}
}
