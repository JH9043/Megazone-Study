
public class Employee {

	private String empno;
	private String name;
	private int salary;
	private String hiredate;
	
	Employee(String empno, String name, int salary, String hiredate){
		//메소드의 이름이 클래스 이름과 똑같고
		//리턴 타입이 없으면 생성자
		System.out.println("방금 객체가 생성되었습니다");
	this.empno=empno;
	this.name=name;
	this.salary=salary;
	this.hiredate=hiredate;
	}
	
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	
	
	
	public void myprint() {
		System.out.printf("%s %s %d %s",this.empno,this.name,this.salary,this.hiredate);
	}
	
	
	
}
