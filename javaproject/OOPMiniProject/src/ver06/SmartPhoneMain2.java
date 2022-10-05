package ver06;

public class SmartPhoneMain2 extends Exception{

	
	public static void main(String[] args) {
		
		SmartPhone sp = SmartPhone.getInstance();
		
		while(true) {
						
		
		printMenu();
						
		System.out.println(" 원하시는 메뉴 번호를 입력해주세요.>>");
		
		int select = Integer.parseInt(sp.sc.nextLine());
				
		try {
			if (!(select > 0 && select < 7))
			{Exception err = new Exception();
			throw err;
			}
			}
		
			catch (Exception err) 
			{
				System.out.println("1~6까지 번호만 입력해주세요.");
								
				}
		switch(select) {
		case 1:
			sp.insertContact();
			break;
		case 2: 
			sp.searchInfoPrint();
			break;
		case 3:
			sp.editContact();
			break;
		case 4:
			sp.deleteContact();
			break;
		case 5:
			sp.printAllData();
			break;
		case 6:
			System.out.println("프로그램을 종료합니다.");
			return;
		}
		}
	}
	
	private static void getMessage(String string) {
				
	}

	static void printMenu() {
		System.out.println("==============================");
		System.out.println("# 전화번호부");
		System.out.println("1. 연락처 저장");
		System.out.println("2. 연락처 검색");
		System.out.println("3. 연락처 수정");
		System.out.println("4. 연락처 삭제");
		System.out.println("5. 연락처 전체 출력");
		System.out.println("6. 프로그램 종료");
		System.out.println("==============================");
	
	}
}


