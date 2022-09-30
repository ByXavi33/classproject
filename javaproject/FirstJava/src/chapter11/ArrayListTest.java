package chapter11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// String 타입의 객체저장을 위한 ArrayList 객체 생성 
		ArrayList<String> list = new ArrayList<String>();
		//List<String> list1 = new ArrayList<String>();
		//List<String> list2 = new ArrayList();
		
		// 요소 저장
		list.add("손흥민");
		list.add("박지성");
		list.add(new String("이강인"));
		
		// 요소의 개수
		System.out.println("저장된 요소의 개수: " +  list.size());
		
		// 요소 참조
		System.out.println(list.get(0));
		
		// 일괄 참조
		printAll(list);
		
		// 특정위치에 쵸소 추가
		list.add(1, "안정환");
		
		printAll(list);
		
		// 요소 삭제
		list.remove(1);
		printAll(list);
		System.out.println(list.get(1));

	}
	
	static void printAll(List<String> list) {
		System.out.println("전체 리스트 출력 ===============");
		for(String name : list) {
			System.out.println(name);
		}
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}

}







