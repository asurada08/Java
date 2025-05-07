/*
Transaction
Transaction 여러개의 작업을 하나의 논리적인 작업 단위로 묶어주는 것을 말한다
하나의 작업 단위 내의 전체 작업들이 모두 올바르게 수행되거나(commit:DB에 반영함) 
또는 전체 작업이 모두 수행되지 않도록 한다(rollback:디비에 반영취소)

Connection의 Transaction 관련 메소드
void commit() : 트랜잭션으로 설정된 모든 자원을 DB에 반영한다
void rollback() : 현재 트랜잭션에 설정내의 모든 작업을 되돌린다
void rollback(Savepoint s) : Savepoint 설정 이후의 모든 작업을 되돌림
void setSavepoint(String name) : 현재의 트랜잭션내의 Savepoint를 설정
void setAutocommit(boolean value) : auto-commit 기능을 설정한다

프로그램은 auto-commit 됨
 */
package transaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC_Ex02_pre_transaction {

	public static void main(String[] args) {
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?)");//deptno, dname, college, loc
		
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname=?,loc=? ");//dname, loc
		sql2.append("where deptno=?");//deptno=deptno
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//--------------transaction 시작--------------
			//하나의 논리적인 작업단위 시작
			conn = ConnUtil.getConnection();
			
			//autoCommit 기능 비활성화 시킨다
			conn.setAutoCommit(false);//기본이 true
			//--------------1번 작업시작 : 삽입작업--------------
			pstmt = conn.prepareStatement(sql1.toString());
			pstmt.setInt(1, 201);//deptno 부서번호
			pstmt.setString(2, "국어국문학과");//dname 부서명
			pstmt.setInt(3, 100);//college 상위부서
			pstmt.setString(4, "10호관");//loc 위치
			pstmt.executeUpdate();
			//--------------1번 작업 끝 : 삽입작업--------------
			//--------------2번 작업시작 : 수정작업--------------
			pstmt = conn.prepareStatement(sql2.toString());
			pstmt.setString(1, "전자계산학과");
			pstmt.setString(2, "5호관");
			pstmt.setInt(3, 102);
			pstmt.executeUpdate();
			//--------------2번 작업 끝 : 수정작업--------------
			//쿼리가 정상적으로 실행된 경우 DB에 반영
			conn.commit();
			System.out.println("DB에 반영됨...");
			//--------------transaction 끝--------------
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("DB반영 취소");
			} catch (SQLException e1) {
				e1.getMessage();
			}
		} finally {
			ConnUtil.close(pstmt, conn);
		}
	}

}
