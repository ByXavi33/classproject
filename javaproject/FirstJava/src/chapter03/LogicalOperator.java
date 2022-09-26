package chapter03;

public class LogicalOperator {

	public static void main(String[] args) {
		
		int num1 = 30;
		int num2 = 2;
		
		System.out.println(num1 > 10 && num1 < 50);  // true && true -> true
		System.out.println(num1 < 10 && num1 < 50);  // false && true -> false
		System.out.println(num1 > 10 || num2 > 10);  // true || false -> true
		System.out.println(num1 < 10 || num2 > 10);  // false || false -> false
	}
}
