package datastructure.com.interviewCode;

//input :  string s, Integer K 
//abc 2 cde cde
//wxyz 3 zabc
//ASCII value --  A: 65, Z: 90, a:97, z: 122


public class ASCIICode {
	
	public String ManipulateString(String s, int k) {
		if(k>=27) {
			k = k%27;
		}
		String output = "";
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			int ascii = temp;
			int nextCharVal = 0;
			//System.out.println("ass"+ascii);
			if(ascii >= 65 && ascii <= 82) {
				nextCharVal = ascii + k;
				if(nextCharVal > 82) {
					nextCharVal = nextCharVal % 82;
					nextCharVal = nextCharVal + 65;
				}
				//System.out.println("nextCharVal is"+nextCharVal);
				char newChar =  (char)nextCharVal;
				//System.out.println("newChar is"+newChar);
				output = output + String.valueOf(newChar);
			}
			if(ascii >= 97 && ascii <= 122) {
				nextCharVal = ascii + k;
				if(nextCharVal > 122) {
					nextCharVal = nextCharVal % 122;
					nextCharVal = nextCharVal + 97;
				}
				System.out.println("nextCharVal is"+nextCharVal);
				char newChar = (char)nextCharVal;
				System.out.println("newChar is"+newChar);
				output = output + String.valueOf(newChar);
			}
				
		}
		
		/* int length = s.length();
		  if(length > k) {
			char start = s.charAt(k);
			output = String.valueOf(start);
			char temp = start;
			for(int i=0; i<k; i++) {
				temp++;
				output = output + String.valueOf(temp);
			}
		}
		else {
			output = s;
		}*/
		return output;
	}
	
	public static void main(String args[]) {
		ASCIICode demo = new ASCIICode();
		String output = demo.ManipulateString("ABC", 29);
		System.out.println("Output string is: "+output);
	}

}
