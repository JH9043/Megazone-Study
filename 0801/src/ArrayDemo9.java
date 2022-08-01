
public class ArrayDemo9 {

	public static void main(String[] args) {

//		double original[] = { 78.2, 56.9, 43.5 };
//		double target[] = { 172.8, 185.4, 162.9, 152.1 };
//		
//		target[0] = original[1]; //값 복사
//		target = original; //주소 복사

//		int original = 5;
//		int target = 9;
//		System.out.println("Before Swapping");
//		System.out.printf("original = %d, target = %d\n", original, target);
//		
//		int temp = original; original = target; target = temp;
//		System.out.println("After Swapping");
//		System.out.printf("original = %d, target = %d\n", original, target);

//		Product pencil = new Product();
//		pencil.name = "연필";
//		pencil.price = 200;
//		pencil.color = "Black";
//		
//		Product mouse = new Product();
//		mouse.name = "마우스";
//		mouse.price = 50000;
//		mouse.color = "Silver";
//		
//		System.out.println("Before Swapping");
//		pencil.display(); mouse.display();
//		
//		Product temp = pencil;
//		pencil = mouse;
//		mouse = temp;
//		
//		
//		System.out.println("After Swapping");
//		pencil.display(); mouse.display();

		int original[] = { 4, 6, 2, 3, 5, 1, 6, 8, 9, 3, 2 };
		System.out.println("Before Sorting");
		for (int su : original) {
			System.out.printf("%d\t", su);
		}

		for (int i = 0; i < original.length - 1; i++) {
			for (int j = 0; j < original.length - 1; j++) {
				if (original[j] > original[j + 1]) {
					int temp = original[j];
					original[j] = original[j + 1];
					original[j + 1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("After Sorting");
		for (int su : original) {
			System.out.printf("%d\t", su);
		}

	}

}
