package text;

public class Member {

	/*
	 * ① 아래의 데이터를 저장 이름, 전화번호, 전공, 학년, email, 생일, 주소 
	 * ② 위에서 정의한 정보를 출력하는 메소드 정의 
	 * ③ 모든정보를 저장하도록 하는 생성자와 생일과 주소는 저장하지 않을 수 있는 생성자를 정의 
	 * ④ main() 메소드에서 두 가지 생성자를 이용해서 인스턴스 생성하고 출력 메소드를 통해 저장된 데이터 출력
	 */
	
	private String name;
	private String phoneNum;
	private String major;
	private int grade;
	private String eMail;
	private String birth;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Member(){
		
	}
	
	Member(String name, String phoneNum, String major, int grade, String eMail, String birth, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.major = major;
		this.grade = grade;
		this.eMail = eMail;
		this.birth = birth;
		this.address = address;
	}
	
	Member(String name, String phoneNum, String major, int grade, String eMail){
		this(name, phoneNum, major, grade, eMail, " ", " ");
	}
	
	void showMemberInfo() {
		System.out.println(" 이름 : " + name);
		System.out.println(" 전화번호 : " + phoneNum);
		System.out.println(" 전공 : " + major);
		System.out.println(" 학년 : " + grade);
		System.out.println(" email : " + eMail);
		System.out.println(" 생일 : " + birth);
		System.out.println(" 주소 : " + address);
	}
}