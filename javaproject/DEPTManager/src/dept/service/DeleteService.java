package dept.service;

import java.sql.Connection;
import java.sql.SQLException;

import dept.dao.Dao;
import dept.dao.OracleDao;
import dept.util.ConnectionProvider;

public class DeleteService {

	Dao dao = new OracleDao();

	public int delete(int deptno) {

		int result = 0;
		Connection conn = null;

		try {
			conn = ConnectionProvider.getConnection();

			result = dao.delete(conn, deptno);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;

	}

}
