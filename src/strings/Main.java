package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		int i1 = 1;
		for (System.out.println("hello"); i1 < 3; i1++) {
			System.out.println(i1);
		}
		reverse("sba");
		doThis();
		// Strings
		String s1 = "SYED";
		String s2 = "syed";
		String s3 = "Syed";
		String s4 = "syed";
		System.out.println("44" + s1 == s2 ? true : false);
		System.out.println(s1 == s3 ? true : false);
		System.out.println(s1.equals(s2) ? true : false);
		System.out.println(s2 == s4 ? true : false);
		String s0 = new String("syed");
		String s00 = s0.toLowerCase();
		System.out.println("s000" + s0 == s00 ? true : false);
		String_Demos sDemo = new String_Demos();
		sDemo.characterCount("abababasrfd");
		Main main = new Main();
		main.getChar("How are you doing ? Are you fine");
		main.getRepeaedStrings("AA BB AABC", "BBC,AA,CACAC");
		sDemo.compareStrings();
		sDemo.processStrings();
		sDemo.doTrim(" ");
		System.out.println(sDemo.checkPalindrome("MDAM"));
		System.out.println("angram?" + sDemo.isAnagram("tup", "put"));
		// System.out.println(sDemo.checkLargestPalindrome("HIHIHIH,MADAM,ABABABABABABABA,MIM"));
		// Palindrome
		String str1 = "madam,aba,bcb,ccacc,a,jhjhuyt";
		System.out.println(sDemo.recursivePalindrome("madam"));
		System.out.println("Vowels are" + sDemo.returnVowels("AEOUBGF"));
		String areVowels = sDemo.returnVowels("AEOUBGF");
		System.out.println(sDemo.countVowels(areVowels));
		MyImmuatbleClass immutable = new MyImmuatbleClass(1254);
		MyImmuatbleClass immuatbleClass = immutable.createUpdate(1254);// No new object is created
		// MyImmuatbleClass myImmuatbleClass = new MyImmuatbleClass( "Syed", 1254 );
		// System.out.println( myImmuatbleClass.getName() + myImmuatbleClass.getRegNo()
		// );
//        myImmuatbleClass.name="Rahul";
		// String countNumOfVowels = sDemo.returnVowels( areVowels );
		// Arrays
		StringBufferDemo stringBufferDemo = new StringBufferDemo();
		stringBufferDemo.stringBuffer();
		int i = 100;
		System.out.print(String.valueOf(i));
	}

	private static void reverse(String st) {
		// TODO Auto-generated method stub
		String rev = "";
		System.out.print(rev.length());
		char[] chrList = st.toCharArray();
		for (int i = chrList.length - 1; i >= 0; i--) {
			rev = rev + chrList[i];
		}
		System.out.print("reverse" + rev);
	}

	private static void doThis() {
		int count = 0, sum = 0;
		for (int i = 0; i < 5; i++) {
			// count = count;
			int y = count++;
			System.out.println(count);
		}
	}

	private void getRepeaedStrings(String s, String s2) {
		String[] str1Arr = s2.split(" ");
		String[] str2Arr = s.split(" ");
		for (String s1 : str1Arr) {
			for (String s3 : str2Arr) {
				System.out.println(s1 + "..." + s3);
				System.out.println(s1.contains(s3) ? s3 : false);

			}
		}
		/*
		 * for (String t1 : str2Arr) { System.out.println( "dd" + t1 ); for (String s3 :
		 * str1Arr) { System.out.println( s3 + "fff" + t1 ); if (s3.equals( t1 )) {
		 * System.out.println( "Found" + str1Arr + "of String 1 in " + str2Arr ); } }
		 * System.out.println( "ffffffffffff" );
		 * 
		 * 
		 * }
		 */
	}

	private void getChar(String s) {
		String str[] = s.split(" ");
		Map<String, Integer> hashMap = new HashMap<>();
		for (String chars : str) {
			if (hashMap.containsKey(chars)) {
				hashMap.put(chars, hashMap.get(chars) + 1);
			} else {
				hashMap.put(chars, 1);
			}
		}
		Set<String> set = hashMap.keySet();
		for (String ch : set) {
			System.out.println(ch + ":::::" + hashMap.get(ch));

		}

	}
}
