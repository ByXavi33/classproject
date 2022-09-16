package chapter04;

public class ForLoopTest2 {

	public static void main(String[] args) {

		// 2단
		// 2x1=2
		// 2x2=4
		// 2x3=6
		// 2x4=8
		// ...
		// 2x9= 18

		for (int i = 1; i <= 9; i++) {
			System.out.println("2x" + i + "=" + (2 * i));
		}
		for (int i = 1; i <= 9; i++) {
			System.out.println("3x" + i + "=" + (3 * i));
		}
		System.out.println("____________________");

		// 단의 반복 : 2~9
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");

			System.out.println("______________");
			for (int j = 0; j <= 9; j++) {
				System.out.println(i + " X " + j + "=" + i * j);
			}
				System.out.println("______________");
			}
		}
	}
