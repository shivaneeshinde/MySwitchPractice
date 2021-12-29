package datastructure.com.oops;

public class ConstructorChaining {
	
	 int id,age;   
	    String name, address;  
	    public ConstructorChaining (int age)  
	    {  
	    	System.out.println("constructor1");
	        this.age = age;  
	    }  
	    public ConstructorChaining(int id, int age)  
	    {  
	        this(age);  
	    	System.out.println("constructor2");
	        this.id = id;  
	    }  
	    public ConstructorChaining(int id, int age, String name, String address)  
	    {  
	        this(id, age);  
	    	System.out.println("constructor3");
	        this.name = name;   
	        this.address = address;   
	    }  
	    public static void main (String args[])  
	    {  
	        ConstructorChaining emp = new ConstructorChaining(105, 22, "Vikas", "Delhi");  
	        System.out.println("ID: "+emp.id+" Name:"+emp.name+" age:"+emp.age+" address: "+emp.address);  
	    }  

}
