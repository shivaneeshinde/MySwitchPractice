package datastructure.com.interview;

public class MorganStanley1 {
	
	public void solution(String s) {
		int wendyCont=0;
        int bobCount=0;
        String bobString= s;
        while(s.contains("www")){
            wendyCont++;
            s=s.replaceFirst("www", "");
            System.out.println(s);
        }
        while(bobString.contains("bbb")){
            bobCount++;
            bobString=bobString.replaceFirst("bbb", "");
            System.out.println(bobString);
        }
        System.out.println(wendyCont);
        System.out.println(bobCount);
        if(wendyCont>bobCount){
            System.out.println("wendy");
        }
        else if(wendyCont<=bobCount){
            System.out.println("bob");
        }
	}
	
	public static void main(String args[]) {
		MorganStanley1 mg = new MorganStanley1();
		mg.solution("hey");
	}

}
