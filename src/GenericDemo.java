
public class GenericDemo {
	GeneralClass<Double> gc = new GeneralClass<Double>(89.5);
	GeneralClass<Integer> gc1 = new GeneralClass<Integer>(89);
	GeneralClass<String> gc2 = new GeneralClass<String>("89.5");
	GeneralClass<Car> gc3 = new GeneralClass <Car>(new Car("",22,33,""));
}

class GeneralClass<T>{
	private T value;
	public GeneralClass(T value) {this.value = value;}
	public T getValue() {return this.value;}
	public void setValue(T value) {this.value = value;}
}
