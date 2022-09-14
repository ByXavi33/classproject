package chapter03;

public class PostfixOperator {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		
		System.out.println("num1 :" + num1);
		
	    int num2 = num1++; //num2 = num1 -> num1 = num1 + 1
	                       //num2 = 5 , num1 = 6
	    
	    System.out.println("num1 : " + num1);
	    System.out.println("num2 : " + num2);
	    
	    System.out.println("num1 : " + num1++); //
	    System.out.println("num1 : " + ++num1); //
	    
	    for (int i = 0; i < 5; ++i) {
	    	System.out.println("나는 " + i + "번째 반복이야" );
			System.out.println("나는 함수 마지막 부분이야");
		}
	}
}
