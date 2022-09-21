package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		int[] korScore = new int[10];

// 배열 요소의 초기화
		korScore[0] = 93;
		korScore[1] = 70;
		korScore[2] = 92;
		korScore[3] = 60;
		korScore[4] = 78;
		korScore[5] = 30;
		korScore[6] = 98;
		korScore[7] = 100;
		korScore[8] = 59;
		korScore[9] = 44;

		System.out.println("______________________");

		sum(korScore);
	}

	public static void sum(int[] arr) {

		// arr => korScores 의 배열 인스턴스 주소
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + (float) sum / arr.length);
	}
}
