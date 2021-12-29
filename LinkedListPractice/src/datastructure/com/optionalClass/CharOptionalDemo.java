package datastructure.com.optionalClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class CharOptionalDemo {
	
	public Optional<Character> getNonRepeat(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char temp = s.charAt(i);
			if(!map.containsKey(temp)) {
				map.put(temp, 1);
			}
			else {
				map.put(temp, map.get(temp)+1);
			}
		}
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return Optional.of(entry.getKey());
			}		
		}
		return Optional.ofNullable(null);
	}

	public static void main(String[] args) {
		CharOptionalDemo cd = new CharOptionalDemo();
		Optional<Character> output = cd.getNonRepeat("SASA");
		if(output.isPresent()) {
			System.out.println("Output is: "+output.toString());
		}	
		else {
			System.out.println("No nonrepeated char");
		}
	}

}
