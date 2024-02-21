import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ArticleDB {
	public static Connection getConnection() {  //연결
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("props.properties"));  //props.properties파일 읽어들이기
			
			Class.forName(db.getProperty("driver"));  //Driver 설정
			conn = DriverManager.getConnection(db.getProperty("url")
											, db.getProperty("user")
											, db.getProperty("password"));
//			System.out.println("DB 연결 성공");
		} catch(Exception e) {
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
	
	public static void insertArticle(Article article) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "insert into article(title, content, writer) values(?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getTitle());  //첫번째 ? 에 데이터 채워주기
			pstmt.setString(2, article.getContent());  //두번째 ? 에 데이터 채워주기
			pstmt.setString(3, article.getWriter());  //세번째 ? 에 데이터 채워주기
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 데이터 삽입");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void selectArticleByWriter(String writer) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from article where writer = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, writer);  //물음표에 데이터 세팅
			rset = pstmt.executeQuery();  //쿼리 결과를 ResultSet에 넣어줌
			if(rset != null) {
				while(rset.next()) {  //반복문을 통해 쿼리 전체 출력
					int num = rset.getInt(1);  //첫번째 컬럼 데이터
					String title = rset.getString(2);  //두번째 컬럼 데이터
					String content = rset.getString(3);  //세번째 컬럼 데이터
					String id = rset.getString(4);  //네번째 컬럼 데이터
					Article article = new Article(num, title, content, id);
					System.out.println(article);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rset != null) rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void updateArticle(int num, String title, String content) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update article set title = ?, content = ? where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setInt(3, num);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 데이터 변경");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void deleteArticle(int num) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "delete from article where num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "개 데이터 삭제");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public static void main(String[] args) {
//		insertArticle(new Article("스포츠", "축구협회", "gong"));
		selectArticleByWriter("hong");
//		updateArticle(1, "헤드라인뉴스", "창원시, 수소차량 1대 당 보조금 3310만 원 지급");
//		deleteArticle(1);
	}
}
