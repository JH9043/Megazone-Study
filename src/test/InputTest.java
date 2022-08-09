package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.libs.Employee;
import com.example.libs.Input;

public class InputTest {

	@Test
	public void testInput() {
		Employee array[] =new Employee[1];
		Input input = new Input(array);
		int count = input.input();
//		assertNotNull(array[0]);
		assertEquals("A512", array[0].getEmpno());
		
	}

}
