
public class ArrayDemo5 {
public static void main(String[] args) {
	int array[] = {4,5,8,1,3};
//	for (int i = 0; i < array.length; i++) {
//		System.out.println("array["+i + "] = " + array[i]);
//	}
for(int su:array) { //array 값을 su에 담는다 마지막 값까지 반복
	System.out.println(su);
}
}
}
