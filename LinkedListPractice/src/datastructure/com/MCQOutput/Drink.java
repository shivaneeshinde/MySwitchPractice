package datastructure.com.MCQOutput;

import java.util.Iterator;
import java.util.TreeSet;

public class Drink implements Comparable{
	
	public String name;
	
	public int compareTo(Object o) {
		return 0;
	}
	
	public static void main(String[] args) {
		Drink one = new Drink();
		Drink two = new Drink();
		one.name ="Coffee";
		two.name ="Tea";
		TreeSet set= new TreeSet();
		set.add(one);
		set.add(two);
		System.out.println(set.size());
		Iterator ite= set.iterator();
		while(ite.hasNext()) {
			System.out.println(((Drink)ite.next()).name);
		}
	}
}
