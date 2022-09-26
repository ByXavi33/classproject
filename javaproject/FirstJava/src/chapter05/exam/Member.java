package chapter05.exam;

public class Member extends Object {

	/*
	 * ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소 
	 * ② 위에서 정의한 정보를 출력하는 메소드 정의 
	 * ③ 모든 정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의 
	 * ④ main() 메소드에서 두 가지 생성자를 이용해서
	 * 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	 */

	private String name;
	private String pn;
	private String cls;
	private int lv;
	private String eml;
	// 생일 표현 : 문자열? 정수? : 19990101
	private int bir;
	private String adr;

	public Member(String name, String pn, String cls, int lv, String eml, int bir, String adr) {

		this.name = name;
		this.pn = pn;
		this.cls = cls;
		this.lv = lv;
		this.eml = eml;
		this.bir = bir;
		this.adr = adr;
	}

	public Member(String name, String pn, String cls, int lv, String eml) {
		this(name,pn,cls,lv,eml,0,null);

			}
	
	// 메소드
	
	public void showMemberInfo() {
		System.out.println("_______회원 정보_______");
		System.out.println("이름 :" +this.name);
		System.out.println("전화번호 :" + this.pn);
		System.out.println("전공 :" + this.cls);
		System.out.println("학년 :" + this.lv);
		System.out.println("이메일 :" + this.eml);
		System.out.println("생일 :" + ( this.bir==0 ? "미입력" : this.bir));
		System.out.println("주소 :" + ( this.adr == null ? "미입력" : this.adr));
		
		//if(this.bir !=0 &&this.adr != null) {
			//System.out.println("생일 입력 안함");
			//System.out.println("주소 입력 안함");}
		
	}
	
}
