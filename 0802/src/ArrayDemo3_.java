import java.util.Arrays;

public class ArrayDemo3_ {
	public static void main(String[] args) {

//	String array[] = {"Hello", "World", "한지민","홍지민"};
//	for (int i = 0; i < array.length; i++) {
//		System.out.println(array[i]);
//	}
//	int array[] = {1,2};
//	array = new int[3];
//	array[2] = 3; //배열은 Resizing이 안 되기 때문에 새 주소로 생성해야 한다.

		int original[] = { 1, 2, 3, 4, 5 };
		int target[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//		System.arraycopy(original, 2, target, 0, 3); //original의 3,4,5를 10, 9, 8에 덮어쓰기
//		System.out.println(Arrays.toString(target));
//		original[2] = 100;
//		System.out.println(Arrays.toString(target));
		System.arraycopy(original, 0, target, 9, 5); //에러 발생 (타겟의 위치 확인 중요)
	}

}
