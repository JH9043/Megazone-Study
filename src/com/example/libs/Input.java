package com.example.libs;
import java.util.Scanner;

public class Input {
	private Employee array[];
	private Scanner sc;
	private int count;
	public Input(Employee[] array) {
		this.array = array;
		this.sc = new Scanner(System.in);
		this.count = 0;
	}
	
	public int input() {
		String y_n = null;
		do {
			System.out.println("사원번호 : "); String empno = this.sc.nextLine();
			System.out.println("사원이름 : "); String name = this.sc.nextLine();
			System.out.println("기본급 : "); int base = this.sc.nextInt();
			System.out.println("야근시간 : "); int night = this.sc.nextInt();
			System.out.println("가족 수 : "); int family = this.sc.nextInt();

			this.array[count++] = new Employee(empno, name, base, night, family);
			System.out.println("Again(y/n) ? : ");
			y_n=this.sc.next();
			this.sc.nextLine(); //buffer 날리자
		} while (y_n.equals("y")||y_n.equals("Y"));
		return count;
	}
	
}
