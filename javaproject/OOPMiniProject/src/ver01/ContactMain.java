package ver01;

import java.util.Scanner;

public class ContactMain {

	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name;// 이름
		String pn;// 전화번호
		String email;// 이메일
		String adr;// 주소
		int bir;// 생일
		String group;// 그룹

		while (true) {
			System.out.println(" 시작 | 종료");
			String select = sc.nextLine();

			// 사용자 요청에 따라 프로그램 종료/진행 => 분기
			if (select.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!select.equals("시작")) {
				System.out.println("올바른 요청이 아닙니다.!");
				continue;
			}

			System.out.println("데이터 입력을 시작합니다.");
			System.out.println("________________");
			System.out.print("이름을 입력해 주세요-->");
			name = sc.nextLine();
			System.out.print("전화번호를 입력해 주세요-->");
			pn = sc.nextLine();
			System.out.print("이메일을 입력해 주세요-->");
			email = sc.nextLine();
			System.out.print("주소를 입력해 주세요-->");
			adr = sc.nextLine();
			System.out.print("생일을 입력해 주세요-->");
			bir = sc.nextInt();
			sc.nextLine();
			System.out.print("그룹을 입력해 주세요-->");
			group = sc.nextLine();

			Contact con = new Contact(name, pn, email, adr, bir, group);

			con.showContactInfo();
			System.out.println("계속 하시려면 시작을 입력해주시고 그만하시려면 입력를 입력해 주세요");
		}
	}
}
