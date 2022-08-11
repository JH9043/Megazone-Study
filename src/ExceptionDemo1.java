import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo1 {
	public static void main(String[] args){
//		File file = new File("C:\\Temp.sungjuk_utf.8.dat");
// 예외 처리 방법
//		try {
//			Scanner sc = new Scanner(file, "utf-8"); // checked Exception (컴파일 단계부터 오류)
//		} catch (FileNotFoundException e) {
//			System.out.println("File Not Found");
//		}
		System.out.print("숫자형 글자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		int su = Integer.parseInt(num);
		System.out.printf("su = %d\n", su);
	}
}
