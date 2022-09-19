package chapter05;

import chapter05.Member;

public class MemberMain {

	public static void main(String[] args) {

		System.out.println("개인정보");
		// 모든 정보를 저장하도록 하는 생성자와
		Member mb = new Member("정요셉", "01085905950", "컴공", 3, "wjdsjdad33@naver.com", "19970609", "방이동");
		// 생일과 주소는 저장하지 않을 수 있는 생성자를 정의
		Member mb2 = new Member("정요셉", "01085905950", "컴공", 3, "wjdsjdad33@naver.com");

		// main() 메소드에서 두 가지 생성자를 이용해서
		// 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
		mb.showInfo();
		System.out.println("________________");
		mb2.showInfo();

	}
}
