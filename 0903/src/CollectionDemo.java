import java.util.HashMap;
import java.util.Map;

public class CollectionDemo {
	public static void main(String[] args) {
//		String [] array = {"한지민","김지민","박지민","홍지민","김지민","한지민"};
//		HashSet<String> set = new HashSet<String>();
//		for(String str : array) {
//			set.add(str);
//		}
//		System.out.println(set);
//		ArrayList<String> list = new ArrayList<String>();
//		for (String str : array) {
//			list.add(str);
//		}
//		System.out.println(list);
		Integer[] keyArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		String[] valueArray = { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };
		Map<Integer, String> map = new HashMap<Integer, String>();
		for (int i = 0; i < keyArray.length; i++) {
			map.put(keyArray[i], valueArray[i]);
		}
		System.out.println(map);
	}
}
