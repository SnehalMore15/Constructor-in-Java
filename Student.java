package com.Consturctor;

public class Student {

	int id;
	String Name;

	public Student() {
		id = 101;
		Name = "Snehal";

	}

	void display() {
		System.out.println(id);
		System.out.println(Name);

	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
	}

}
