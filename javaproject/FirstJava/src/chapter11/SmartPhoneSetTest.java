package chapter11;

import java.util.HashSet;

public class SmartPhoneSetTest {

	public static void main(String[] args) {
		
		HashSet<SmartPhone> set = new HashSet<>();
		
		set.add(new SmartPhone("test1", "010-0000-0000"));
		set.add(new SmartPhone("test2", "010-3333-3333"));
		set.add(new SmartPhone("test3", "010-0000-0000"));
		set.add(new SmartPhone("test4", "010-0000-0000"));
		set.add(new SmartPhone("test5", "010-1111-1111"));
		set.add(new SmartPhone("test6", "010-3333-3333"));
		
		System.out.println("요소의 개수 : " + set.size());
		
		for(SmartPhone sp : set) {
			System.out.println(sp);
		}
		
		

	}

}
