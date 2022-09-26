package chapter07;

public class SmartPhoneMain2 {

	public static void main(String[] args) {
		AndroidPhone androidPhone = new AndroidPhone("010-0000-0000");
		IPhone iPhone = new IPhone("010-1111-1111");
		GooglePhone googlePhone = new GooglePhone("010-2222-22222");
		
		callByPhone(androidPhone);
		callByPhone(iPhone);
		callByPhone(googlePhone);
		
		
	}
	
	static void callByPhone(Phone phone) {
		// 메소드의 매개변수
		// Phone phone = andoidPhone;
		phone.call();
		
	}
	
//	static void callByPhone(GooglePhone phone) {
//		phone.call();
//	}
//
//	// 안드로이트 폰
//	static void callByPhone(AndroidPhone phone) {
//		phone.call();
//	}
//
//	// 아이폰
//	static void callByPhone(IPhone phone) {
//		phone.call();
//	}

}