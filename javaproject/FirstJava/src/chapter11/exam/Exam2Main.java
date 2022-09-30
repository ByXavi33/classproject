package chapter11.exam;

import java.util.HashSet;
import java.util.Set;

public class Exam2Main {
	
	public static void main(String[] args) {
		//2. 축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고
		//입력이 되지 않도록 Set<E> 컬렉션을 이용해서 
		//축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		// Set<E> : 중복 허용 안함, 저장 순서도 유지 하지 않음.
		// 중복검사 : hashCode 코드로 검사 -> equals를 통해 중복 검사
	Set<FootballPlayer> players = new HashSet<FootballPlayer>();
	
	FootballPlayer player = new FootballPlayer("손흥민", 7, "토트넘", 20);
	players.add(player);
	players.add(new FootballPlayer("케인", 10, "토트넘", 28));
	players.add(new FootballPlayer("이강인", 25, "토트넘", 19));
	players.add(new FootballPlayer("박지성", 7, "멘유", 31));
	players.add(new FootballPlayer("루니", 10, "멘유", 35));
	players.add(new FootballPlayer("루니", 10, "멘유", 35));
	players.add(new FootballPlayer("손흥민", 7, "토트넘", 20));
	
	System.out.println("보유 선수의 수 :" + players.size());
	
	for(FootballPlayer p : players) {
		System.out.println(p);
	}
		
		
		
		
		
		
		
		
		
		
		
	}

}
