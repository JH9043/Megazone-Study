//자바의 배열은 런타임 때 만들어진다
public class ArrayDemo4 {
	public static void main(String[] array) {
		// java ArrayDemo4 mango banana apple (클래스에게 값을 보내는 방법) String[] args가 받는다
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
//		if (args.length != 3) {
//			System.out.println("Usage Error");
//			System.exit(-1);
//		} else {
//			for (int i = 0; i < args.length; i++) {
//				System.out.println(args[i]);
//			}
//		}
		int first = Integer.parseInt(array[0]); // 문자를 숫자로 변경
		int second = Integer.parseInt(array[2]);
		switch (array[1]) {
		case "+":
			System.out.printf("%d + %d = %d\n", first, second, (first + second));
			break;
		case "-":
			System.out.printf("%d - %d = %d\n", first, second, (first - second));
			break;
		case "x":
			System.out.printf("%d x %d = %d\n", first, second, (first * second));
			break;
		case "/":
			System.out.printf("%d / %d = %d\n", first, second, (first / second));
			break;
		case "%":
			System.out.printf("%d %% %d = %d\n", first, second, (first % second));
			break;
		default:
			System.out.println("그런 연산자는 없습니다.");
			break;
		}
	}
	}


