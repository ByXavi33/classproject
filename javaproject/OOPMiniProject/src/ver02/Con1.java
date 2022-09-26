package ver02;

public class Con1 {

	private String name;
	private String hp;
	private String pn;

	public Con1() {

	}

	public Con1(String name, String hp, String pn) {
		this.name = name;
		this.hp = hp;
		this.pn = pn;
	}

	public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}

	public String getPn() {
		return pn;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	

	public void showInfo() {
		System.out.println("=============정보===========");
		System.out.println("이름 :" + this.name);
		System.out.println("핸드폰 기종:" + this.hp);
		System.out.println("핸드폰 번호" + this.pn);
	}
	@Override
	public String toString() {
		return "Con1 [name=" + name + ", hp=" + hp + ", pn=" + pn + "]";
	}
	
}
