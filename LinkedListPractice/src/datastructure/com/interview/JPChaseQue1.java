package datastructure.com.interview;

import java.util.HashMap;
import java.util.Map;

public class JPChaseQue1 {
	
	public String find(String s) {
		String word = "";
		Map<String, Integer> map = new HashMap<>();
		/*for(int i=0; i<s.length();i++) {
			if(String.valueOf(s.charAt(i)).equals(" ")) {
				if(map.containsKey(word)) {
					map.put(word, map.get(word)+1);
				}
				else {
					map.put(word, 1);
				}
				word = "";
			}
			else {
				word = word + String.valueOf(s.charAt(i));
			}
		}*/
		String[] words = s.split(" ");
		for(String temp : words) {
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp)+1);
			}
			else {
				map.put(temp, 1);
			}
		}
		String output = "";
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() > 1) {
				output = entry.getKey();
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JPChaseQue1 jp = new JPChaseQue1();
		String output = jp.find("I had had icecream");
		System.out.println(output);
	}

}
