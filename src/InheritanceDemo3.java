
public class InheritanceDemo3 {
	public static void main(String[] args) {
	Sparrow sp = new Sparrow(10);
	System.out.println(sp.name);
//	System.out.println(sp.name); //private은 상속되지 않는다
	}
}
