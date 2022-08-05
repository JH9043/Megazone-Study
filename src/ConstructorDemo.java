
public class ConstructorDemo {
	public static void main(String[] args) {
		
		Employee jimin = new Employee("2022-001","박지민",1000000,"2022-08-04");
		jimin.setEmpno("2022-001");
		jimin.setName("한지민");
		jimin.setSalary(1000000);
		jimin.setHiredate("2022-08-04");
		jimin.myprint();
		
//		Math m = new Math(); //메소드에 생성자가 없을 경우 new를 못씀
//		System s = new System();//다 외우지 못하니 API 참조
		
		
		
	}
}
