package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Shili_input {
	public static void main(String[] args) throws Exception {
		//excel文件输入流
		FileInputStream fin=new FileInputStream("shili.xlsx");
		//获得excel文件的workbook
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		//获得workbook的第一个表格sheet1
		XSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//获得这个表格里的行数
		int rows=sheet.getLastRowNum();
		for(int i=1;i<=rows;i++) {
			//获取这个表格从第二行开始的每一行
			XSSFRow row=sheet.getRow(i);
			//获取每一行中的第四个单元格
			XSSFCell cell=row.getCell(3);
			//从这个单元格中取出字符串值保存在xuehao变量中
			String xuehao=cell.getStringCellValue();
			//获取每一行中的第16个单元格
			XSSFCell cell16=row.getCell(15);
			//从这个单元格中取出字符串值保存在z_shili变量中
			String z_shili=cell16.getStringCellValue();
			//获取每一行中的第17个单元格
			XSSFCell cell17=row.getCell(16);
			//从这个单元格中取出字符串值保存在y_shili变量中
			String y_shili=cell17.getStringCellValue();
			System.out.println(xuehao);
			System.out.println(z_shili);
			System.out.println(y_shili);
			//注册驱动
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zxx?characterEncoding=UTF-8","root","123456");
			//通过驱动获取链接
			Statement yuju=lianjie.createStatement();
			String sql="update 18rj1 set `左眼视力`='"+z_shili+"' where`学号`='"+xuehao+"'";
			String sql1="update 18rj1 set `右眼视力`='"+y_shili+"' where`学号`='"+xuehao+"'";
			yuju.execute(sql);
			yuju.execute(sql1);
		}
	}
	
}
