import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {
	private Student array[];
	private Scanner sc;
	private File file;

	public Input(Student[] array, String path) {
		this.array = array;
		this.file = new File(path);
		try {
			this.sc = new Scanner(this.file, "utf-8");
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

	}

	public void fileinput() {
		for (int i = 0; i < this.array.length; i++) {
			String line = this.sc.nextLine();
			// String split 사용하는 경우
//			String values[] = line.split("\\s+");
//			System.out.println(values[1]);

			// Scanner변수.useDelimiter 사용하는 경우
			Scanner myScanner = new Scanner(line);
			myScanner = myScanner.useDelimiter("\\s+"); // 어떤 구분자를 써서 문장을 구분할 건지
			this.array[i] = new Student(myScanner.next(), myScanner.next(), myScanner.nextInt(), myScanner.nextInt(),
					myScanner.nextInt(), myScanner.nextInt());
		}
	}

}
