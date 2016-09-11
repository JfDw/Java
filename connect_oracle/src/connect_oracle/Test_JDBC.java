/**
 *  a better method is given by the following:
 *  1. http://www.cnblogs.com/liuxianan/archive/2012/08/05/2624300.html
 *  2. http://docs.oracle.com/cd/E14545_01/help/oracle.eclipse.tools.database.doc/html/gettingStarted/files/gettingStarted.html
 */
package connect_oracle;

import java.sql.*;

/**
 * @author 1HBLSQT
 *
 */
public class Test_JDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ResultSet rs=null;
		Statement stmt=null;
		Connection conn=null;
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// new oracle.jdbc.river.OracleDriver();
			conn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:yuewei", "scott", "tiger");
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select * from dept");
			while(rs.next())
			{
				System.out.println(rs.getString("deptno"));
			}
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		 } catch (SQLException e)
		{
			 e.printStackTrace();
		}finally 
		{
			 try 
			 {
				  if (rs != null) 
				  {
					  rs.close();
					  rs=null;
				  }
				  if (stmt!=null) 
				  {
					  stmt.close();
					  stmt=null;
				  }
				  if (conn!=null) 
				  {
					  conn.close();
					  conn=null;
				  }
				  
			  } catch (SQLException e) 
			 {
				  e.printStackTrace();
			 }
		  }
		}
	}
