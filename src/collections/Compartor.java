package collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

/*Comparator Interface: in java.util package. contains two methods 1. compare 2.equal
 public int compare(Object ob1,Object ob2) public boolean equals() . Here equals method implementation is optional as it is present in Object
 returns 0 if both objects are equal
 1 if obj1 is >obj2
 -1 if obj 1< obj2
In this demo program we are implementing out own customised sorting rather natural sorting
 * */

public class Compartor {
    void comparatorDemo() {
        TreeSet treeSet = new TreeSet( (Collection) new MyComparator() );
        treeSet.add( 20 );
        treeSet.add( 40 );
        treeSet.add( 5 );
        treeSet.add( 3 );
        treeSet.add( 8 );
        System.out.println( treeSet );
    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer integer1 = (Integer) o1;
        Integer integer2 = (Integer) o2;
        if (integer1 < integer2) {
            return +1;
        } else if (integer1 > integer2) {
            return -1;

        } else
            return 0;

// If we cn use this it gives ascending irder
        //  return integer1.compareTo( integer2 );
        // retuurn -integer1.compareTo(integer2);
        //return (i1>i2)?1:(i1<i2):0
        //return 0 // only first element will be inserted all be eliminated
    }
}