
package chapter10;

import java.util.Scanner;

public class ExceptionClassTest2 {

	public static void main(String[] args) {

		// 명시적인 예외 발생!!!
		// throw new Exception("강제적 예외 발생");

		// 국어 점수 입력 받기 : 점수 범위 -> 0~100
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("국어 점수를 입력하세요 >>");
			int score = sc.nextInt();

			try {
				if (!(score >= 0 && score <= 100)) {
					// throw new Exception("입력한 점수는 정상 범위의 점수가 아닙니다");
					throw new BadInputException(score);

				}
				System.out.println("국어 점수는 : " + score + "점 입니다.");
				break;

			} catch (BadInputException e) {
				System.out.println(e.getMessage());
				System.out.println("다시 입력해주세요.");
				System.out.println(e.getScore());
			}
		}
	}
}