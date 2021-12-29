package datastructure.com.oops;

class Parent{
	int z;
	//public final int calculate(int a, int b){
	public static int calculate(int a, int b){
		return a+b;
	}
}

public class staticOverriding extends Parent{
	public int calculate(int x, int y){
		return x-y;
	}

	public static void main(String args[]){
		Parent p = new staticOverriding();
		int a = p.calculate(10,5);
		System.out.println(a);
	}
}
