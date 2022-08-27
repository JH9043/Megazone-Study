
public class FourthJava {
	public static void main(String[] args) {
		String first = "Hello"; // ex) 1000번지
		String second = "World"; // ex) 2000번지
		//String result = first + second; 
		String result = first.concat(second); //3000번지 (새로운 번지를 만드는 것)
		System.out.println("result = " + result);
		//result는 새 번지에 할당을 해야 되고
		
		StringBuffer sb = new StringBuffer("Hello");
		StringBuffer sb1 = new StringBuffer("World");
		sb.append(sb1);
		System.out.println("sb = " + sb.toString());
		// 같은 번지에 문자를 이어버렸다
		
		//이런 코드는 새로운 번지를 계속 만들어서 메모리를 효율적으로 사용하지 못한다
		String sql = "SELECT zipcode, sido, gugun, dong, bunji" + "FROM zipcoe " + "WHERE dong = %" + "해운대동" + "% ";
		
		//그러므로 StringBuffer나 StringBuilder를 사용하는 것이 좋다
		
	}
}
