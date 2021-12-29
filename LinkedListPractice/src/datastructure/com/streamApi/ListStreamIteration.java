package datastructure.com.streamApi;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ListStreamIteration {
	
	public static void main(String args[]) {
		int odd=0, even =0;
		//List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5,6});
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		list.forEach(i -> System.out.println(i));
		
		//OR

		Consumer<Integer> c = (Integer i) -> System.out.println(i);		
		list.forEach(c);
		
		int oddMax = list.stream().filter(n -> n % 2 == 1).max(Integer::compare).orElse(0);
		OptionalInt max = list.stream().mapToInt(n->n).max();
		odd = list.stream().filter(n -> n % 2 == 1).mapToInt(n -> n*n).sum();
		even = list.stream().filter(n -> n % 2 == 0).mapToInt(n -> n*n).sum();

		System.out.println("Max number is: "+max.getAsInt());
		System.out.println("Max odd number is: "+oddMax);
		System.out.println("sum of odd number is: "+odd);
		System.out.println("sum of even number is: "+even);
		

		// flat map
		List<List<String>> nestedList = Arrays.asList(Arrays.asList("a"), Arrays.asList("b"));
		System.out.println(nestedList);
		System.out.println(nestedList.stream().flatMap(Collection::stream).collect(Collectors.toList()));
		
	}
	
}
