package dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import acc.Account;
import acc.SpecialAccount;
import exp.BankError;
import exp.BankException;

public class AccountDAO {

	public Connection getConnection() {
		Connection conn = null;
		try {
			Properties db = new Properties();
			db.load(new FileInputStream("db.properties"));
			Class.forName(db.getProperty("driver"));  //key를 통해 value 읽어오기
			conn = DriverManager.getConnection(db.getProperty("url")
											 , db.getProperty("user")
											 , db.getProperty("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public boolean insertAccount(Account acc) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "";
		if(acc instanceof SpecialAccount) {
			sql = "insert into account (id, name, balance, grade) values (?, ?, ?, ?)";
		} else {
			sql = "insert into account (id, name, balance) values (?, ?, ?)";
		}
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, acc.getId());
			pstmt.setString(2, acc.getName());
			pstmt.setInt(3, acc.getBalance());
			if(acc instanceof SpecialAccount) {
				pstmt.setString(4, ((SpecialAccount)acc).getGrade());
			}
			pstmt.executeUpdate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public void updateAccount(Account acc) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update account set balance = ? where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, acc.getBalance());
			pstmt.setString(2, acc.getId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public Account selectAccount(String id) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Account acc = null;
		String sql = "select * from account where id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null && rs.next()) {
				String rid = rs.getString("id");
				String rname = rs.getString("name");
				int rbalance = rs.getInt("balance");
				String rgrade = rs.getString("grade");
				if(rgrade == null) {
					acc = new Account(rid, rname, rbalance);
				} else {
					acc = new SpecialAccount(rid, rname, rbalance, rgrade);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
		return acc;
	}
	
	public List<Account> selectAccountList(){
		Connection conn = getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		List<Account> accountList = new ArrayList<>();
		String sql = "select * from account";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if(rs != null) {
				while(rs.next()) {
					String id = rs.getString("id");
					String name = rs.getString("name");
					int balance = rs.getInt("balance");
					String grade = rs.getString("grade");
					if(grade == null) {
						accountList.add(new Account(id, name, balance));
					} else {
						accountList.add(new SpecialAccount(id, name, balance, grade));
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt != null) stmt.close();
				if(rs != null) stmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
		return accountList;
	}
	
	public void transferAccount(String sendId, String recvId, int money) throws BankException {
		Account sendAcc = selectAccount(sendId);
		if(sendAcc == null) throw new BankException(BankError.NO_SENDID);
		Account recvAcc = selectAccount(recvId);
		if(recvAcc == null) throw new BankException(BankError.NO_RECVID);
		
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "update account set balance = ? where id = ?";  //계좌이체시(입금, 출금시) 사용
		try {
			//두번째 처리에서 예외가 발생했을 때 rollback으로 되돌리기 위해 setAutoCommit
			conn.setAutoCommit(false);  // transction 처리 시작 <자동커밋(물리적으로 커밋,롤백..DB반영X) 끄기>
			//보내는 계좌의 출금처리
			sendAcc.withdraw(money);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, sendAcc.getBalance());
			pstmt.setString(2, sendAcc.getId());
			pstmt.executeUpdate();
			pstmt.close();
			
			//받는 계좌의 입금처리
			recvAcc.transDeposit(money);
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, recvAcc.getBalance());
			pstmt.setString(2, recvAcc.getId());
			pstmt.executeUpdate();
			
			//두번째 처리까지 예외없이 잘 처리됐다면 commit
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				conn.setAutoCommit(true);  //자동커밋 원상복귀
			} catch (Exception e) {
				e.printStackTrace();
			}
			close(conn);
		}
	}
	
	public void close(Connection conn) {
		try {
			if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
