package ex02_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// DB연결 전담 클래스
public class DBUtil {
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	// jdbc : 자바 db연결
	// oracle : oracle db를 의미
	// thin : 오라클에서 제공하는 경량 드라이버
	// localhost : db기본 주소(자기 컴퓨터)
	// 1521 : 기본포트
	// xe : 오라클 SID
	private static final String user = "hr"; // 아이디
	private static final String password = "hr"; // 비밀번호
		
	// getConnection() 메서드를 호출하면 db와 연결할 수 있는
	// conn 객체를 얻을 수 있다.
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url,user,password);
	}
}
