package datastructure.com.MCQOutput;

import java.util.HashSet;
import java.util.Set;


public class MapIt {

    public static void main(String[] args) {
		Set<KeyMaster> set= new HashSet<>();
		KeyMaster k1= new KeyMaster(1);
		KeyMaster k2= new KeyMaster(2);
		set.add(k1);
		set.add(k1);
		set.add(k2);
		set.add(k2);
		System.out.println(set.size()+":");
		k2.i=1;
		System.out.println(set.size()+":");
		set.remove(k1);
		System.out.println(set.size()+":");
		set.remove(k2);
		System.out.println(set.size()+":");
	}
}
