package proj_2;

public class constant {
public static void main(String[] args) {
	System.out.println("二进制以0b开头"+0b01101100);
	System.out.println("八进制以0开头"+0337);
	System.out.println("十六进制以0x开头"+0x56A);
	System.out.println("单精度浮点数"+5.022e+8f);
	//f是单精度浮点数
	System.out.println("双精度浮点数"+5.022e+23d);
	//d是双精度浮点数
	System.out.println("我的名字是"+'\u5f20'+'\u6653'+'\u73e3');
	System.out.println("Welcome,\n everyone");
	//布尔常量
	System.out.println("布尔常量"+true+"或"+false);
	//null常量
	System.out.println("引用数据类型"+null);
	//基本数据类型不能赋值为null
	int i=9;
	//  i=null;
	//引用数据类型可以赋值null
	constant Constant=new constant();
	Constant=null;
	final int B=6;
	
	
}
}
