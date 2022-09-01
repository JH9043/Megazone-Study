package bean;

import java.io.Serializable;
import java.util.ArrayList;

import org.apache.catalina.tribes.Member;

public class Loginbean implements Serializable {
	private String id;
	private String pwd;
	private String name;
	private String email;

	public Loginbean() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "{'id':'" + id + "','pwd':'" + pwd + ",'name':'" + name + "','email':'" + email + "'}";
	}

	public static void main(String[] args) {
		MemberList memberList = new MemberList();

		Loginbean member1 = new Loginbean();
		member1.setId("myid1");
		member1.setPwd("mypwd1");
		member1.setName("myname1");
		member1.setEmail("myemail1");

		Loginbean member2 = new Loginbean();
		member1.setId("myid2");
		member1.setPwd("mypwd2");
		member1.setName("myname2");
		member1.setEmail("myemail2");
		ArrayList<Loginbean> al = memberList.getMemberList();
		al.add(member1);
		al.add(member2);
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

}
