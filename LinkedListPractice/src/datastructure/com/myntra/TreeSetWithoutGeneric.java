package datastructure.com.myntra;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithoutGeneric {

	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add("Shivanee"); //line2
		set.add(1);
		System.out.println(set);
	}

}
