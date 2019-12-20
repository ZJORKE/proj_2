package com.String;

import java.util.HashSet;
import java.util.Random;

import org.apache.poi.hssf.usermodel.HSSFCell;

public class Seqiu {
	public static void main(String[] args) throws InterruptedException{
		System.out.println("双色球开奖结果：");
		System.out.println("六个红球号码是：");
		Random  r=new   Random();
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<1000;i++) {
			int hq=r.nextInt(33)+1;
			if(hs.size()==6) {
				break;
			}
			hs.add(hq);
		}
		for(Integer hq:hs) {
			System.out.println(hq+"");
			Thread.sleep(1000);
		}
		
		System.out.println("一个蓝球号码是：");
		Random  r1=new   Random();
		int lq;
		for(int i=0;i<6;i++) {
			lq=r1.nextInt(16)+1;
			System.out.println(lq+"");
			Thread.sleep(1000);
	}
	}
}
