package com.ms.attempt1;

public class SuperChildClass extends SuperParentClass {
	int count;

	public SuperChildClass(int count, int num) {
		super(num);
		this.count = count;
	}

	// This line inserted as answer
	public SuperChildClass(int count) {
		super(0);
		this.count = count;

		// this.count = count;

		// this(count,0);

		/*
		 * super(); this.count = count;
		 */

		/*
		 * super(0); this(count,0);
		 */
	}

	// new method1() method
	// This method is unique to Child class
	private void method1() {
		System.out.println("From Child method1()");
	}

	// overriding method
	// with greater accessibility
	public void method2() {
		System.out.println("From Child method2()");
	}

	public static void main(String args[]) {
		//SuperParentClass obj = new SuperChildClass(0, 0);
		SuperChildClass obj = new SuperChildClass(0, 0);
		obj.method1();
	}

}
