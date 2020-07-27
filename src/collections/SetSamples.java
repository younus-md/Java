package collections;

import java.util.*;

/*Set : No order is Preserved & no duplicates Set is Implemented by HashSet . LinkedHashSet extends HashSet. it doesnt define any new methods
 Tree Set is an implemenation of Navigable Set which is extended by Sorted Set*/
public class SetSamples {
    /*
     *HasSet: based on Hash Table no duplicate allowed.
     Adding duplicate doesnt give u any error elemenst are inserted based on hash code
     allows null & heterogenous
     best choice if search operation is required
     Constructor :4
     Default capacity is 16 & fill ratio/load factor 0.75 meaning after filling 75 % of hash set a new hashset object is created*/
    void operateHashSet() {
        Set<String> set = new HashSet();
        set.add( "One" );
        set.add( "Two" );
        set.add( "Three" );
        set.add( "Four" );
        set.add( "Five" );
        set.add( "Five" );
        set.add( null );
        set.add( null );
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println( i.next() );
        }
    }

    /* LinkedHashSet:  based on Hash Table * Linked List child class of HashSet . 1.4 v  insertion order is preserved
     suited in cache based application
     * */
    void operateLinkedHashSet() {
        Set<String> set = new LinkedHashSet();
        set.add( "One" );
        set.add( "Two" );
        set.add( "Three" );
        set.add( "seven" );
        set.add( "Five" );
        set.forEach( setvar -> {
            System.out.println( "nhnh" + setvar );
        } );
        /*Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println( i.next() );
        }*/
    }

    /* TreeSet :  Implementation of SortedSet interface Bsed on Balance Tree accept no null
    4 constructor
    TreeSet t= new TreeSet() & TreeSet ts=new TreeSet(Comparator) & TreeSet t=new TreeSet(Collection c) & TreeSet t =new TreeSet(SortedSet s)
    You cant add hetrogeneous elements to treeset and tree map as the elements are sorted by default. An exception is thrown at run time
     java.lang.ClassCastException
     Null Acceptence: If you add your first element as null you wont get any exception but if you add any element after insertng null
     null pointer exception is thrown
     you cant have StringBuffer objects in TreeSet as it is not Comparable
     */
    void treeSet() {
        Set set = new TreeSet();
        // set.add( "ABC" );// cant do this
        set.add( 1 );
        set.add( 6 );
        //  set.add( null ); // no null
        set.add( new StringBuffer( "A" ) );// Class Cast Exception
        System.out.println( set );

    }
}
