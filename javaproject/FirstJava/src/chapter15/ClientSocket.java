package chapter15;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) {
		
		try {
			Socket s = new Socket("localhost", 8888);
			DataOutputStream dout =new DataOutputStream(s.getOutputStream());
			
		    dout.writeUTF("안녕하세요 손흥민입니다.");
		    dout.flush();
		    
		    dout.close();
		    s.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
}
