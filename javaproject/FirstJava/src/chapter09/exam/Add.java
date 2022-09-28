package chapter09.exam;

public class Add {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
				
		int sum = 0;
		int i = 0;
		
		for (i=0; i<=100000000; i++) {
			sum = sum + i;
			
		}
		
		long endTime = System.currentTimeMillis();
		long checkTime = endTime - startTime;
		

		System.out.println(sum);
		System.out.println("실행 시간 : " + (checkTime));
		
		
		
	}
}
