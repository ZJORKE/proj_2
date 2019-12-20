package proj_2;

public class Student {
	//定义两个成员变量
	//private:类可见性 当前属性只能在被访问中恢复
	//将成员变量定义为私有的，就是类的封装
	//外部方法要访问这个成员变量,必需通过共有的getter setter 方法
	String name;//字符串类型的姓名
	int score;//整形的成绩
	//如果没有定义的任何方法，java虚拟机会自动创建一个无参的构造方法
	//如果有了带参数的构造方法，java虚拟机将不会自动创建一个无参的构造方法
	//不管什么情况，都给类添加一个无参的构造方法
	//定义无参的构造方法
	//构造方法是一种特殊的犯法：修饰符+类名([参数类型  参数名])   {}
	//get:获取     set:设置                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public Student() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
}
