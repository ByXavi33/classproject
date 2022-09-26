package chapter05;

public class Member {

	// ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소
	String name;
	String pn;
	String major;
	int lev;
	String email;
	String birth;
	String adrs;

	Member(String name, String pn, String major, int lev, String email, String birth, String adrs) {

		this.name = name;
		this.pn = pn;
		this.major = major;
		this.lev = lev;
		this.email = email;
		this.birth = birth;
		this.adrs = adrs;
	}

	// 위에서 정의한 정보를 출력하는 메소드 정의
	Member(String name, String pn, String major, int lev, String email) {
		this(name, pn, major, lev, email, "", "");

	}

	void showInfo() {
		System.out.println("이름 :" + name);
		System.out.println("전화번호 :" + pn);
		System.out.println("전공:" + major);
		System.out.println(lev + "학년");
		System.out.println("이메일 :" + email);
		System.out.println("생일 :" + birth);
		System.out.println("주소 :" + adrs);
	}
}