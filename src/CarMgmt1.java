import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarMgmt1 {
	public static void main(String[] args) {
		Car sonata = new Car("소나타", 30_000_000, 2500, "현대자동차");
		Car carnival = new Car("카니발", 45_000_000, 3500, "기아자동차");
		Car matiz = new Car("마티즈", 10_000_000, 800, "쉐보레자동차");
		Car sm6 = new Car("SM6", 40_000_000, 2500, "르노삼성자동차");
		List<Car> list = new ArrayList<Car>();	
		list.add(sonata);
		list.add(carnival);
		list.add(matiz);
		list.add(sm6);
		System.out.println("Before Sorting");
		for(Car car:list) {
			System.out.println(car);
		}
		
		Collections.sort(list, new Comparator<Car>() {
			@Override
			public int compare(Car front, Car back) {
				return back.getName().compareTo(front.getName());
			}
		
		
		});
		System.out.println("After Sorting");
		for (Car car : list) {
			System.out.println(car);


	}
}
}
