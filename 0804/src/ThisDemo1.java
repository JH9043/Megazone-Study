
public class ThisDemo1 {
public static void main(String[] args) {
	Lion lion = new Lion();
	Lion another = lion.getLion();
	System.out.println(another.name);
	System.out.println(another.age);
}
	
	
}

class Lion{
	String name = "한지민";
	int age =26;
	
	Lion getLion(){ //this가 자기 자신 => Lion이 타입이다
		//타입에 따라 어떤 것들을 넘길지 정한다
		
		return this; //(Lion이 타입일 경우)자기 주소 통째로 넘긴다
	}
}
