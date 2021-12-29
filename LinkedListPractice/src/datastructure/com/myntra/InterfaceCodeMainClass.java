package datastructure.com.myntra;

public class InterfaceCodeMainClass implements I1, I2{
	
	public void show() {
		System.out.println("This class to check whether we can instantiate interface or not");
	}

	public static void main(String[] args) {
		I1 i = new InterfaceCodeMainClass();
		i.show();
	}

}
