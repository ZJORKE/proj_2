package com.String;

public class Zhuanhuan {
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		String dglzfc=s.reverse().toString();
		System.out.println(dglzfc);
		char[]  zfsz=dglzfc.toCharArray();
		for  (int i=0;i<zfsz.length;i++) {
			char c=zfsz[i];
			if (Character.isUpperCase(c)) {
				String dxbxx=(""+c).toLowerCase();
				s.append(dxbxx);
			}else if (Character.isLowerCase(c)) {
				String dxbxx=(""+c).toUpperCase();
				s.append(dxbxx);
				 
			}
		}
		System.out.println(s);
	}
}
