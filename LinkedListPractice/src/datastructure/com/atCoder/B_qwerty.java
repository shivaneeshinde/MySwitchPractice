package datastructure.com.atCoder;

import java.io.*;
import java.util.*;

public class B_qwerty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = new int[26];
	    Scanner sc = new Scanner(System.in);
	    int i;
	    for(i=0; i<26; i++){
	      p[i] = i;
	    }
	    StringBuilder output = new StringBuilder("");
	    for(i=0; i<26; i++){
	      int ascii = 97 + p[i];
	      char letter = (char) ascii;
	      output.append(String.valueOf(letter));
	    }
	    System.out.println(output);

	}

}
