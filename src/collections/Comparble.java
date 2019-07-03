package collections;

/* Comparable Interface: Present in java.lang & contains compareTo() method
 public int compareTo(Object o)
 returns 0 if both object are equal
  1 if obj 1 > obj2
  -1 if obj <obj2
  while comparing both the objects need not  be homogenous .
 * */
public class Comparble {
    void doCompare() {
        System.out.println( "A".compareTo( "Z" ) );
        System.out.println( "A".compareTo( "A" ) );
        System.out.println( "Z".compareTo( "Z" ) );
    }
}
