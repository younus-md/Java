package oops.blocks;

public class InstanceBlock {

    int i = 10;

    {
        System.out.println( "First Instance Block" );
        m1();
    }

    private void m1() {
        System.out.println( j );
    }

    InstanceBlock() {
        System.out.println( " first constructor" );
    }

    public static void main(String args[]) {
        InstanceBlock instanceBlock=new InstanceBlock();// if object is not created monly prints main
        System.out.print( "mainn" );
       // System.out.print( j );// non static field cant be referred

    }
    int j =90;
    {
        System.out.println( "second" );
    }
}


