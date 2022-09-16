package chapter04;

public class WhileLoop {

	public static void main(String[] args) {

		// 5번 "JAVA"를 출력하는 코드 작성
		// 5번 출력문 실행

		/*
		 * System.out.println("JAVA"); System.out.println("JAVA");
		 * System.out.println("JAVA"); System.out.println("JAVA");
		 * System.out.println("JAVA");
		 * 
		 * 
		 * 반복체크할 변수
		 * 
		 * while(반복의 조건: 변수 체크){
		 * 
		 * 반복해야할 코드 변수 증감 연산식
		 */

		// 5번 "JAVA"를 출력하는 코드 작성
		// 5번 출력문 실행

		int count = 0; // 0 1 2 3 4 5

		while (count++ < 5) {
			System.out.println("JAVA");
			// 반복문을 탈출할수있는 증감 식
			// count = count + 1;
			// count += 1;
			// count ++;
			//++count;
		}

	}
}
