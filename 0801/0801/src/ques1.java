import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ques1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sec = Integer.parseInt(br.readLine());


		int hour = sec / 3600;
		int seconds = sec % 3600;
		int minute = seconds / 60;
		seconds = seconds % 60;

		System.out.println(sec+"초는 "+hour+"시간 "+minute+"분 "+seconds+"초입니다");

	}

}
