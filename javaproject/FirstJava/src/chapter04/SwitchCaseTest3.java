package chapter04;

public class SwitchCaseTest3 {

	public static void main(String[] args) {

		String grade = "admin";
		// admin / manager/ member/ anyone

		// 쓰기 / 읽기 / 회원 승인 / 지표 보기
		if (grade.equals("admin")) {
			System.out.println("지표보기 기능 가능");
			System.out.println("회원 승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("manager")) {
			System.out.println("회원 승인 가능");
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else if (grade.equals("member")) {
			System.out.println("쓰기 기능 가능");
			System.out.println("읽기 가능");
		} else {
			System.out.println("읽기 가능");
		}

		switch (grade) {
		case "admin":
			System.out.println("지표보기 기능 가능");
		case "manager":
			System.out.println("회원승인 가능");
		case "member":
			System.out.println("쓰기 기능 가능");
		default:
			System.out.println("읽기 가능");
		}
	}
}
