package com.ms.attempt1;

public class SuperParentClass {

	int number;

	public SuperParentClass(int number) {
		this.number = number;
	}

	private void method1() {
		System.out.println("From Father method1()");
	}

	protected void method2() {
		System.out.println("From Father method2()");
	}

}
