package com.String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class E19 {
	public static void main(String[] args) throws ParseException {
	Date date1=new Date();
	Date date2=new Date(System.currentTimeMillis()+1000);
	System.out.println(date1);
	System.out.println(date2);
	
	SimpleDateFormat s=new SimpleDateFormat("Gyyyy年MM月dd日 HH:mm:ss E");
	System.out.println(s.format(new Date()));
	
	
	Calendar calendar=Calendar.getInstance();
	int year=calendar.get(calendar.YEAR);
	int month=calendar.get(calendar.MONTH)+1;
	int date=calendar.get(calendar.DATE);
	int hour=calendar.get(calendar.HOUR);
	int minute=calendar.get(calendar.MINUTE);
	int second=calendar.get(calendar.SECOND);
	
	System.out.println("当前时间为:"+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
	
	calendar.set(year,month,date);
	calendar.add(Calendar.DATE,100);
	year=calendar.get(Calendar.YEAR);
	month=calendar.get(Calendar.MONTH);
	date=calendar.get(Calendar.DATE);
	System.out.println("100天以后是"+year+"年"+month+"月"+date+"日");
	
	
	LocalDate  dqrq=LocalDate.now();
	System.out.println("100天以后是"+dqrq.plusDays(100));
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
	String str="2019/10/18";
	System.out.println(sdf.parse(str));
	SimpleDateFormat sdf4=new SimpleDateFormat("yyyy年MM月dd日");
	System.out.println(sdf4.format(date1));
	
	
	String str1=new String("abc");
	String str2=new String("abc");
	System.out.println("str1");
	System.out.println("str2");
	System.out.println("str1==str2");
	System.out.println(str1.equals(str2));
	
	
	
	
	
	
	
	
	}
}
