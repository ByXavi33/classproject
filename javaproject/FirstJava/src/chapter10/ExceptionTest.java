package chapter10;

import java.util.Scanner;

public class ExceptionTest {
	
	public static void main(String[] args) {
		//사용자로부터 숫자 두개를 받는다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요>");
		int num1 = sc.nextInt();
		
		System.out.println("숫자 2를 입력하세요>");
		int num2 = sc.nextInt();
		
		if (num2 == 0) {
			System.out.println("나누는 수는 0이 될수 없습니다");
			
		} else {
			System.out.println("num1/num2 =>" + (num1/num2));
			
				
		}
		System.out.println("프로그램을 종료합니다.");
				
	}

}
