
public enum Season {
//	public static final int SPRING = 100; //enum으로 생성하는 것보다 이렇게 쓰는 게 자바 입장에서
										  //더 편할 수 있다
	SPRING(100), SUMMER(500), FALL(1000), WINTER(10000);

	private int value;

	Season(int value) {
		this.value = value;
	} //여기에서의 this는 지금 시즌을 말한다

	public int getValue() {
		return this.value;
	}
}
