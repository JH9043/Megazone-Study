import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo5 {
	public static void main(String[] args) {
		String line = null;
		try(
				BufferedReader br = new BufferedReader(new FileReader("C:/Temp/sungjuk_utf8.dat"));)
			//try가 끝나면 괄호 안이 소멸된다
		{
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);

			}
		} catch (IOException ex) {
			System.out.println(ex);
//		} finally { //버퍼를 열어줬기 때문에 닫아줘야 한다
//			try {
//				br.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}

	}
}
}
