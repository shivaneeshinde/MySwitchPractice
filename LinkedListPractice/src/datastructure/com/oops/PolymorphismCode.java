package datastructure.com.oops;

class C{
	int[] a = {1,2,3,4};
	public int display() throws Exception{
		try{
			for(int i=0; i<12; i++){
				System.out.println(a[i]);
			}
			//System.exit(0);
			return 1;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Exception in parent class");
			}
			finally{
			System.out.println("I am in class C");
			}
		return 0;
	}
	
	//If we comment this method then it will throw error at line 60
	public void show(){
		System.out.println("I am in class C show method");
	}
}

class B extends C{
	int b[] = {1,2,3,4};
	public int display() throws IndexOutOfBoundsException{
		try{
			for(int i=0; i<12; i++){
				System.out.println(b[i]);
			}

			return 2;
			}
			catch(IndexOutOfBoundsException e){
				System.out.println("Exception in child class");
			}
			finally{
			System.out.println("I am in class B");
			}
		return 0;
	}

	public void show(){
		System.out.println("I am in class B show method");
	}
}

public class PolymorphismCode {
	public static void main(String args[]){
		B b = new B();
		int ans = b.display();
		C c = new C();	
		int ansc = c.display();
		
		C c1 = new B(); //upcasting
		c1.show();
		
		B b1 = (B)new C(); //casting
	}
}
