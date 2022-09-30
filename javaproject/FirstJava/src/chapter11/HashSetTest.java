package chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		// 저장
		set.add("손흥민");
		set.add("이강인");
		set.add("박지성");
		set.add("이강인");
		set.add("손흥민");
		
		System.out.println("저장된 요소의 개수 : " + set.size());
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}

}






