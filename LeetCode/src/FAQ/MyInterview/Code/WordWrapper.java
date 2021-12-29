package FAQ.MyInterview.Code;

import java.util.ArrayList;
import java.util.List;

// sentence - "hgkhl jkhjk ";

//List<String>
//
//i-> 0 till len
//Lst l1
//j -> 0 80
// O(n*m)

public class WordWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		i - 0
//		substr
		String s = "Developing writers can often benefit from examining an essay, a paragraph, or even a sentence to determine what makes it effective. On the following pages are several paragraphs for you to evaluate on your own, along with the Writing Center's explanation. Note: These passages are excerpted from actual student papers and retain the original wording. Some of the sentences are imperfect, but we have chosen these passages to highlight areas in which the author was successful. Thanks to the students who provided their writing for this page of our website. Do you have a discussion post, paper, or other writing assignment that you are particularly proud of? We would love to";
		int length = s.length();
		//System.out.println(length);
		if(length < 80) {
			System.out.println(s);
		}
		else {
			List<String> sentences = new ArrayList<String>();
			int i = 0;
			while(i<length) {			
				String currentLine = "";
				int count = 0;
				while(i<length && count<80) {
					char temp = s.charAt(i);
					currentLine = currentLine + String.valueOf(temp);
					count++;
					i++;
				}
				if(i<length && s.charAt(i)!=' ') {
					while(i<length && s.charAt(i)==' ') {
						char temp = s.charAt(i);
						currentLine = currentLine + String.valueOf(temp);
						i++;
					}
				}
				sentences.add(currentLine);
			}
			
			System.out.println("after dividing lines from paragraph");
			for(String sen : sentences) {
				System.out.println(sen);
			}
		}
	}

}
