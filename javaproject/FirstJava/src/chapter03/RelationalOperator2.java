package chapter03;

public class RelationalOperator2 {

	public static void main(String[] args) {
		
		// 관계연산자 ( 비교연산자 )
		// > < >= <= == !=
		
		int num1 = 30;
		int num2 = 20;
		
		System.out.println(num1 > num2);  // ture
		System.out.println(num1 < num2);  // false
		System.out.println(num1 >= num2); // ture
		System.out.println(num1 <= num2); // false
		System.out.println(num1 == num2); // false
		System.out.println(num1 != num2); // ture
		
		if (num1 > num2) {
			// 참일 때 처리되는 블록
			System.out.println("num1dl num2보다 큽니다.");
			
		}
	}
}

