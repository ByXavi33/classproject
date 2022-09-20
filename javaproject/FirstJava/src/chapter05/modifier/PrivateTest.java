package chapter05.modifier;

public class PrivateTest {

	private String name;
	private int age;

	public PrivateTest() {
		this.name = "소농민";
		this.age = 30;
	}

	public void showInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("나이 :" + this.age);
			
	}
}
