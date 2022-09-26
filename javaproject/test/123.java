package SoloTest;

public class Chapter061TestMain {

	public static void main(String[] args) {

		// Student 타입의 배열을 선언하고, 요소 10개를 저장할 수 있는 배열 인스턴스를 생성해 봅시다.
		Chapter061Test[] t = new Chapter061Test[10];

		// Student 타입의 인스턴스를 생성하고 배열에 저장하는 코드를 정의해봅시다.
		for (int i = 0; i < t.length; i++) {
			t[i] = new Chapter061Test("학생" + i, (int) (Math.random() * 101), (int) (Math.random() * 101),
					(int) (Math.random() * 101));
		}
		int kot = 0;
		int ent = 0;
		int mat = 0;

		System.out.println("\t\t    성적표");
		System.out.println("---------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");

		// 배열에 저장된 Student 타입의 인스턴스의 메소드를 이용해서 모든 데이터를 출력해봅시다.
		for (Chapter061Test c : t) {
			c.Data();
			kot += c.getKo();
			ent += c.getEn();
			mat += c.getMa();
		}

		System.out.println("---------------------------------------------");
		System.out.printf("총점\t%d점\t%d점\t%d점\n", kot, ent, mat);
		System.out.println();
		System.out.printf("평균\t%.1f점\t%.1f점\t%.1f점\n", kot / 10f, ent / 10f, mat / 10f);
		System.out.println("---------------------------------------------");

	}
}
