package com.Consturctor;

public class Multiplication {
	int num1;
	int num2;
	int mul;

	public Multiplication(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		mul = num1 * num2;

	}

	public static void main(String[] args) {
		Multiplication mm = new Multiplication(4, 5);
		System.out.println(mm.mul);
	}

}
