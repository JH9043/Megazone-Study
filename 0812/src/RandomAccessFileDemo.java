import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	private File file;
	private RandomAccessFile raf;
	public RandomAccessFileDemo rafd;
	public RandomAccessFileDemo() throws FileNotFoundException {
		file = new File("count.txt");
		raf = new RandomAccessFile(file,"rw");
	}
	public static void main(String[] args) throws IOException {
		RandomAccessFileDemo rafd = new RandomAccessFileDemo();
		rafd.countUp();
	}
	void countUp() throws IOException {
		String line = this.raf.readLine().trim();
		int count = Integer.parseInt(line);
		count++;
		System.out.println("귀하는 " + count + "번째 방문자이십니다.");
		this.raf.seek(0); //포인터를 다시 0에 맞추기
		this.raf.writeUTF(String.valueOf(count));
		
	}
}
