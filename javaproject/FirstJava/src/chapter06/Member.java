package chapter06;

public class Member {

	private int memberNo;
	private String memberId;
	private String memberName;

	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return "회원 정보 [회원 번호=" + memberNo + ", 아이디=" + memberId + ", 이름=" + memberName + "]";
	}

	public static void main(String[] args) {

		// 회원 5명의 정보를 저장할수 있는 배열
		Member[] members = new Member[5];

		// 각 배열의 요소에 초기화
		members[0] = new Member(1, "cool", "COOL");
		members[1] = new Member(2, "hot", "HOT");
		members[2] = new Member(3, "son", "SON");
		members[3] = new Member(4, "good", "GOOD");
		members[4] = new Member(5, "yes", "YES");
		
		// 배열을 이용해서 각 객체의 값을 참조해서 출력
		for(int i=0; i<members.length; i++) {
			System.out.printf(
					"%d번 회원의 아이디는 %s이고, 이름은 %s이다.\n"
					,members[i].getMemberNo()
					,members[i].getMemberId()
					,members[i].getMemberName()
					
					);
		}
		
		
		// sp2 = sp1
		
		for (Member member :members) {
			System.out.println(member);  //member.String()
		}
	}

}
