
public class VariableArgumentDemo {
	public static void main(String[] args) {
		
//		int a= 5, b=9;
//		mymethod(a,b); //Argument (넘어가는 변수)
//						//Parameter (남아있는 변수)
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		mymethod(array);
	}
//	static void mymethod(int c, int d) { 
//		
//	}
//	static void mymethod(int array[]) { 
//		
//	}
	static void mymethod(int ...array) { //variable argument 
		
	}
}
