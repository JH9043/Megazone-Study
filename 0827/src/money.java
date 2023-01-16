import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class money {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.print("음식값을 입력하세요 : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money_1 = Integer.parseInt(br.readLine());
		int tax = money_1 * 10 / 110;
		
		System.out.printf("음식값 : %d\n",money_1-tax);
		System.out.printf("부가가치세 : %d ", tax);
		
		
		
		
		
		
	}
}
