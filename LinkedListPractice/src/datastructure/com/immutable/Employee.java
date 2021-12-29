package datastructure.com.immutable;

import java.util.List;

public class Employee {

	private final String empName;
	private final int age;
	private final Address address;
	private final List<String> list;

	public Employee(String name, int age, Address address, List<String> list) {
		super();
		this.empName = name;
		this.age = age;
		this.address = address;
		this.list = list;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	/*
	 * public Address getAddress() { return address; }
	 */
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
	
	public List<String> getList(){
		return list;
	}

}
