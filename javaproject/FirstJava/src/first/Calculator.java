package first;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("10+20=" +add(10,20)); //10+20=30
		System.out.println("315-4857=" + substract(315,4857)); //315-4857=-4542
		System.out.println("10*15=" +multifly(10,15)); //10*15*=
		System.out.println("160/16=" + divide (160,16)); // 160/16=10
		
	}
	//숫자 두 개를 매개변수의 인자로 전달받아 더하기 메소드를 추가합시다.
	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		
		return result;
		//return num1 + num2도 가능
	}
	
	//숫자 두 개를 매개변수의 인자로 전달받아 빼기 메소드를 추가합시다.
	public static long substract(long num1,long num2) {
		
		return num1 - num2;
	}
	
	//숫자 두 개를 매개변수의 인자로 전달받아 곱하기 메소드를 추가합시다.
	public static long multifly(long num1, long num2) {
		
		return num1 * num2;
	}
	
	//숫자 두 개를 매개변수의 인자로 전달받아 나누기 메소드를 추가합시다.
	public static long divide(long num1, long num2) {
		
		return num1 / num2;
	}
}
