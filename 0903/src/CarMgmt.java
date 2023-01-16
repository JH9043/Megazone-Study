import java.util.Arrays;
import java.util.Comparator;

public class CarMgmt {
	public static void main(String[] args) {
		Car sonata = new Car("소나타", 30_000_000, 2500, "현대자동차");
		Car canival = new Car("카니발", 45_000_000, 3500, "기아자동차");
		Car matiz = new Car("마티즈", 10_000_000, 800, "쉐보레자동차");
		Car sm6 = new Car("SM6", 40_000_000, 2500, "르노삼성자동차");
		Car [] array = {sonata,canival,matiz,sm6};
		System.out.println("Before Sorting");
		for (Car car : array) {
			System.out.println(car);
			
		}
//		Arrays.sort(array); //Comparable interface를 이용하는 방법
		Arrays.sort(array,new Comparator<Car>() {
			@Override
			public int compare(Car front, Car back) {
				return back.getPrice() - front.getPrice();
			}
		});
		System.out.println("After Sorting");
		for (Car car : array) {
			System.out.println(car);
		}
	}
}
