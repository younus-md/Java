package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        //Collection
        ListSamples listSamples = new ListSamples();
        /*listSamples.doArrayList();
        listSamples.listToArray();
        listSamples.removeDuplicates();
        listSamples.operateLinkedList();*/
        listSamples.arrayListToArray();
        SetSamples setSamples = new SetSamples();
        //setSamples.operateHashSet(); //Hashset better for searching based on hashing
        setSamples.operateLinkedHashSet();//Insertion order
        setSamples.treeSet();
        // hashset & linked hash set uses equals() but treeset uses compareTo()
        List<Employee> al = new ArrayList<>();
        al.add( new Employee( 101, "Vijay" ) );
        al.add( new Employee( 106, "Ajay" ) );
        al.add( new Employee( 105, "Jai" ) );

        Collections.sort( al );
        for (Employee st : al) {
            System.out.println( st.name + " " + st.age );
        }

        Comparble c = new Comparble();
        c.doCompare();
        Compartor c1 = new Compartor();
        c1.comparatorDemo();

    }
}
