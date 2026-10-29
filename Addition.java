package com.Consturctor;

public class Addition {
	int a;
	int b;
	int sum;

	public Addition(int x, int y) {
		a = x;
		b = y;
		sum = a + b;

	}

	public static void main(String[] args) {
		Addition obj = new Addition(25, 30);
		System.out.println(obj.sum);
	}

}
