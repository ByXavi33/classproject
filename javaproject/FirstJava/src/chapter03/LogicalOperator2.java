package chapter03;

public class LogicalOperator2 {

	public static void main(String[] args) {
		
		boolean chk1 = true;
		boolean chk2 = false;
		boolean chk3 = true;
		boolean chk4 = false;
		
		System.out.println(chk1 && chk3);
		System.out.println(chk1 && chk2);
		System.out.println(chk2 && chk3);
		System.out.println(chk2 && chk4);
		
		System.out.println("_____________");
		
		System.out.println(chk1 || chk3);
		System.out.println(chk1 || chk2);
		System.out.println(chk2 || chk3);
		System.out.println(chk2 || chk4);
		
	}
}
