/**
 *  a better method is given by the following:
 *  1. http://www.cnblogs.com/liuxianan/archive/2012/08/05/2624300.html
 *  2. http://docs.oracle.com/cd/E14545_01/help/oracle.eclipse.tools.database.doc/html/gettingStarted/files/gettingStarted.html
 */
package connect_oracle;

import java.sql.*;
import java.util.Scanner;

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
		Connection con = null; //创建一个数据库连接
		PreparedStatement pre = null;//创建预编译语句对象，一般不使用Statement
		ResultSet rs = null;//创建一个结果集对象

		Scanner scan=new Scanner(System.in);
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("开始尝试连接数据库...");
			
			//读取数据库地址
			System.out.println("请输入数据库地址和名称，格式如下：\n 数据库地址:端口号:数据库名称");
			String url = "jdbc:oracle:thin:@"+scan.next();
			
			//读取用户名和密码
			System.out.print("\n 用户名:");
			String usr=scan.next();
			System.out.print("\n 密码:");
			String pwd=scan.next();

			//创建数据库连接
			con=DriverManager.getConnection(url,usr,pwd);
			System.out.println("数据库连接成功！");

			//执行sql查询
			String sql = "select * from fj where name = 'fj'";
			pre = con.prepareStatement(sql);
			rs=pre.executeQuery();
			
			while(rs.next())
			{
				System.out.println(rs.getString("name"));
			}
		} catch (ClassNotFoundException e) 
		  {
			e.printStackTrace();
		  }
		  catch (SQLException e)
		  {
			 e.printStackTrace();
		  }
		  finally 
		  {
			 try 
			 {// 逐一关闭，后创建的首先关闭
				  if (rs != null) 
				  {
					  rs.close();
					  rs=null;
				  }
				  if (pre!=null) 
				  {
					  pre.close();
					  pre=null;
				  }
				  if (con!=null) 
				  {
					  con.close();
					  con=null;
				  }
				  
			  }
			 catch (SQLException e) 
			  {
				  e.printStackTrace();
			  }
		 }
	   }
	}
