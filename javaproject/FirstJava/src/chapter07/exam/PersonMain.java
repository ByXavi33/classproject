package chapter07.exam;

public class PersonMain {

	public static void main(String[] args) {
		
		Male m = new Male("SON", "971122-1111111", "sonny");
		Female f = new Female("King", "001224-3000000", "체육", 3);
		
		m.printInfo();
		m.hi();
		
		System.out.println();
		
		f.printInfo();
		
		System.out.println();
		System.out.println();
		f.printSchoolInfo();
		
		Person p1 = m;
		Person p2 = f;
		
		//p1.hi();	// hi() 는  Person 클래스의 멤버가 아니기때문에 호출 불가 
		//p2.printSchoolInfo(); // printSchoolInfo() 는  Person 클래스의 멤버가 아니기때문에 호출 불가
		
		System.out.println();
		System.out.println("----------------");
		p2.printInfo();
		

	}

}