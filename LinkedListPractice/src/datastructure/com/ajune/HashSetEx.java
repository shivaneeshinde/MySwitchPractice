package datastructure.com.ajune;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = new String("some");
		String s2 = new String("some");
		HashsetBean h1 = new HashsetBean("some");
		HashsetBean h2 = new HashsetBean("some");
		
		HashSet<Object> hs = new HashSet<Object>();
		hs.add(s1);
		hs.add(s2);
		hs.add(h1);
		hs.add(h2);
		
		System.out.println(hs.size());

	}

}
