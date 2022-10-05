package ver06;

abstract public class Contact implements ShowData{

	/*
	 * 데이터 저장하고, 출력하는 메소드를 가지는 클래스 정의 추가 요청 사항 : 변수들은 직접 참조를 막아 캡슐화 처리 => private
	 * 인위적인 조작 막기 변수의 직접 참조는 안되지만 변수 값 얻는 메소드(getter)과 변수에 값을 저장할 수 있는 메소드(setter)
	 * 정의 => Generate ~~ 인스턴스 생성과 함께 데이터를 "초기화"할 수 있도록 생성자를 정의 => 생성자 저장한 데이터를 콘솔에서
	 * 사용자의 입력 값으로 인스턴스 생성 => scanner
	 * 
	 * 메인 메소드 정의 연락처 데이터 저장하는 인스턴스 생성 변수 값 반환하는 메소드 호출해서 데이터 출력문으로 출력 생성된 인스턴스의 정보
	 * 출력 메소드를 호출 인스턴스의 각 변수에 값을 바꾸는 메소드를 이용해서 데이터 수정 인스턴스의 출력메소드 재실행
	 */

	// 변수 선언 : 캡슐화 처리 private
	private String name; // 친구의 이름 (나중에 변수 옆에 주석달기)
	private String phoneNumber; // 전화번호
	private String email; // 이메일
	private String address; // 주소
	private String birthday; // 생일
	private String group;

	// 생성자는 위에 넣어야 나중에 헷갈리지 않음

	public Contact() { // 디폴드 생성자
		// super();

	}

	public Contact(String name, String phoneNumber, String email, String address, String birthday, String group) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.group = group;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	// 위 데이터를 출력하는 기능
	public void printInfo() { // showInfo 주로 많이 사용
		System.out.println("친구 정보==============");
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호 : " + this.phoneNumber);
		System.out.println("이메일 : " + this.email);
		System.out.println("주소 : " + this.address);
		System.out.println("생일 : " + this.birthday);
		System.out.println("그룹 : " + this.group);

	}

	// toString 왜 하는지
	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", address=" + address
				+ ", birthday=" + birthday + ", group=" + group + "]";
	}
	
	
}

