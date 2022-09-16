package chapter04.exam;

public class Exam3 {

	// 문제 3.
	// 구구단의 짝수 단(2,4,8)만 출력하는 프로그램 작성.
	// 단, 2단은 2x2까지, 4단은 4x4까지, 8단은 8x8 까지 출력

	public static void main(String[] args) {
		
		
		for (int i=2; i<10 ; i *=2) {
			System.out.println(i);
			
			
			// j값을 i보다 안나오게 설정
			for(int j=1; j<=i; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
	}
}