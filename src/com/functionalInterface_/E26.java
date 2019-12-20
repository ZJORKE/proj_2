package com.functionalInterface_;
@FunctionalInterface
interface PersonBuilder{
	Person Builderperson(String name);
}
//定义一个person类，并添加有构造方法
class Person{
	private String name;

	public Person(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}
}
public class E26 {
	public static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.Builderperson(name).getName());
	}
	public static void main(String[] args) {
		printName("朱一龙",new PersonBuilder() {
			@Override
			public Person Builderperson(String name) {
				return new Person(name);
			}
		});
		printName("李栋旭",name->new Person(name));
		printName("罗云熙",Person::new);
	}
}
