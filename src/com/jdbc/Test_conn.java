package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test_conn {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		//使用用户名，密码连接mysql数据库
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zxx","root","123456");
		//通过连接对象获取语句对象
		Statement yuju=conn.createStatement();
		//定义sql
		String sql="UPDATE tb_user set email='Jack@qq.com' where id=1";
		//执行sql语句
		yuju.execute(sql);
	
	}
}
