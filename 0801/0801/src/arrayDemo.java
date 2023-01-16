
public class arrayDemo {

	public static void main(String[] args) {
//		int[] array; // 배열의 선언
//		array = new int[4]; // 배열의 생성
//		array[0] = 6;
//		array[1] = 9;
//		array[2] = 12;
//		array[3] = 15; // 할당
//
//		for (int i = 0; i < 4; i++) {
//			System.out.println("array[" + i + "]=" + array[i] + "\t");
//		}
		
//		double [] weights; //선언
//		weights = new double[] {67.3,78.9,52.3};
//		for (int i = 0; i < 3; i++) {
//			System.out.printf("array[%d] = %f\t",i,weights[i]);
//			
//		}
		
		char [] grades = {'A', 'C', 'B', 'B','C'}; //초기화
		int i = 0; // 초기값
		while(i<5) { //조건
			System.out.println("grades[" +i + "] = " + grades[i] + "\t");
			i++;
		}

	}

}
