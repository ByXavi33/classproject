package chapter06.exam;

public class StudentMain {

	public static void main(String[] args) {

		// 학생 10명의 정보를 저장하는 배열
		Student[] students = new Student[5];

		// 점수 초기화
		for (int i = 0; i < students.length; i++) {

			students[i] = new Student("학생" + i, 
					           (int) (Math.random()* 81) + 20,
					           (int) (Math.random() * 81) + 20,
					           (int) (Math.random() * 81) + 20
					           );
		}
		int engTotal = 0;
		int korTotal = 0;
		int matTotal = 0;

		System.out.println("성적표");
		System.out.println("----------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t");
		System.out.println("----------------------------------------------");

		for (Student s : students) {
			s.printData();
			korTotal += s.getKor();
			engTotal += s.getEng();
			matTotal += s.getMat();
		}
	}
}
		
