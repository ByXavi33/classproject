package dept.controller;

import dept.Main;
import dept.service.DeleteService;

public class DeleteController implements Controller {
	
	DeleteService service = new DeleteService();
	
	public void process() {
		
		// 사용자의 요청 데이터 받고
		System.out.println("부서 삭제가 진행됩니다.");
		
		System.out.println("삭제할 부서 번호 >>");
		int deptno = Integer.parseInt(Main.sc.nextLine());
		
		// 삭제 처리
		int result = service.delete(deptno);
		
		// 결과 출력
		if(result > 0) {
			System.out.println("삭제되었습니다.");			
		} else {
			System.out.println("삭제 실패!");
		}
		
	}

}
