import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Database 처리 과정
// 1. Database 연결 : Connection
// 2. SQL문 실행을 위해 statement 얻어오기 : Statement, PreparedStatement : conn.createStatement()
// 3. SQL문 문자열로 작성
// 4. 쿼리문 실행 : executeUpdate(insert, delete, update), executeQuery(select) : stmt.excuteUpdate()
public class UserDB {
// Database 연결
//1. Driver 설정
//2. url 설정
//3. username 설정
//4. password 설정
	public static Connection getConnection() {  //연결
		Connection conn = null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");  //Driver 설정
			conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/testdb", "root", "7564");
//			System.out.println("DB 연결 성공");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		} 
		return conn;
	}
	
	public static void close(Connection conn) {  //반납
		try {
			if(conn != null) conn.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void insertUser(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;  //반납하기 위해 선언
		String sql = String.format("insert into user(id, name) values('%s', '%s')", id, name);
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);  //sql이 insert, update, delete이면 executeUpdate() 사용
			System.out.println(cnt + "개 데이터 삽입");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void userInfo(String id) {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rset = null;
		String sql = String.format("select id, name from user where id='%s'", id);
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset != null && rset.next()) {  //행을 하나씩 이동하면서 여러개의 행을 가져오는 것
				String rid = rset.getString("id");
				String rname = rset.getString("name");
				System.out.println(rid + "," + rname);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rset != null) rset.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void updateUserName(String id, String name) {
		Connection conn = getConnection();
		Statement stmt = null;
		String sql = String.format("update user set name = '%s' where id = '%s'", name, id);
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt + "개 데이터 변경");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void deleteUser(String id) {
		Connection conn = getConnection();
		Statement stmt = null;
		String sql = String.format("delete from user where id = '%s'", id);
		try {
			stmt = conn.createStatement();
			int cnt = stmt.executeUpdate(sql);
			System.out.println(cnt +"개 데이터 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void allUserInfo() {
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rset = null;
		String sql = "select * from user";
		try {
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql);
			if(rset != null) {
				while(rset.next()) {  //반복문을 통해 전체 데이터 가져오기
					String rid = rset.getString(1);
					String rname = rset.getString(2);
					System.out.println("id:" + rid + "," + " name:" + rname);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rset != null) rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	
	public static void main(String[] args) {
//		insertUser("song", "송송송");
//		updateUserName("song", "송송이");
//		userInfo("song");
//		deleteUser("song");
		allUserInfo();
	}
}
