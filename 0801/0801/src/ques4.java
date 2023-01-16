
public class ques4 {

	public static void main(String[] args) {
		int array[] = { 10, 50, 44, 56, 29, 30, 9, 48, 84, 92 };
		int sum = 0;

		System.out.print("배열 원본 : ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d ", array[i]);
			sum = sum + array[i];
		}
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("\n오름차순 : ");
		for (int up : array) {
			System.out.printf("%d\t", up);
		}

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.print("\n내림차순 : ");
		for (int up : array) {
			System.out.printf("%d\t", up);
		}
		double avg = (double) sum / array.length;
		System.out.println("\n합계 :" + sum);
		System.out.print("평균 :" + avg);

		System.out.println("\n최대값 : " + array[0]);
		System.out.println("최소값 : " + array[9]);
	
	}

}
