package datastructure.com.interviewCode;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
a) What will happen if we throws FileNotFoundException in parent function and ArithmeticException in child function?
b) What will happen if we throws IOException in parent function and ArithmeticException in child function or Vise versa?
*/

class Parent{
	//public void printSomething() throws FileNotFoundException {
	public void printSomething() throws IOException {
		System.out.println("This is parent class");
	}
}

public class OverridingException extends Parent {
	
	//public void printSomething() throws ArithmeticException {
	//public void printSomething() throws IOException {
	public void printSomething() throws FileNotFoundException {
		System.out.println("This is child class");
	}

	public static void main(String[] args) {
		Parent p = new OverridingException();
		try {
			p.printSomething();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
