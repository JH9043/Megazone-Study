package beans;

import java.io.Serializable;

/*
 * Javabeans 규약
 * 1. public class
 * 2. [선택]java.io.Serializable 인터페이스를 구현 (네트워크에서 객체를 직렬화)
 * 3. private member variable
 * 4. public 기본생성자
 * 5. public getter,setter
 * 6. [선택]toString, equals 메소드를 오버라이딩
 */

public class MemberBean implements Serializable{
	private String name;
	private int age;
	private String telnum;
	
	public MemberBean() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTelnum() {
		return telnum;
	}

	public void setTelnum(String telnum) {
		this.telnum = telnum;
	}

	@Override
	public String toString() {
		return String.format("MemberBean [name=%s, age=%s, telnum=%s]", name, age, telnum);
	}
	
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	
	

	
} //class


