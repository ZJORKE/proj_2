package com.functionalInterface_;
@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str){
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	public static void printUpper(String text,Printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		//使用lamda表达式
		printUpper("Hello",t->stu.printUpperCase(t));
		//使用方法引用的方式
		printUpper("Hello",stu::printUpperCase);
	}
}
