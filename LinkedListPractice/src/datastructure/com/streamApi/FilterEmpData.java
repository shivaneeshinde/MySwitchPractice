package datastructure.com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FilterEmpData {

	public static void main(String[] args) {
		Employee e1 = new Employee("Shiv", 20);
		Employee e2 = new Employee("Pheobe", 22);
		Employee e3 = new Employee("Darsh", 23);

		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		// Filter age greater than 20 and print name
		List<String> nameList = list.stream().filter(e -> e.getAge() > 20).map(Employee::getName)
				.collect(Collectors.toList());
		System.out.println(nameList);

		// Count no of employee having age greater than 20
		long count = list.stream().filter(e -> e.getAge() > 20).count();
		System.out.println(count);

		// find employee with name Pheobe
		Optional<Employee> emp = list.stream().filter(e -> e.getName().equals("Pheobe")).findFirst();
		if (emp.isPresent()) {
			System.out.println(emp.toString());
		}

		// find maximum age of employee
		OptionalInt age = list.stream().mapToInt(e -> e.getAge()).max();
		System.out.println(age);

	}

}
