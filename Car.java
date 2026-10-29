package com.Consturctor;

public class Car {
	String name;
	int price;

	public Car(String n, int p) {
		name = n;
		price = p;
		System.out.println(name);
		System.out.println(price);

	}

	public static void main(String[] args) {
		Car c = new Car("BMW", 500000);
		c.name = "Audi";
	}
}
