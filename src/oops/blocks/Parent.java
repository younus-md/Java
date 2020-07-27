package oops.blocks;

/**
 * @author $yed
 */
public class Parent {
    static int i = 90;

    static {
        m1();
        System.out.println( "Parent Static Block" );
    }
    public static void main(String [] args){
        m1();
        System.out.println( "Parent Main Method" );
    }

    private static void m1() {
        System.out.println( j );
    }
    static int j = 80;
}
