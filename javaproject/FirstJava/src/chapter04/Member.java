package chapter04;

import java.util.Calendar;
import java.util.Scanner;

public class Member {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while (true) {

			System.out.println("출생년도를 입력해주세요. 종료는 (1)을 눌러주세요>>>>");

			int age = sc.nextInt();

			if (age == 1) {
				break;
			}

			vaccination(age);
			Health(age);

		}
	}

	static void check(int birthYear) {

		int currYear = Calendar.getInstance().get(Calendar.YEAR);

		int age = currYear - birthYear + 1;

		System.out.println("나이 :" + age);
	}

	static void vaccination(int Age) {

		if (Age >= 15 || Age < 65)
			System.out.println("무료 예방접종 대상이 아닙니다.");

		else
			System.out.println("무료 예방접종 대상입니다.");
	}

	static void Health(int Age) {

		if (Age < 20 || Age % 2 != 0) {

			System.out.println("건강검진 대상이 아닙니다.");
		}

		else if (Age < 40) {
			System.out.println("건강검진이 가능합니다");
		}

		else {
			System.out.println("건강검진 및 암 검사가 가능합니다");
		}
	}
}