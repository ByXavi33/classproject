package first;

public class PrintMethodTest {

	public static void main(String[] args) {
		
		
		// print 메소드 : 매개변수로 전달하는 데이터를 출력
		System.out.print("개인 소개");
		
		// println : 매개변수로 전달된 데이터를 출력하고 개행
		System.out.println();
		
		System.out.print("이름 : 소농민");
		System.out.println();
		System.out.println("나이 : 26");
		
		System.out.println("직업 : 축구 선수");
		
		System.out.println();
		
		// printf ("문자열의 규칙", 데이터, 데이터, 데이터)
		// 정수 : %d
		// 문자열 : %s
		// 실수 : %f, %e
		
		
		// 문자열 저장 변수선언 : string 변수이름 = "소농민";
		String userName = "소농민";
		int age = 26;
		float height = 179.2f;
		String job = "축구선수";
		
		System.out.printf("이름 : %s, 나이 : %d, 키 : %f cm, 직업 : %s","소농민", 26, 179.2f, "축구선수" );
		
		System.out.println();
		
		System.out.printf("이름 : %s, 나이 : %d, 키 : %f cm, 직업 : %s",userName, age, height, job );

	}
}
