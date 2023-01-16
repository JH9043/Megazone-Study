import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Input {
	private Student array[];
	private Scanner sc;
	private File file;
	private BufferedReader br;

	public Input(Student[] array) {
		this.array = array;

		this.file = new File("C:/Temp/sungjuk_utf8.dat");

		try {
			this.br = new BufferedReader(new FileReader(this.file));
			this.sc = new Scanner(file, "utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

//	public int fileinput() {
//		int count = 0;
//		while(this.sc.hasNextLine()){
//			String str = sc.nextLine(); //다음 라인 넘어가는거
//			count++;
//		}
//		return count;
//	}
	public int fileinput() {
		int count = 0;
		String line = null;
		while(true) {
			count++;
			try {
				line = this.br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			if(line == null) 
				break;
			{
				String lines [] = line.split("\\s+");
				System.out.println(lines[0]);
				
			}
	
			
		}
		return count-1;
		
	}
	
	
//	public int fileinput() {
//		int count = 0;
//		String line = null;
//		while(true) {
//			count++;
//		try {
//			line =this.br.readLine();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(line ==null) break;
//		}
//		return count-1;
//	}
//	Try-catch문은 예외를 처리하기 위한 구문이다. 
//	try
//	{//예외발생할 가능성이 있는 문장}
//	catch(Exception1 e1)
//	{//Exception1이 발생했을 경우, 이를 처리하지 위한 문장적는다.
//	 //보통 이곳에 예외메세지를 출력하고 로그로 남김.}
//	 catch(Exception2 e2)
//	 {//Exception2이 발생했을 경우, 이를 처리하지 위한 문장적는다.}
//	 
	 

	
}
