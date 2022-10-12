package ver07;

// CustomerContact 회사, 거래처의 정보를 저장하는 하위 클래스
public class CustomerContact extends Contact {


	 // 거래처회사이름, 거래품목, 직급 변수 추가
	private String company;
	private String product;
	private String manager;
	
	
	public CustomerContact(String name, String phoneNumber, String email, String address, String birthday, String group,
			String company, String product, String manager) {
		super(name, phoneNumber, email, address, birthday, group);
		this.company = company;
		this.product = product;
		this.manager = manager;
		
	}
	
	// 정보를 출력하는 메소드를 오버라이딩
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("거래처 이름 : " + this.company);
		System.out.println("거래 품목 : " + this.product);
		System.out.println("담당자 : " + this.manager);
		
	}
	
	public String getCompany() {
		return company;
	}

	public String getProduct() {
		return product;
	}

	public String getManager() {
		return manager;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

		//추가된 정보를 추가
		public static void main(String[] args) {
			Contact contact = new CustomerContact(
					"son", "010-1111-1111","son@gmail.com","london",
					"2000-01-01","직장동료","토트넘","공격수","없음");
			
			//출력
			contact.printInfo();	
			 
}

		@Override
		public void ShowData() {
			// TODO Auto-generated method stub
			
		}
}