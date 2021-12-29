package datastructure.com.oops;

class Test 
{ 
    void myMethod() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
public class Derived extends Test 
{ 
    void myMethod() 
    { 
        System.out.println("GFG"); 
    } 
      
    public static void main(String[] args) 
    { 
    	Test t = new Derived();
        Derived object = new Test(); 
        object.myMethod(); 
    } 
}