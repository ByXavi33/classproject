package chapter12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	
	public static void main(String[] args) {
		
		//BufferedWriter out = null;
		
		try(BufferedWriter out = new BufferedWriter (new FileWriter("C:\\test\\text2.txt"));) {
			//out = new BufferedWriter (new FileWriter("C:\\test\\text2.txt"));
			
			out.write("이 협정은 양국이 우크라이나 전쟁 중에도 우주 협력의 끈을 완전히 놓지 않았다는 상징적인 의미가 있다.");
			out.newLine();
			out.write("앞서 미국 우주비행사 프랭크 루비오는 이 협정에 따라 지난달 카자흐스탄 바이코누르 우주센터에서 러시아의 소유스 우주선을 타고 ISS로 향했다.");
			out.newLine();
			out.write("이어 이번에는 러시아 역사상 다섯번째 여성 우주인인 키키나가 NASA 및 일본 우주항공연구개발기구(JAXA) 소속 우주비행사 3명과 함께 스페이스X 유인 캡슐에 몸을 실었다.");
			out.newLine();
			out.newLine();
			out.write("네이버 기사 참조");
			
			System.out.println("작성 완료");
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
