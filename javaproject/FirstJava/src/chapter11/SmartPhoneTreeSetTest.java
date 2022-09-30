package chapter11;

import java.util.TreeSet;

public class SmartPhoneTreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<SmartPhone> set = new TreeSet<>();
		
		set.add(new SmartPhone("JAVA", "010-0000-1000"));
		set.add(new SmartPhone("SON", "010-3333-3333"));
		set.add(new SmartPhone("Spring", "010-0002-0000"));
		set.add(new SmartPhone("King", "010-0004-0000"));
		set.add(new SmartPhone("Scott", "010-1114-1111"));
		set.add(new SmartPhone("Adam", "010-3833-3333"));
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp : set) {
			System.out.println(sp);
		}
		
		

	}

}
