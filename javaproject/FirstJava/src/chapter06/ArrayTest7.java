package chapter06;

public class ArrayTest7 {

	public static void main(String[] args) {

		// Math.random() :반환 타입은 double
		// 0.0 <= Math.random() < 1
		// 0~9
		// 0.0 * 10 <= Math.random() * 10 < 1 * 10
		// 0.0 <= Math.random() * 10 < 1 * 10
		// 0.0 <= r <= 9.9999
		// 0.0 * 10 <= (int)(Math.random() * 10 ) < 1 * 10
		// 0 <=r <=9
		System.out.println(Math.random());
		System.out.println((int) (Math.random() * 10));

		String[] players = { "손흥민", "박지성", "차범근", "안정환", "호날두", "메시" };

		// 0번지의 값과 1번지 값을 치환

		for(int i=0; i<10000; i++) {
		// 1~4
		// 0 <= <=4
		//1 <= <=5
		int randomIndex = (int)(Math.random()*5) + 1;
		
		
		String temp = null;
		temp = players[0];
		players[0] = players[randomIndex];
		players[randomIndex] = temp;
		}
		
		for(String name :players) {
			System.out.println(name);
		}
	//	System.out.println(players[0]);
	//	System.out.println(players[1]);

		// index : 0~4
		int index = ((int) (Math.random() * 6));
		String pickName = players[index];
		System.out.println(pickName);
	}
}
