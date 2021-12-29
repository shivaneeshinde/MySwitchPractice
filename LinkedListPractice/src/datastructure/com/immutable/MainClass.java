package datastructure.com.immutable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("Geeks", "For", "Geeks"));
		/*String[] arr = new String[list.size()];
		arr = list.toArray(arr);
		this.list = Arrays.asList(arr);*/
		Employee emp = new Employee("Adithya", 34, new Address("Home", "Madhapur", "Hyderabad"), list);
		Address address = emp.getAddress();
		System.out.println(address);
		address.setAddress("Hi-tech City");
		address.setAddressType("Office");
		address.setCity("Hyderabad");
		System.out.println(emp.getAddress());
		System.out.println("modified address is: " + address);

	}

}
