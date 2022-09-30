package chapter11;

import java.util.ArrayList;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list 
		= new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(50);
		
		printAll(list);
		

	}
	
	static <E> void printAll(LinkedList<E> list ) {
		for( E obj : list) {
			System.out.println(obj);
		}
	}

}
