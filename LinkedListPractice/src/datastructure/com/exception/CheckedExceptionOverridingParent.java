package datastructure.com.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionOverridingParent {

	//public void print() throws RuntimeException {
	public void print() throws ArithmeticException {
	//public void print() throws FileNotFoundException {
	//public void print() throws IOException {
		System.out.println("this is parent class");
	}

}
