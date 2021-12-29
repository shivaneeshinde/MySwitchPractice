package datastructure.com.myntra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListWithoutGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l = new ArrayList();
		ArrayListTestObjects t1 = new ArrayListTestObjects();
		ArrayListTestObjects t2 = new ArrayListTestObjects();
		l.add(t1);
		l.add(t2);
		Collections.sort(l);
		System.out.println(l);
	}

}
