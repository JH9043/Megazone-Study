import java.util.Scanner;

public class ques3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		System.out.println("금액을 입력하세요 : ");
		int array[] = {50000,10000,5000,1000,500,100,50,10,5,1};
		for (int i = 0; i < array.length; i++) {
			
			int num1 = money / array[i];
			money = money - (num1*array[i]);
			System.out.println(array[i]+"원권 : " + num1);
			
		}
		
		
	}
	
	
	
	
}
