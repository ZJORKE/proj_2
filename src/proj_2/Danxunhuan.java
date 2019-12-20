package proj_2;

import java.text.AttributedString;

public class Danxunhuan {
	public static void main(String[] args) {
		String[]zx={"管理学院","音乐学院","设计学院","表演学院","中专部","教育学院","轮空"};
/*0 1 2 3 4 5
 * 第一轮
 *0 5 1 4 2 3
 * 第二轮
 *0 5 1 2 3 4
 *0 4 5 1 2 3
 *第三轮
 *0 4 5 1 2 3
 *0 3 4 2 5 1
 *第四轮
 *0 3 4 2 5 1
 *0 1 3 5 4 2
 *第五轮
 *0 1 3 5 4 2
 *0 2 1 4 3 5
 **/
	for(int i=0;i<zx.length;i++) {
		System.out.println("第"+i+"轮:");
	if(i>1) {
		String stemp=zx[zx.length-1];
		for (int k=zx.length-1;k>1;k--) {
			zx[k]=zx[k-1];
		}
		zx[1]=stemp;
	}
		for(int j=0;j<zx.length/2;j++) {
			System.out.println(zx[j]+"vs"+zx[zx.length-j-1]);
			
			
		}
	}	
	}

}
