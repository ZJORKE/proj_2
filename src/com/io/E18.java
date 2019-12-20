package com.io;

import java.nio.CharBuffer;

public class E18 {
	public static void main(String[] args) {
		CharBuffer charBuffer=CharBuffer.allocate(6);
		System.out.println("容量:"+charBuffer.capacity());
		System.out.println("界限值:"+charBuffer.limit());
		System.out.println("初始位置:"+charBuffer.position());
	 
		charBuffer.put('x');
		charBuffer.put('y');
		charBuffer.put('z');
		
		System.out.println("加入元素后的界限值:"+charBuffer.limit());
		System.out.println("加入元素后的位置:"+charBuffer.position());
		
		charBuffer.flip();
		System.out.println("执行filp()后的界限值:"+charBuffer.limit());
		System.out.println("执行filp()后的位置:"+charBuffer.position());
		System.out.println("取出的第一个元素为:"+charBuffer.get());
		System.out.println("取出后的界限值:"+charBuffer.limit());
		System.out.println("取出后的位置:"+charBuffer.position());
		
		charBuffer.clear();
		System.out.println("执行clear()后的界限值:"+charBuffer.limit());
		System.out.println("执行clear()后的位置:"+charBuffer.position());
		System.out.println("取出的第一个元素为:"+charBuffer.get(0));
		System.out.println("取出后的界限值:"+charBuffer.limit());
		System.out.println("取出后的位置:"+charBuffer.position());
		}
}
