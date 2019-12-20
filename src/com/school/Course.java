package com.school;

public class Course {
	String course_id;
	String course_name;
	String course_book;
	public Course(String course_id, String course_name, String course_book) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.course_book = course_book;
	}
	public Course() {
		super();
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	
}