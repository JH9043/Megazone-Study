
public class EnumDemo {
	public static void main(String[] args) {
		Season thisSeason = Season.SUMMER;
		switch (thisSeason) {
		case SPRING:
			System.out.println("개나리, 진달래");
			System.out.println(thisSeason.ordinal());
			System.out.println(thisSeason.getValue());
			break;
		case SUMMER:
			System.out.println("장미, 아카시아");
			System.out.println(thisSeason.ordinal());
			System.out.println(thisSeason.getValue());
			break;
		case FALL:
			System.out.println("코스모스, 백합");
			System.out.println(thisSeason.ordinal());
			System.out.println(thisSeason.getValue());
			break;
		case WINTER:
			System.out.println("동백, 매화");
			System.out.println(thisSeason.ordinal());
			System.out.println(thisSeason.getValue());
			break;
		}
	}
}
