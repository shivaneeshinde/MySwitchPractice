package datastructure.com.ajune;

@Entity
@Table("Employee")
public class Employee {
	
	@Id
	int id;
	@Required()
	String name;
	int salary;
	

}
