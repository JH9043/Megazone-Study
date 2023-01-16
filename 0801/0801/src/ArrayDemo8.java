import java.util.Scanner;

public class ArrayDemo8 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("제품 몇 개 ? : ");
	int count = sc.nextInt();
	sc.nextLine();
	Product array[] = new Product[count];
	
	for (Product p : array) {
		p = new Product();
		System.out.print("Name : ");
		p.name = sc.nextLine();
		System.out.print("Price : ");
		p.price = sc.nextInt(); //숫자(int) 다음 문자(String)오면 buffer 비우기
		sc.nextLine(); //buffer 비우기
		System.out.print("Color : ");
		p.color = sc.nextLine();
		p.display();
	}
}
}
