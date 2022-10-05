package ver07;

import java.util.Scanner;

public class HashSet {
	
public static void main(String[] args) {
 	
	Scanner sc = new Scanner(System.in);
	String name;
	String weapon;
				
		System.out.println("이름을 입력해주세요>>");
		name =sc.nextLine();
		
		System.out.println("무기를 입력해주세요>>");
		weapon =sc.nextLine();
		
		
		Main main = new Main(name, weapon);
		
		main.showInfo();
		}
}
