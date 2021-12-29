package datastructure.com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionOverridingChild extends CheckedExceptionOverridingParent {
	
	//public void print() throws RuntimeException {
	public void print() throws ArithmeticException {
	//public void print() throws IOException {
	//public void print() throws FileNotFoundException {
		System.out.println("this is child class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckedExceptionOverridingParent ob = new CheckedExceptionOverridingChild();
		try {
			ob.print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
