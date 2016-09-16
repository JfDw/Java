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
		Connection con = null; //����һ�����ݿ�����
		PreparedStatement pre = null;//����Ԥ����������һ�㲻ʹ��Statement
		ResultSet rs = null;//����һ�����������

		Scanner scan=new Scanner(System.in);
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("��ʼ�����������ݿ�...");
			
			//��ȡ���ݿ��ַ
			System.out.println("���������ݿ��ַ�����ƣ���ʽ���£�\n ���ݿ��ַ:�˿ں�:���ݿ�����");
			String url = "jdbc:oracle:thin:@"+scan.next();
			
			//��ȡ�û���������
			System.out.print("\n �û���:");
			String usr=scan.next();
			System.out.print("\n ����:");
			String pwd=scan.next();

			//�������ݿ�����
			con=DriverManager.getConnection(url,usr,pwd);
			System.out.println("���ݿ����ӳɹ���");

			//ִ��sql��ѯ
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
			 {// ��һ�رգ��󴴽������ȹر�
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
