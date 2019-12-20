package proj_2;

public class Test5 {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		System.out.println("先加表达式的值等于变量的值加1，也就是"+(++j));
		System.out.println("后加表达式的值等于变量的值,也就是"+(i++));
		System.out.println("不管是先加还是后加变量的值都加1,也就是"+j);
		System.out.println("不管是先加还是后加变量的值都加1,也就是"+i);
		//赋值运算
		int s=2;
		s+=2;
		System.out.println("s="+s);     
		//比较运算符   ==
		String s1="everyone";
		String s2="everyone";
		System.out.println(s1==s2);
		Test3 t1=new Test3();
		Test3 t2=new Test3();
		System.out.println(t1==t2);
		
	}
}
