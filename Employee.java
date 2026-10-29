package com.Consturctor;

public class Employee {
	int id;
	String Name;

	public Employee(int a, String b) {
		id = a;
		Name = b;
		System.out.println(id);
		System.out.println(Name);

	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "Snehal");
		e.id = 102;
	}

}
