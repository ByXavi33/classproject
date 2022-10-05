package ver07;

public class Main {

	private String name;
	private String weapon;
	
	

	public Main(String name, String weapon) {
		super();
		this.name = name;
		this.weapon = weapon;
	}



	
	void showInfo() {
		System.out.println("이름 :" + this.name);
		System.out.println("전화번호 :" + this.weapon);
		
	}
		
	}

