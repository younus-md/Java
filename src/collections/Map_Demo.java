package collections;

import java.util.HashMap;
import java.util.Map;

/* Map : is not a child of collection . Collection is all about grouping of individual objects but map is collection of key value pairs
key & value both are objects each key:value pair is an Entry so map is collection of Entry objects based on hash table
Object put(Object add)
implemenst serializable & clonable
search operation

*/
public class Map_Demo {

    void operateHashMap() {
        Map<String, Integer> map = new HashMap<>();
        System.out.println( "hii" + map.put( "name", 1 ) ); // nulll
        // put method calculates hashcode of key &
        map.put( "add", 2 );
        System.out.println( map.put( "name", 3 ) );
        map.keySet(); // Set is return type gives all the keys
        map.values();//return type is collection
        map.entrySet();//Set<Entry<K,v>>
       /* On Entry we can perform below methods Entry Interface
        Object getKey(), Object getValue() Object setValue()*/
       map.put( null,9 );
       System.out.println( map );



    }
}
