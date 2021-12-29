package datastructure.com.ajune;

public class CircularPrinter {
	public static void main(String[] args) {
		
		String s="AZGB";
		String data="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(data);
		int currentIndex= 0;
		int dist=0;
		for(int i=0;i<s.length();i++) {
			int forward= Math.abs(currentIndex - data.indexOf(s.charAt(i)));
			int backWard= Math.abs(26 - forward);
			dist+=Math.min(forward, backWard);
			currentIndex= data.indexOf(s.charAt(i));
		}
		System.out.println(dist);
	}
}
