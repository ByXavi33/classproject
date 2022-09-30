package chapter11;

public class SmartPhone implements Comparable<SmartPhone> {

	private String name;
	private String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	// HashSet 중복 저장을 하지 않는다!
	// hashcode 참조 -> equals 메소드로 비교
	

	@Override
	public int hashCode() {
		return phoneNumber.charAt(phoneNumber.length()-1);
		// 0 ~ 9
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		if(obj != null && obj instanceof SmartPhone) {
			SmartPhone phone = (SmartPhone) obj;
			result = phoneNumber.equals(phone.getPhoneNumber());
		}
		return result;
	}


	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName())*-1;
	}
	
	

	
	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
