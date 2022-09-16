package chapter04;

import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {

		// 점수에 따라서 학점 표기를 합시다
		// 100~97 : A+
		// 94~96 : A
		// 90~93 : A-
		// 80점 대는 B
		// 70점 대는 C
		// 나머지는 F
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		
		if (a>=90) {
			//A, A+, A-
		} else if (a>=80) {
		//B,B+,B-
		}else if (a>=70) {
			//
		}else {
		}
}
