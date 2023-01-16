import java.util.Arrays;

public class Practice_1 {

	public static void main(String[] args) {
		int num[] = { 1, 2, 2, 4, 2, 2, 3, 4, 1, 2 };
			mymethod(num);

	}
	static String[] mymethod(int[] array) {
		int correct[] = { 1, 2, 3, 4, 1, 2, 3, 4, 1, 2 };
		String[] starray = new String[correct.length];
		for (int i = 0; i < correct.length; i++) {

			if (array[i] == correct[i]) {
				starray[i] = "O";
			} else {
				starray[i] = "X";
			}
			System.out.print(starray[i]+" ");
		}

		return starray;

	}

}
