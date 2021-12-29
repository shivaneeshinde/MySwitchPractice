package datastructure.com.interfaceAbstract;

public class HashCodeAndEqualsContract {
	
	public static void main(String args[]) {
		EmployeeForHashCodeEquals ob1 = new EmployeeForHashCodeEquals(1,"Shiv");
		EmployeeForHashCodeEquals ob2 = new EmployeeForHashCodeEquals(1,"Shiv");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1 == ob2);
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}

}
