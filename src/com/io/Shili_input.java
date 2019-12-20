package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class Shili_input {

	public static void main(String[] args) throws Exception {
		FileInputStream fin=new FileInputStream("shili.xlsx");
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		//定义读取的sheet
		XSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//获取sheet的行数
		int rows=sheet.getLastRowNum();
		//System.out.println(rows);
		if(rows==0) {
			throw new RuntimeException("表格中没有数据......");
		}
		XSSFRow rowi=null;//行对象
		Iterator<Cell> cell_jihe=null;//列集合
		ArrayList list=new ArrayList();//每行数据集合对象
		Map map=new HashMap<>();
		for(int i=1;i<=rows;i++) {
			rowi=sheet.getRow(i);
			cell_jihe=rowi.cellIterator();
			list=new ArrayList();
			while(cell_jihe.hasNext()) {
				Cell cell=(Cell) cell_jihe.next();
				if(cell.getCellType()==CellType.NUMERIC) {
					list.add(cell.getNumericCellValue());
				}else if(cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}
			}
			map.put(list.get(3), list);
		}
		
		
		FileInputStream fin_dest=new FileInputStream("18rj1.xlsx");
		XSSFWorkbook workbook_in_dest=new XSSFWorkbook(fin_dest);
		//定义读取的sheet
		XSSFSheet sheet_dest=workbook_in_dest.getSheet("Sheet1");
		//获取sheet的行数
		int rows_dest=sheet_dest.getLastRowNum();
		//System.out.println(rows);
		if(rows_dest==0) {
			throw new RuntimeException("表格中没有数据......");
		}
		XSSFRow rowi_dest=null;//行对象
		
		for(int i=0;i<=rows_dest;i++) {
			rowi_dest=sheet_dest.getRow(i);
			//读取
			String xuehao=rowi_dest.getCell(3).getStringCellValue();
			ArrayList tcxxjh=(ArrayList)map.get(xuehao);
			System.out.println(tcxxjh);
			//写入
			if(tcxxjh!=null) {
				rowi_dest.createCell(15).setCellValue(tcxxjh.get(11).toString());
				rowi_dest.createCell(16).setCellValue(tcxxjh.get(12).toString());
			}
			
		}
		
		
		FileOutputStream fout=new FileOutputStream("18rj1.xlsx");
		workbook_in_dest.write(fout);
		fout.close();
		System.out.println(list);
	}

}
