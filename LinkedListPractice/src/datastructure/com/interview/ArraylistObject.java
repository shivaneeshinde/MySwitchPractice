package datastructure.com.interview;

import java.util.ArrayList;
import java.util.List;

public class ArraylistObject {
	
	public static void foo(List<Object> abc){
		System.out.println();
	}
	
	public static void main(String args[]){
		List<String> abc = new ArrayList<String>();
		ArraylistObject.foo(abc);
	}

}



public class Shivanee<K,V>{
	int hashcode;
	Key key;
	Value value;
	Shivanee next;
	public Shivanee() {
		
	}
	
	Shivanee arr = new Shivanee[16];
	
	public Shivanee(Key key, Value value) {
		this.key = key;
		this.value = value;
	}
	
	public Shivanee(int hashcode, Key key, Value value, Shivanee next) {
		this.hashcode = hashcode;
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	
	public void put(Key key, Value value) {
		//Shivanee sh = new Shivanee();
		int hashcode = sh.hashCode();
		int index = hashcode ;
		Shivanee sh1 = new Shivanee(index, key, value, null);
		arr[index] = sh1;
	}
	
	public Value get(Key key) {
		
	}
	
	
}


public class Utility{
	
	public static void main(String args[]) {
		Shivanee s = new Shivanee();
		s.put("shivanee", "shinde");
	}
	
}


public class Key{
	
	public Key(Object key) {
		if(key.instanceOf("Integer")) {
			In
		}
	}
	
}


int arr = {100, 200, 300, 400}; //{1,4,2,10,23,0, 0, 3, 20}


//Arrays.sort(arr);

for(int i =0; i<arr.length-1; i++) {
	int sum = 0;
	int j = 0;
	while(n>0) {
		j= i+n;
		sum  = sum + arr[j];
		n--;
	}
	if(sum> max) {
		max = sum;
	}
}




int max = 0;
for(int i =0; i<arr.length-1; i++) {
	if(arr[i]+arr[i+1]> max) {
		max = arr[i]+arr[i+1];
	}
}


int length = arr.length;

int sum = arr[length] + arr[length-1];



//signals 

public class Airway{
	private String plain; 
	private String runWayStatus;
	
	
		
}

public class Controllerclass{
	List<String> plainList = new ArrayList<String>();
	public String availability(String plain) {
		String status ="";
		return status
	}
	publuc static void main()
		{
		 String plainName = sc.next();
		 
		 Airway a= new (plainName, )
		}
}











