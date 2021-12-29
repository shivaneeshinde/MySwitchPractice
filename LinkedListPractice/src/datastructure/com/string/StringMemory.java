package datastructure.com.string;

public class StringMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("abc");
		String str2 = "abc";
		String str3 = str1.intern();
		String str4 = str1.intern();
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str1 == str3);
		System.out.println(str1 == str4);
		System.out.println(str2 == str4);
		System.out.println(str4 == str3);
		System.out.println("-------------------");

		String s1 = "Javatpoint";
		String s2 = s1.intern();
		String s3 = new String("Javatpoint");
		String s4 = s3.intern();
		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3); // False
		System.out.println(s1 == s4); // True
		System.out.println(s2 == s3); // False
		System.out.println(s2 == s4); // True
		System.out.println(s3 == s4); // False
		System.out.println("-------------------");

		String stri = "Shivanee";

		String stri1 = new String("Shivanee");

		System.out.println(stri == stri1);

		System.out.println(stri.equals(stri1));

		System.out.println(stri.hashCode());
		System.out.println(stri1.hashCode());
	}

}
