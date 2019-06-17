package collections;

import java.util.*;

public class SetSamples {

    void operateHashSet() {
        Set<String> set = new HashSet();
        set.add( "One" );
        set.add( "Two" );
        set.add( "Three" );
        set.add( "Four" );
        set.add( "Five" );
        set.add( null );
        set.add( null );
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println( i.next() );
        }
    }

    void operateLinkedHashSet() {
        Set<String> set = new LinkedHashSet();
        set.add( "One" );
        set.add( "Two" );
        set.add( "Three" );
        set.add( "seven" );
        set.add( "Five" );
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println( i.next() );
        }
    }

   /* You cant add hetrogeneous elements to treeset and tree map as the elements are sorted by default. An exception is thrown at run time
    java.lang.ClassCastException*/
    void treeSet() {
        Set set = new TreeSet();
        set.add( "ABC" );
        set.add( 1 );
        set.add( 1.2 );
        System.out.println( set );

    }
}
