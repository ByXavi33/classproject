package dept.service;

import dept.dao.Dao;
import dept.dao.OracleDao;
import dept.domain.Dept;

public class SelectByService {

	Dao dao = new OracleDao();
	
	public Dept selectByDeptno(int deptno) {
		
		Dept dept = null;
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
		} finally {
			
		}
				
		
	}
}
