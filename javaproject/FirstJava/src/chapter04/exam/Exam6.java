package chapter04.exam;

public class Exam6 {

	// 문제 6.
	// 1 부터 99까지의 합을 구하는 프로그램 작성
	// while문, for문, do while 문을 각각 사용

	public static void main(String[] args) {

		int num = 1;

		int sum = 0;

		while (num < 100) {
			sum += num;
			num++;

			System.out.println("while문을 이용한 1부터 99까지 합: " + sum);
		}
		System.out.println("___________");

		sum = 0;

		for (num = 1; num < 100; num++) {
			sum += num;
			System.out.println("for문을 이용한 1부터 99까지의 합: " + sum);
		}
		System.out.println("____________");

		num = 1;
		sum = 0;

		do {
			sum += num;
			num++;
			System.out.println("do문을 이용한 1부터 99까지의 합: " + sum);
		} while (num < 100);
	}
}