package datastructure.com.oops;

public class OverloadingObject {
	
	public void m1(Object ob){
		System.out.println("Object");

	}
	public void m1(Integer ob){
		System.out.println("Integer");
		String s1 = new String("abc");
		String s2 = "abc";
		System.out.println(s1==s2);
		String s3 = s1.intern();
		System.out.println(s2==s3);

	}
	public void m1(Double ob){
		System.out.println("Double");

	}
	public void m1(Number ob){
		System.out.println("Number");

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingObject obj = new OverloadingObject();
		obj.m1(100);

	}

}
