package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	
	public static List<Emp> find(String job){
		List<Emp> list = new ArrayList<>();
		
		// EMP테이블에서 사원번호(EMPNO), 이름(ENAME), 직종(JOB), 급여(SAL)
		// 을 조회해서 하나의 행을 Emp객체에 넣은 후 그 객체들을 ArrayList에 담아서
		// 반환하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT empno, ename, job, sal from emp where job= ?";
		
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			// 첫번째 물음표 자리에 매개변수로 들어온 job 값으로 채워라
			pstmt.setString(1,  job);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setSalary(rs.getInt("sal"));
				
				list.add(emp);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return list;
	}
}
