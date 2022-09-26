package chapter03.exam;

import java.util.Scanner;

import first.ScannerTest;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//사용자의 숫자 입력
		System.out.println("숫자를 입력하세요. >>> ");
		
		
		int num1 =sc.nextInt();
		
		System.out.println("숫자를 입력하세요.>>>");
		
		int num2 = sc.nextInt();
		
		System.out.println("_____연산 결과_____");
		//두 수의 덧셈
		add(num1,num2);
		//두 수의 뺄셈
		sub(num1,num2);
		//두 수의 곱셈
		mul(num1,num2);
		//두 수의 나눗셈
		div(num1,num2);
		
		System.out.println("___________________________");
		
		System.out.println("숫자를 입력하세요. >>> ");
		double num3 = sc.nextDouble();
		
		// 원의 둘레
		System.out.println("원의 둘레는 : "+ cle(num3));
		// 원의 넓이
		System.out.println("원의 넓이는 : "+ cla(num3));
		
		
		
		
		
		
				
	}
        		public static void add(int num1, int num2) {
			System.out.println("두 수의 덧셈 결과 :" + (num1 + num2));
			
		}
		
		public static void sub(int num1, int num2) {
			System.out.println("두 수의 뺄셈 결과 :" + (num1 - num2));
		}
		
		public static void mul(int num1, int num2) {
			System.out.println("두 수의 곱셈 결과 :" + num1 * num2);
			
		}
		
		public static void div(double num1, double num2) {
			System.out.println("두 수의 나눗셈 결과 :" + num1 / num2);
			
			
		}
		public static double cle(double num3) {
			double re = 2 * 3.14 * num3;
			return re;
			
		}
		public static double cla(double num3) {
			double re = 3.14 * num3 * num3;
			return re;
}
}

