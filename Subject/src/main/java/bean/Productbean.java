package bean;

import java.io.Serializable;

public class Productbean implements Serializable {
	private String num;
	private String name;
	private String date;
	private String count;
	public Productbean() {
		
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return String.format("Productbean [num=%s, name=%s, date=%s, count=%s]", num, name, date, count);
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
	
}
