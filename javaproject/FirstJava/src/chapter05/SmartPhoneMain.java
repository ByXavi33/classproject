package chapter05;

public class SmartPhoneMain {

	// 프로그램의 시작 포인트

	public static void main(String[] args) {

		// 참조 변수 선언 : 인스턴스의 메모리 주소값을 저장
		SmartPhone sp = null;

		// 인스턴스 생성 : class에서 정의한 변수와 메소드를 사용할 수 있는 상태로 만드는것.
		// 인스턴화 -> 변수와 메소드를 메모리에 로드한다!
		sp = new SmartPhone(); // 인스턴 메모리를 생성하고 주소값을 반환

		// 인스턴스 변수 참조 방법 : 참조변수.인스턴스 변수 이름
		System.out.println("스마트폰의 제조사 :" + sp.company);
		System.out.println("스마트폰의 색상 :" + sp.color);
		System.out.println("스마트폰의 사이즈 :" + sp.size);
		System.out.println("스마트폰의 볼륨 크기 :" + sp.volumeSize);

		// 인스턴스 변수 할당
		sp.company = "samsung";
		sp.color = "black";
		sp.size = 6.1f;
		sp.volumeSize = 4;

		System.out.println("인스턴스의 변수 값 할당 후___________");

		/*
		 * System.out.println("스마트폰의 제조사 :" + sp.company);
		 * System.out.println("스마트폰의 색상 :" + sp.color); System.out.println("스마트폰의 사이즈 :"
		 * + sp.size); System.out.println("스마트폰의 볼륨 크기 :" + sp.volumeSize);
		 */

		// 인스턴스의 메소드 호출 : 참조변수. 메소드 이름();
		sp.showInfo();

		// 볼륨 조정 : 키우기
		sp.volumeUp();
		System.out.println("현재 볼륨 : " + sp.volumeSize);

		// 볼륨 조정 : 낮추기
		sp.volumeDown();
		System.out.println("현재 볼륨 : " + sp.volumeSize);
		sp.volumeDown();

		System.out.println("현재 볼륨 : " + sp.volumeSize);

	}

}