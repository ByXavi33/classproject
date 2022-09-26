package chapter07;

public class Buyer {

	int money;
	int myPoint;
	
	Buyer(int money){
		this.money = money;
	}
	
	
	void buy(Product p) {
		
		money = money - p.price; // 내가 가진돈 차감
		// 보너스는 증가
		myPoint += p.point;
		System.out.println(p + "제품을 구매했습니다");
		
	}
}
