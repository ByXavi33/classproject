package chapter08;

public class OuterClass extends Object{

	   private String name;
	   private int num;
	   
	   public OuterClass(String name) {
	      this.name = name;
	      this.num = 0;
	   }

	   public void tellYourName() {
	      System.out.println("OuterClass Name : " + this.name + " - " + num++);
	   }
	   
	   // 내부 클래스 : 클래스 내부의 다른 클래스를 정의
	   // 캡슐화 : 클래스를 외부에 노출하지 않아야 할 때
	   // 이벤트 클래스들이 내부클래스로 구성되어있다.
	   class InnerClass{
	      
	      InnerClass() {
	         tellYourName();
	      }
	   
	   }
}
