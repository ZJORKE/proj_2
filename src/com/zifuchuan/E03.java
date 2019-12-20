package com.zifuchuan;

public class E03 {
	public static void main(String[] args) {
		String str ="zxx15586330307我的电话";
		char[]charArray=str.toCharArray();
		System.out.println("将字符串转为字符数组的遍历结果:");
		//foreach循环
		/*for(char zf:charArray) {
			if(str.endsWith(""+zf))
				System.out.print(zf);
			else 
				System.out.print(zf+"");
		}*/
		/*for (int i=0;i<charArray.length;i++) {
			if(i !=charArray.length-1) {
				System.out.print(charArray[i]+",");
			}else {
				System.out.println(charArray[i]);
			}
		}*/
		for(char zf:charArray) {
			if(zf>='\u4E00'&&zf<='\u9FA5')
				System.out.print(zf);
		}
		System.out.println("\n将int值转换为String类型之后的结果："+String.valueOf(12));
		System.out.println("将字符串转换成大写之后的结果："+str.toUpperCase());
	}

}
