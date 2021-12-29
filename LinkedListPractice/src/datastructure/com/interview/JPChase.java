package datastructure.com.interview;

import java.util.Scanner;

public class JPChase {
	
	public String reqSTring(String s) {
		String output = "";
		for(int i=0; i<s.length()-1; i++) {
			int first = Integer.parseInt(String.valueOf(s.charAt(i)));
			int second = Integer.parseInt(String.valueOf(s.charAt(i+1)));
			if(first%2==0 && second%2 ==0) {
				output = output + first + "*";
			}
			else if(first%2!=0 && second%2!=0) {
				output = output + first + "-";
			}
			else {
				output = output + first;
			}
		}
		output = output + String.valueOf(s.charAt(s.length()-1));
		return output;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		JPChase jp = new JPChase();		
		//String output = jp.reqSTring("21462675756");
		String output = jp.reqSTring("98676555533");
		System.out.println("Required output is: "+output);
		output = jp.reqSTring(s);
		System.out.println("Required output is: "+output);
	}

}
