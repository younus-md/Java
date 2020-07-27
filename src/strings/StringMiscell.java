package strings;

/**
 * @author $yed
 */
public class StringMiscell {

    public static void main(String[] args) {
        StringMiscell miscell = new StringMiscell();
        miscell.compareHeapAndLiteralStrings();

    }
    /*for string object scp conscept available. multip;e object point to same refernce. if we cahnge any refercne all will be cahnged. so we need Immutability

            String Buffer: Each time a new object is created no scp*/


    void compareHeapAndLiteralStrings() {
        String s1 = new String( "Hello , I am a Java String" );
        String s2 = new String( "Hello , I am a Java String" );
        System.out.println( s1 == s2 ); // f bcz they point to different objects
        String s3 = "Hello , I am a Java String";
        System.out.println( s1 == s3 ); //f heap refernce cant be comapred with scp
        String s4 = "Hello , I am a Java String";
        System.out.println( s3 == s4 ); // t points to same in scp
        String s5 = "Hello , I am " + "a Java String"; // it becomes "Hello , I am a Java String" at compile time
        System.out.println( s4 == s5 );//true
        String s6 = "Hello , I am ";
        String s7 = s6 + "a Java String";
        System.out.println( s4 == s7 );// f bcz s7 is created in heap operation takes at run time
        final String s8 = "Hello , I am ";
        String s9 = s8 + "a Java String";
        System.out.println( s4 == s9 );//t bcz final is converted  to a literal constant at compile time
    }


}
