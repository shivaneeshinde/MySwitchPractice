package datastructure.com.msAttempt5;

public class Employee {
	
	private String name;
	private String id;
	
	@SuppressWarnings("unused")
	private Employee() throws Exception{
		throw new Exception();
	}
	
	public Employee(String name, String id) {
		this.name=name;
		this.id=id;
	}

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
	
	@SuppressWarnings("all")
	private void setId(String id) {
		this.id = id;
	}
	
	
}
