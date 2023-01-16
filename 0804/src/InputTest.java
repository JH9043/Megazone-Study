//import static org.junit.Assert.assertEquals;
//
//import org.junit.Before;
//import org.junit.Ignore;
////* annotation
//import org.junit.Test;
//
//public class InputTest {
//	Student jimin;
//
//	@Before //항상 테스트 전에 실행
//	public void init() {
//		jimin = new Student();
//	}
//	@Ignore @Test //이 라벨이 붙은 메소드 검사
//	//Ignore = 이것은 무시하세요
//	public void testInput() {
//		Student jimin = new Student();
//		Input input = new Input();
//		input.input(jimin);
//		assertEquals("한지민",jimin.name); 
//		        //  기대값과 실제값이 같은지 검사
//		
//	}
//
//	@Test
//	public void testCalc() {
//		Calc calc = new Calc();
//		jimin.kor = 100; jimin.eng = 90; jimin.mat = 80;
//		calc.calc(jimin);
//		assertEquals((int)270/3, (int)jimin.avg);
//		assertEquals('A', jimin.grade);
//	}
//	
//}
