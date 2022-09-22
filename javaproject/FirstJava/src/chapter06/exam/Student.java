package chapter06.exam;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;

	public Student(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	// 총점을 구해서 반환하는 메소드
	public int sum() {
		int result = 0;

		result = kor + eng + mat;

		return result;
	}
	
	// 평균값을 구해서 반환하는 메소드
	public float avg() {
		
		return sum()/3f;
	}

	// 행 단위 출력
	public void printData() {
		System.out.print(this.name + "\t" + 
	                     this.kor + "\t" +
				         this.eng + "\t" +
	                     this.mat + "\n"
	             		);
	                    

	}

	public static void main(String[] args) {
		
		Student s = new Student("손흥민", 88, 75,62);
		
		System.out.println("합 :" +s.sum());
		System.out.println("평균 " +s.avg());
		
		s.printData();
		
		
	}
}
