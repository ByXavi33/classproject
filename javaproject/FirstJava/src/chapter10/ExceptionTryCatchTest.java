package chapter10;

import java.util.Scanner;

public class ExceptionTryCatchTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 1을 입력하세요>");
		int num1 = sc.nextInt();

		System.out.println("숫자 2를 입력하세요>");
		int num2 = sc.nextInt();

		try {

			System.out.println("num1 / num2 = " + num1 / num2); // <=예외가 발생할 수 있는

			String str = null;

			// System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("0으로 나누는 것은 불가능합니다");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (NullPointerException e) {
			System.out.println("null");
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} finally {
            // return
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 처리 완료");
	}
	
}