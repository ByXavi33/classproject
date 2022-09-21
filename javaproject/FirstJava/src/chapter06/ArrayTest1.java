package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

		// 배열 : 많은 수의 변수를 다루어야할 때 사용
		// 일괄 처리!!!
		// 변수 여러개를 순차적으로 만든것과 같은 효과
		// 메모리를 옆에 붙여서 생성
		// 배열 변수 => 타입[] 변수이름
		// 타입 변수이름[]
		// 배열 생성: 메모리공간 생성, 변수들을 생성
		// new 타입 [개수] = []안에 입력한 숫자만큼의 메모리공간(변수)을 생성

		// 10명의 국어점수를 저장하는 배열 선언하고 생성
		int[] korScore = new int[10];

		// 배열의 사이즈를 가지고 있는 length
		System.out.println("배열의 요소 개수 :" + korScore.length);

		// 배열의 참조 방법 : 변수 이름[index]
		// index 0부터 배열요소개수-1
		// index => 0~9
		for (int i = 0; i < korScore.length; i++) {

			int temp = korScore[i];
			// System.out.println(i + " : " + temp);

		}

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

		int sum = 0;
		
		//sum = korScore[0] + korScore[1] + ... korScore[9];

		for (int i = 0; i < korScore.length; i++) {
			sum += korScore[i];
		}
		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + (float) sum / korScore.length);
	}
}
