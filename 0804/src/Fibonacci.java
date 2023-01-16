
public class Fibonacci {


	public static void main(String[] args) {
//		int before = 1;
//		int after = 1;
//		int next = 0;
//		for (int i = 0; i < 7; i++) {
//			System.out.print(before + "\t");
//			next = before + after;
//			before = after;
//			after = next;
		for (int i = 1; i < 7; i++) {
			System.out.println(fibo(i)+"\t");
		}
		
		}
	
	static int fibo(int n) {
		if(n ==1 || n==2) {
			return 1;
		}
		else {
			return fibo(n-1) + fibo(n-2);
		}
	}
	
	}


