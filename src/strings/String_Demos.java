package strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;



/*
String is immutable in Java which says"object whose internal state remains constant after it has been fully created"
String implements java.io.Serializable, Comparable<String>, CharSequence
String s= new String()
String s= new String("yns")
String s=new String(StringBuffer sb)
String s=new String(StringBuilder sb)
String s=new String(char[] ch)
String s=new String(byte[]b)

Methods
public char charAt(index i)
public string concat(String s)
public boolean equals(Object o)
public boolean equalsIgnoreCase(String s)
public boolean isEmpty()
public int length()
Public String replace(char oldchar,char newchar)
public String substring(int begin) / gives substring from beginindex to end
public String substring(int begin,int end)// gievs substring from begin to end-1
public int indexOf(char c)// gives first index only /gives -1 if character is not found
public int lastIndexOf(char c)// gives last index
public String trim() removes blank spaces only in begining & end
indexOf &lastIndexOf
*/

public class String_Demos {
    /*
   1.String s=new String("Syed");
   String s1=new String("Syed");
   String s2="Syed";
   String s3="Syed"
   two objects in heap and one object in scp
   2.String s=new String("syed") 2 objects 1 in scp 1 in heap
     s.concat("yns") 2 objects 1 in scp nd 1 in heap but no refernce in heap so gc
     String s2=s.concat("mooha") 2 objects 1 in heap i in scp with s2 as ref
     s=s.concat("mr") 2 obj 1 in heap 1 in scp with s1 having latest content
      any run time object if any chnge in contenct creation takes place in heap
    3.Striing s="sted";
    String s1=s.toUpperCase()
    String s2=s.toLowerCase()
    Sop(s==s1)false
    Sop(s==s2)true
    oNLY  2 objects are created in heap and s&s2 rerefrs to one and one object in scp
    4. String s="Syed" one object in scp
      String s1=s.toString() s1 points to same object
      String s2=s.toLowerCase() s2 points to same object
      String s3 = s2.toUpperCase() a new object is created in heap
      String s4=s3.toUpperCase() a new object is created in heap
      in above case only object is created in scp as there is no content change
    5. final StrinngBuffer sb=new StringBuffer("Syed")
    sb.append("Moha")// possible
    but u cant reasign (final applies to variables immutability to object)
     6. SCP objects are never garbage collected
       String s= new String ("abc")
       s.concat("def")  two oobjects in heap & 2 object in scp
       7. String s = "abcdef"
       String s2="abc"+"def" // addition will be performed at compile time it becomes abcdef
       in above case both points to same object  abcdef in scp
       8.String s= "abc"
       String s1= s+"def"    2 objects in  scp and one object in Heap (s1)  its perfomormed at run time bcz of variable  //
       9. All wrapper classes are immutable
       10. String s= new String("syed");
       String s1=s.toUpperCase() - anew object is created & asigned to s1
       String s2=s.toLowerCase() - no new object is created as the content is same
       String s3=s.t
       oString
       s==s3//t
        s==s1 //f
        s==s2//t
       */

    void compareStrings() {
        String s1 = new String( "Syed" );
        String s2 = new String( "Syed" );

        System.out.println( s1 == s2 ); // f == checks references
        System.out.println( s1.equals( s2 ) ); // t
        StringBuffer sb1 = new StringBuffer( "Syed" );
        StringBuffer sb2 = new StringBuffer( "Syed" );
        System.out.println( sb1 == sb2 );//f
        System.out.println( sb1.equals( sb2 ) ); //f bcz in String buffer there is no equals method it takes frtom Object class which means reference compariosn
        String str = new String( "Yns" ); // 2 objects are created one in heap & other in scp but reference will be point to heap
        String str1 = "Yns";// one in scp Gc not access SCP area. All scp objects are destroyed during jvm shutdown or during Server shutdown
        str1 = "ABC";
        System.out.println( "str1" + str1 );
        String sd = "";
        System.out.println( sd.length() );
//        sd=null;
        System.out.println( sd.length() );

    }

    void processStrings() {
        byte b[] = {101, 102, 103};
        String strr = new String( b ); //efg
        System.out.println( strr );// F
        String s = "Younus";
        System.out.println( "sss" + s );
        System.out.println( "concat" + s.concat( "md" ) );
        System.out.println( "sss" + s );
        s = s.concat( "md" );
        System.out.println( "string" + s );
        System.out.println( "Hello World!" );
        String s1 = "Test";
        String s2 = "Test";
        String s3 = new String( "Test" );
        final String s4 = s3.intern();
        System.out.println( s1 == s2 );
        System.out.println( s2 == s3 );
        System.out.println( s3 == s4 );
        System.out.println( s1 == s3 );
        System.out.println( s1 == s4 );
        System.out.println( s1.equals( s2 ) );
        System.out.println( s2.equals( s3 ) );
        System.out.println( s3.equals( s4 ) );
        System.out.println( s1.equals( s4 ) );
        System.out.println( s1.equals( s3 ) );
        // Reverse A sString
        char[] str = s.toCharArray();
        int len = str.length;
        char[] arr1 = new char[len];
        System.out.print( arr1.length );
        System.out.print( "ch" + str );

        for (int i = len - 1, j = 0; i >= 0 && j < len; i--, j++) {
            arr1[j] = str[i];
        }
        String reqStr = new String( arr1 );
        System.out.print( reqStr );

    }

    String checkPalindrome(String inputString) {
        String res, rev = "";
        char[] charArray = inputString.toCharArray();
        // we can also use charAt(i)
        for (int i = charArray.length - 1; i >= 0; i--) {
            rev = rev + charArray[i];

        }
        System.out.println( rev );
        if (rev.equals( inputString )) {
            res = "Palindrommee";
            return res;
        } else {
            res = "No Palindromme";
            return res;
        }

    }

    boolean recursivePalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt( 0 ) == str.charAt( str.length() - 1 )) {
            recursivePalindrome( str.substring( 1, str.length() - 1 ) );
            return true;
        } else
            return false;
    }

    boolean isAnagram(String str1, String str2) { // sort & compare
        boolean flag = false;
        if (str1.length() == str2.length()) {
            char[] inp1 = str1.toCharArray();
            char[] inp2 = str2.toCharArray();
            Arrays.sort( inp1 );
            Arrays.sort( inp2 );
            for (int i = 0; i < inp1.length; i++) {
                if (inp1[i] != inp2[i]) {
                    return flag;
                } else {
                    flag = true;
                    return flag;
                }
            }

        }
        return flag;

    }

    void characterCount(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char ch[] = s.toCharArray();
        System.out.println( ch );
        for (char c : ch) {
            if (hashMap.containsKey( c )) {
                hashMap.put( c, hashMap.get( c ) + 1 );
            } else {
                hashMap.put( c, 1 );
            }
        }
        System.out.println( hashMap );
        //To get Duplicates
        Set<Character> set = hashMap.keySet();
        for (Character ch1 : set) {
            if (hashMap.get( ch1 ) > 1) {
                System.out.println( ch1 + "::" + hashMap.get( ch1 ) );
            }
        }


    }
//checkRotation use s3.contains(s2)

    String checkLargestPalindrome(String s) {
        // s="HIHIHIH,MADAM,ABABABABABABABA,MIM";
        String[] splitArr = s.split( "," );
        String res = "";
        for (String str : splitArr) {
            System.out.print( str );
//            StringBuffer stringBuffer = new StringBuffer(str);
//            if (stringBuffer.equals(stringBuffer.reverse())) {
//                System.out.print("Pal" + str + "Legth" + str.length());
//            }
            /*char[] subArr = str.toCharArray();
            for (int i = 0, j = subArr.length - 1; i < subArr.length & j >= 0; i++, j--) {
                if (subArr[i] == subArr[j]) {
                     res = subArr + "is a palindrome & length" + subArr.length;
                    //System.out.println(subArr + "is a palindrome & length" + subArr.length);
                    return  res;
                }
            }*/
        }

        return res;
    }

    String returnVowels(String str) {
        char[] inpArr = str.toCharArray();
        String resString = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (inpArr[i] == 'A' || inpArr[i] == 'E' || inpArr[i] == 'O' || inpArr[i] == 'U' || inpArr[i] == 'I') {
                count++;
                resString = resString + inpArr[i];
            }
        }
        System.out.println( "ov1" + resString );
        String Num = "There are total " + count + "Vowels";
        return Num + "and they are" + resString;

    }

    // run method returns object of configurable application context
    String countVowels(String res) {
        int countA, countE, countU, countI, countO;
        countA = countE = countU = countI = countO = 0;
        char[] vowelsArray = res.toCharArray();
        for (int i = 0; i < res.length(); i++) {

            if (vowelsArray[i] == 'A') {
                countA++;
            } else if (vowelsArray[i] == 'E') {
                countE++;
            } else if (vowelsArray[i] == 'O') {

            } else if (vowelsArray[i] == 'U') {
                countU++;
            } else {
                countI++;
            }

        }
        String resVowels = "A is" + countA + "E" + countE + "U" + countU + "O" + countO + "I" + countI;
        return resVowels;
    }


    public void doTrim(String s) {
        s.trim();
        System.out.println( s.equals( "" ) + "------" +
                s.isEmpty() );
        int index = s.indexOf( " " );
        System.out.println( index );
    }
}
