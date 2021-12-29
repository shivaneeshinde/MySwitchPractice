package datastructure.com.myntra;

/*Conside you have e-commerce website and you have to store passwords of custonmer inside arraylist. Write a code that will return number 
 * of distinct password present in that arraylist . Under one condition passwords will be same if for password Pass1 and Pass2 if ith 
 * element at Pass1 is equal to jth element at Pass2 and (i+j)%2 = 0
 * E.g., 1) abcd and cdab are same
 * 2) abcd and acbd are different
 * */

import java.util.HashSet;
import java.util.Set;

public class HandsOnCode {
	
	public static int findCount(int n, String[] pass) {
		int count = 0;
		Set<String> set = new HashSet<String>();
		for(String s : pass) {
			set.add(s);
		}
		count = set.size();
		String[] arr = new String[count];
		int z=0;
		for(String s : set) {
			arr[z] = s;
			z++;
		}
		for(int i=0;i<count-1; i++) {
			String s1 = arr[i];
			for(int j=i+1; j<count; j++) {
				String s2 = arr[j];
				boolean flag = compare(s1, s2);
				if(flag) {
					count--;
				}
			}
		}
		return count;
	}
	
	public static boolean compare(String s1, String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
			int k=2;
			int len = s1.length();
			int i=0;
			while(k<len) {
				if(s1.charAt(i)!=s2.charAt(i+2)) {
					return false;
				}
				else {
					i++;
					k+=2;
				}
			}
			return true;
		}
	}

	public static void main(String[] args) {
		int n = 2;
		String[] pass = {"abcd", "cdab"};
		//String[] pass = {"abcd", "acbd"};
		System.out.println("Distinct passwords are: "+findCount(n, pass));
	}

}
