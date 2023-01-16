
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		System.out.println(m.salary);
		System.out.println(e.name);//여기까진 상속 아님
		
		System.out.println(e.salary); //상속 (자식에 없어서 부모님꺼 가져다 씀)
	}
}
class Manager //extends String
			  //extends System  (클래스가 final 클래스면 상속 되지 않는다)
{	
int salary = 100000;
}
class Employee extends Manager{
	String name = "한지민"; 
}
