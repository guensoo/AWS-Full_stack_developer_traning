package ex02_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PersonMethod {
	public static List<Person> find() {
		List<Person> person = new ArrayList<>();
		// 한명의 데이터를 담는 Person클래스 만들기
		// PersonMethod에서 Person테이블에서 내용을 조회해서 List로 반환하는 find()메서드 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * from person";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Person p = new Person();
				p.setIdx(rs.getInt("idx"));
				p.setName(rs.getString("name"));
				p.setAge(rs.getInt("age"));

				person.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return person;
	}

	// person테이블에 데이터를 추가하는 add메서드

	public static void add(int idx, String name, int age) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO PERSON(idx,name,age) VALUES(?,?,?)";
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			pstmt.setInt(3, age);
			rs = pstmt.executeQuery();
 
			System.out.println("추가 성공");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("추가 실패");
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
// Parent p1 = new A();
// Parent p2 = new B();
// Parent p3 = new C();
// Parent p4 = new D();
