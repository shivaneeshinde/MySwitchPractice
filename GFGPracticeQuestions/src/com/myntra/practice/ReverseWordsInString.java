package com.myntra.practice;

public class ReverseWordsInString {
	
	String reverseWords(String S)
    {
        // code here 
        String[] arr = S.split("\\.");
        for(String x:arr) {
        	System.out.println(x);
        }
        String out = "";
        if(arr.length>1){
            for(int i=arr.length-1; i>0; i--){
                out = out+arr[i]+".";
            }
            out = out+arr[0];
        }
        else{
            out = out+arr[0];
        }
        return out;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInString ob = new ReverseWordsInString();
		String S = "i.like.this.program.very.much";
		String out = ob.reverseWords(S);
		System.out.println(out);
	}

}
