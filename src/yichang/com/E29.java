package yichang.com;

public class E29 {
	public static int divide(int x,int y) {
		try {
		int result=x/y;
		return result;
	}catch(Exception e) {
		System.out.println("捕获的异常信息为:"+e.getLocalizedMessage());
	}finally {
		System.out.println("不论是否被零除,上面都做了一个除法");
	} 
		return -1;
}
	public static void main(String[] args) {
		int result=divide(4, 0);
		if(result==-1) {
			System.out.println("程序发生异常！");
		}else {
			System.out.println(result);
		}
	}
}