import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int first = sc.nextInt();
		System.out.print("두번째 숫자 : ");
		int second = sc.nextInt();
		try {
			System.out.printf("%d / %d = %d\n", first, second, (first / second));
		} catch (NullPointerException e) {
			System.out.println("내가 잡았음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("내가 잡았음");
		} catch (NegativeArraySizeException e) {
			System.out.println("내가 잡았음");
		} catch (RuntimeException e) {
			System.out.println("내가 잡았음");
		}

	}
}
