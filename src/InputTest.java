import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class InputTest {
	private Student array[];
	private Input input;
	
	@Before
	public void init() {
		array = new Student[12];
		String path = "C:/Temp/sungjuk_utf8.dat";
		input = new Input(array, path);
	}
	
	
	
	@Test
	public void testInput() {
		this.input.fileinput();
		for(Student student : this.array) {System.out.println(student);
	}
	}
}
	
//	public void testInput() {
//		this.input.fileinput();
//		assertEquals(78+87+83+78, (this.array[0].getKor()+this.array[0].getEng()+this.array[0].getMat()+this.array[0].getEdp()));
//	}

