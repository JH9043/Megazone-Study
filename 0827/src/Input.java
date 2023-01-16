import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Input {
	private Productmgmt array[];
	private File file;
	private BufferedReader br;

	public Input(Productmgmt array[]) {
		this.array = array;

		this.file = new File("C:/eclipse_workspace/productdata.txt");

		try {
			this.br = new BufferedReader(new FileReader(this.file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}

	public int fileinput() {
		int count = 0;
		String line = null;
		while (true) {
			count++;
			try {
				line = this.br.readLine();
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (line == null)
				break;
			{
				String lines[] = line.split("\\s+");
				System.out.println(lines[0]);

			}

		}
		return count - 1;

	}

}
