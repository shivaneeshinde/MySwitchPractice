package datastructure.com.MCQOutput;

public class CardBoard {

	public static int minFlips(String target)
    {
 
        char curr = '1';
        int count = 0;
        System.out.println((int)curr);
        for (int i = 0; i < target.length(); i++) {
 
            // If curr occurs in the final string
            if (target.charAt(i) == curr) {
 
                count++;
 
                // Switch curr to '0' if '1'
                // or vice-versa
                curr = (char)(48 + (curr + 1) % 2);
            }
        }
 
        return count;
    }
 
    // Driver Code
    public static void main(String args[])
    {
 
        String S = "010010";
        
        int count=0;
        char curr='0';
        for(int i=0;i<S.length();i++) {
        	if(curr !=S.charAt(i)) {
        		count++;
        		curr = curr=='1'? '0' :'1';
        	}
        }
        System.out.println(count);
        
        
        //System.out.println(minFlips(S));
    }
}
