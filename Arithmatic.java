package com.Consturctor;

public class Arithmatic {

	int num1;
	int num2;
	int add, sub, mul, div;

	public Arithmatic(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		add = num1 + num2;
		sub = num1 + num2;
		mul = num1 * num2;
		div = num1 / num2;

	}

	public static void main(String[] args) {
		Arithmatic mm = new Arithmatic(10, 5);
		System.out.println(mm.add);
		System.out.println(mm.sub);
		System.out.println(mm.div);
		System.out.println(mm.mul);
	}

}
