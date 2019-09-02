package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* Map : is not a child interface of collection.Collection is all about grouping of individual objects but map is collection of key value pairs
key & value both are objects each key:value pair is an Entry so map is collection of Entry objects based on hash table. No duplicate keys but values can be duplicated.
Object put(Object add) can have one null key & is non-synchronized
implements serializable & clonable
search operation

*/
public class Maps {
    /*HashMap has 4 constructors simiar to Hashset
      HashMap hm= new HashMap() // 16 capacity & 0.75 fill ratio
      HashMap hm =new HashMap(int initialCapacity)
      HashMap hm =new HashMap(int initial Capacity, int fillRatio)
      HashMap hm =new HashMap(Map m)
    *
    *
    * */

    void operateHashMap() {
        Map<String, Integer> map = new HashMap<>();
        System.out.println( "hii" + map.put( "name", 1 ) );
        // put method calculates hashcode of key &
        map.put( "add", 2 );
        System.out.println( map.put( "name", 3 ) );
        map.keySet(); // Set is return type gives all the keys
        map.values();//return type is collection
        map.entrySet();//Set<Entry<K,v>>
       /* On Entry we can perform below methods Entry Interface
        Object getKey(), Object getValue() Object setValue()*/
        map.put( null, 9 );
        System.out.println( map );


    }

    void doHashMap() {
        Map map = new HashMap();
        //Adding elements to map
        map.put( 1, "Amit" );
        map.put( 5, "Rahul" );
        map.put( 2, "Jai" );
        map.put( 6, "Amit" );
        //Traversing Map
        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println( entry.getKey() + " " + entry.getValue() );
        }


        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println( "Initial list of elements: " + hm );
        hm.put( 100, "Amit" );
        hm.put( 101, "Vijay" );
        hm.put( 102, "Rahul" );

        System.out.println( "After invoking put() method " );
        for (Map.Entry m : hm.entrySet()) {
            System.out.println( m.getKey() + " " + m.getValue() );
        }

    }
}
