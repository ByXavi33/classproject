package chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {

		// 1~10까지의 합 => 55

		// 반복 10번 , 변수가 1~10

		int clo = 1;

		int sum = 0;

		while (clo <= 100) {

			// 합을 구하는 연산
			sum = sum + 6500; //(((((0+1)+2)+3)+4)+5)....+10)

			// 증가식
			 clo++;

			// System.out.print(sum + "+" + num +"=" + (sum += num));

		}
		System.out.println("1~10까지의 합 :" + sum);
	}
}
