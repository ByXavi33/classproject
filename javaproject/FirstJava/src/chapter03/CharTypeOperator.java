package chapter03;

public class CharTypeOperator {

	public static void main(String[] args) {
		
		char c1 = 'A';
		
		int codeNum = c1 + 0; // char + int => int + int =int
		
		System.out.println(codeNum);
		
		System.out.println(++c1);
		
	}
}
