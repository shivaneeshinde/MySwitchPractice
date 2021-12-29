package datastructure.com.exception;

public class ParentExceptionChaining {
	
	public ParentExceptionChaining(){
		 System.out.println("ParentExceptionChaining class is instantiated");  
	}

	public static void main(String[] args) {
		 try
		 {
			 int a = 1/0;  
		     System.out.println("a = "+a);
		 }
		 catch(ArithmeticException ex){System.out.println("child exception class: "+ex);}  
		 catch(Exception e){System.out.println("parent exception class: "+e);}   
		 finally {System.out.println("Finallyyyy");}
	}

}
