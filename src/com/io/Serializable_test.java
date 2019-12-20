package com.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable_test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Person p1=new Person(30,"朱一龙");
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(p1);
		
		ObjectInputStream oin=new ObjectInputStream(new FileInputStream("person.txt"));
		Person p=(Person) oin.readObject();
		System.out.println(p);
	}
}
