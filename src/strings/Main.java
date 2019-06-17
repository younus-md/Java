package strings;

public class Main {

    public static void main(String[] args) {
        //Strings
        String_Demos sDemo = new String_Demos();
        sDemo.characterCount( "abababasrfd" );
        sDemo.compareStrings();
        sDemo.processStrings();
        System.out.println( sDemo.checkPalindrome( "MDAM" ) );
        System.out.println( "angram?" + sDemo.isAnagram( "tup", "put" ) );
        // System.out.println(sDemo.checkLargestPalindrome("HIHIHIH,MADAM,ABABABABABABABA,MIM"));
        //Palindrome
        String str1 = "madam,aba,bcb,ccacc,a,jhjhuyt";
        System.out.println( sDemo.recursivePalindrome( "madam" ) );
        System.out.println( "Vowels are" + sDemo.returnVowels( "AEOUBGF" ) );
        String areVowels = sDemo.returnVowels( "AEOUBGF" );
        System.out.println( sDemo.countVowels( areVowels ) );
        MyImmuatbleClass myImmuatbleClass = new MyImmuatbleClass( "Syed", 1254 );
        System.out.println( myImmuatbleClass.getName() + myImmuatbleClass.getRegNo() );
//        myImmuatbleClass.name="Rahul";
        //String countNumOfVowels = sDemo.returnVowels( areVowels );
        //Arrays

        int i = 100;
        System.out.print( String.valueOf( i ) );

    }
}
