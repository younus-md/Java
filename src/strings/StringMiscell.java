package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author $yed
 */
public class StringMiscell {

	public static void main(String[] args) {
		StringMiscell miscell = new StringMiscell();
		miscell.compareHeapAndLiteralStrings();

		miscell.strOp1("ABCD", "A"
				+ "DC");

	}

	private void strOp1(String st, String st2) {
//		if (st.contains(st2)) {
//			List l = new ArrayList<>();
//			l.add(st);
//			List l2 = new ArrayList<>();
//			l2.add(st2);
//			l2.retainAll(l);
//			System.out.println(l);
//
//		}
		char[] ch1 = st.toCharArray();
		char[] ch2 = st2.toCharArray();
		Character[] chr = new String(ch1).chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		Character[] chr1 = new String(ch2).chars().mapToObj(c -> (char) c).toArray(Character[]::new);
		List<Character> chls = new ArrayList<Character>(Arrays.asList(chr));
		List<Character> chls1 = new ArrayList<Character>(Arrays.asList(chr1));
		chls.removeAll(chls1);
		System.out.println(chls);

	}
	/*
	 * for string object scp conscept available. multip;e object point to same
	 * refernce. if we cahnge any refercne all will be cahnged. so we need
	 * Immutability
	 * 
	 * String Buffer: Each time a new object is created no scp
	 */

	void compareHeapAndLiteralStrings() {
		String s1 = new String("Hello , I am a Java String");
		String s2 = new String("Hello , I am a Java String");
		System.out.println(s1 == s2); // f bcz they point to different objects
		String s3 = "Hello , I am a Java String";
		System.out.println(s1 == s3); // f heap refernce cant be comapred with scp
		String s4 = "Hello , I am a Java String";
		System.out.println(s3 == s4); // t points to same in scp
		String s5 = "Hello , I am " + "a Java String"; // it becomes "Hello , I am a Java String" at compile time
		System.out.println(s4 == s5);// true
		String s6 = "Hello , I am ";
		String s7 = s6 + "a Java String";
		System.out.println(s4 == s7);// f bcz s7 is created in heap operation takes at run time
		final String s8 = "Hello , I am ";
		String s9 = s8 + "a Java String";
		System.out.println(s4 == s9);// t bcz final is converted to a literal constant at compile time
	}

}
