package chapter07;

public class Phone {
	
	// 전화번호
	String phoneNumber;
	
	Phone(){
		this.phoneNumber="010-9999-8888";
	}
	
	Phone(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	// 전화걸기
	void call() {
		System.out.println("전화 걸기!");
	}
	

}