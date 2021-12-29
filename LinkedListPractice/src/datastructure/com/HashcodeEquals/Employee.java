package datastructure.com.HashcodeEquals;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;

public class Employee {
	
	private String name;
	private String id;
	
	private Employee manager;
	
	
	
	public Employee getManager() throws CloneNotSupportedException {
		return (Employee)manager.clone();
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	@Override
	public int hashCode() {
		return Integer.MAX_VALUE;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}

	public Employee(String name, String id) {
		this.name=name;
		this.id=id;
		//this.manager= new Employee();
	}
	
//	public Employee() {
//		this.name="x";
//		this.id="y";
//		
//	}

	public String getName() {
		return name;
	}

	@SuppressWarnings("all")
	private void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public static void main(String[] args) throws InterruptedException {

		
		
		
		Employee e= new Employee("1", "sdg");
		System.out.println(e.hashCode());
		
		e= new Employee("1", "sdg");
		System.out.println(e.hashCode());
		
		Employee e1= new Employee("1", "sdg");
		System.out.println(e1.hashCode());
		
		System.out.println(e==e1);
		System.out.println(e);
		System.out.println(e1);
		
		e= new Employee("2", "xyz");
		System.out.println(e.hashCode());
		
		HashMap<Employee, Integer> maps= new HashMap<Employee, Integer>();
		maps.put(e, 1);
		maps.put(e1, 2);
		System.out.println(maps.size());
		System.out.println(maps.get(e));
		
	}
	
	
}