package ver01;

//Contact 클래스의 용도 ? => 데이터 저장
// 인스턴스 생성 - 변수의 메모리 생성 -> 데이터 저장
 public class Contact {

	// 변수들은 직접 참조를 막아 캡슐화 처리
	// 이름
	private String name;
	// 전화번호
	private String pn;
	// 이메일
	private String email;
	// 주소
	private String adr;
	// 생일
	private int bir;
	// 그룹
	private String group;

	// 변수의 직접 참조는 안되지만 변수의 값을 얻을 수 있는 메소드(getter)
	public String getName() {
		return name;
	}

	public String getPn() {
		return pn;
	}

	public String getEmail() {
		return email;
	}

	public String getAdr() {
		return adr;
	}

	public int getBir() {
		return bir;
	}

	public String getGroup() {
		return group;
	}

	// 변수에 값을 저장할 수 있는 메소드(setter)
	public void setName(String name) {
		this.name = name;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

	public void setBir(int bir) {
		this.bir = bir;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	//
	public Contact(String name, String pn, String email, String adr, int bir, String group) {
		super();
		this.name = name;
		this.pn = pn;
		this.email = email;
		this.adr = adr;
		this.bir = bir;
		this.group = group;
	}

	//
	public void showContactInfo() {
		System.out.println("_____________________");
		System.out.println("   이름 : " + this.name);
		System.out.println("전화번호 : " + this.pn);
		System.out.println("  이메일 : " + this.email);
		System.out.println("   주소 : " + this.adr);
		System.out.println("   생일 : " + this.bir);
		System.out.println("   그룹 : " + this.group);
		System.out.println("_____________________");

	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", pn=" + pn + ", email=" + email + ", adr=" + adr + ", bir=" + bir
				+ ", group=" + group + "]";
	}
}
