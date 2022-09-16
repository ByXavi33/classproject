package chapter04;

import java.util.Scanner;

public class Member {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요.>>>>");

		int a = 2022 - sc.nextInt();

		vaccination(a);
		Health(a);

	}

	static void vaccination(int Age) {

		if (Age >= 15 && Age < 65)
			System.out.println("무료 예방접종 대상이 아닙니다.");

		else
			System.out.println("무료 예방접종 대상입니다.");
	}

	static void Health(int Age) {
		
		if (Age < 20 || Age % 2 != 0) {
			
			System.out.println("건강검진 대상이 아닙니다.");
		}

		else if (Age < 40) {
			System.out.println("건강검진이 가능합니다.");
		}

		else {
			System.out.println("건강검진 및 암 검사가 가능합니다.");
		}
	}
}