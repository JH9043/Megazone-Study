
public class GenericDemo {
	public static void main(String[] args) {
		Car<Integer> car = new Car<Integer>(5);
		int result = car.getValue();// int를 받는 Car
		Car<Double> car1 = new Car<Double>(5.5);
		double result1 = car1.getValue(); // double을 받는 Car
		Car<String> car2 = new Car<String>("Hello");
		String result2 = car2.getValue(); // String을 받을 수 있는 Car
	}
}

class Car<A> { // <T>를 적음으로써 모든 것을 받은 수 있는 Car가 됨
				//T 글자 부분에는 다른 글자 아무 영어 대문자 써도 된다

	private A value;

	public Car(A value) {
		this.value = value;
	}

	public A getValue() {
		return value;
	}

	public void setValue(A value) {
		this.value = value;
	}
}
