package datastructure.com.ajune;

public class Paas {
	
	public void start() {
		String s1 = "slip";
		String s2 = fix(s1);
		System.out.print(s1+" "+s2);
	}
	
	public String fix(String s1) {
		s1 = s1 + "stream";
		System.out.print(s1+" ");
		return "stream";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paas p = new Paas();
		p.start();
	}

}
