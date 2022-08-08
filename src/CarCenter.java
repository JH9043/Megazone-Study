
public class CarCenter {
	public static void main(String[] args) {
	Sonata sonata = new Sonata("Black Sonata");
	repair(sonata);

	Carnival carnival = new Carnival("white Carnival");
	repair(carnival);
	
	Matiz matiz = new Matiz("Red Martiz");
			repair(matiz);
 }
	
	
//	static void repair(Sonata sonata) {
//		System.out.println(sonata.getName() + "이(가) 잘 수리됐습니다.");
//	}
//
//	static void repair(Carnival carnival) {
//		System.out.println(carnival.getName() + "이(가) 잘 수리됐습니다.");
//	}
//	static void repair(Matiz matiz) {
//		System.out.println(matiz.getName() + "이(가) 잘 수리됐습니다.");
//	}
	
	//위처럼 적을 필요 없이 간단하게 Car로 받으면 됨
//	static void repair(Car car) {
//		System.out.println(car.getName()+"이(가) 잘 수리됐습니다.");
//	}
	
	static void repair(Car car) {
		if (car instanceof Sonata) {
			System.out.println("소나타가 잘 수리됐습니다");
		}else if (car instanceof Carnival) {
			System.out.println("카니발이 잘 수리됐습니다");
		}else if (car instanceof Matiz) {
			System.out.println("마티즈가 잘 수리됐습니다");
		}

		
		
	}
}
