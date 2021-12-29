package datastructure.com.exception;

public class ThrowObjectClass {
	
	   public static void main(String []args){  
	        try  
	        {  
	            throw new Calculation();   
	        }  
	        catch(Calculation c){  
	            c.add(10,20);  
	        }  
	    }  
}

class Calculation extends Exception  
{  
    public Calculation()   
    {  
        System.out.println("Calculation class is instantiated");  
    }  
    public void add(int a, int b)  
    {  
        System.out.println("The sum is "+(a+b));  
    }  
}  