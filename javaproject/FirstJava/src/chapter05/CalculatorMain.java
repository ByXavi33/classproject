package chapter05;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		// 더하기 곱하기하는 프로그램
		Calculator cal = new Calculator();

		Scanner vr = new Scanner(System.in);

		System.out.println("숫자를 입력해주세요 >>>");
		int num1 = vr.nextInt();

		System.out.println();

		System.out.println("숫자를 입력해주세요 >>>");
		int num2 = vr.nextInt();
		
		System.out.println();
		System.out.println("더하기 곱하기 연산의 결과");
		System.out.println("num1 + num2 = " +cal.add(num1, num2));
		System.out.println("num1 x num2 =" +cal.mult(num1, num2));

		
		System.out.println("______________________________");
		System.out.println("오버로딩 테스트 결과");
		
		System.out.println("num1 + num2 = " +cal.add(1, 2));
		System.out.println("num1 + num2 = " +cal.add(1L, 2L));
		System.out.println("num1 + num2 = " +cal.add(1f, 2f));
	}
}
