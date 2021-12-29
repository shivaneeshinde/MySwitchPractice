package datastructure.com.atCoder;

import java.io.*;
import java.util.*;

public class WeatherForcast {
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    sc.nextLine();
	    String S = sc.nextLine();
	    char weather = S.charAt(N-1);
	    System.out.println("N value is: "+N);
	    System.out.println(weather);
	    if(weather == 'o')
	    	System.out.println("Yes");
	    else
	      	System.out.println("No");
	  }

}
