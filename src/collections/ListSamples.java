package collections;

import java.util.*;

public class ListSamples {


    /*
    ArrayList arrayList=new ArrayList( ); Default Capacity 10 (if a new element is added ,new capacity =currentcapacity*3/2+1)
    ArrayList arrayList=new ArrayList(int Capacity)
    ArrayList arrayList=new ArrayList( Collection c)
    When we print object refernce,internally toString() will be called. In collection it will be []
    ArrayList & Vector implements RandomAccess interface(markable interface) so that any random element we can aceess with same speed
    When You Use ArrayListt:
    if frequent opeartion is Retrieveal
    wrost choice when
    insertion is considered & delete
            String arraylistToString = StringUtils.collectionToCommaDelimitedString(language); converts arraylist to String using org.springframework.util.StringUtils

   */

    void doArrayList() {
        List<String> list = new ArrayList<String>();//Creating arraylist
        list.add( "Ravi" );
        list.add( "Syed" );
        list.add( "Sunil" );
        list.add( "Ajay" );
        list.add( null );
        list.add( null );
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            String name = (String) itr.next();
            if (name == "Ajay") {
                // list.remove( name );             // This line throws concurrentmodificationexception
                itr.remove();

            }

            System.out.println( list );
        }
        ListIterator listIterator = list.listIterator( list.size() );
        List reverseArrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            reverseArrayList.add( listIterator.previous() );

        }
        System.out.println( "Reverse" + reverseArrayList );

        list.forEach( a -> { //Here, we are using lambda expression
            System.out.println( a );
        } );
    }

    void arrayListToArray() {
        /*
        List cannot be modified & efficient way List returned by this method would be fixed size.

       Read more: https://javarevisited.blogspot.com/2011/06/converting-array-to-arraylist-in-java.html#ixzz5hBmMPNzA
*/
        List<String> coolStringList = Arrays.asList( "Java", "Scala", "Groovy" ); //Declare &initialize o
        //coolStringList.add( "Syed" ); // Exception in thread "main" java.lang.UnsupportedOperationException
        coolStringList.set( 0, "Syed" );// works well
        System.out.println( coolStringList );
/*
        /) Its not as fast as Arrays.asList() but more flexible.

        2) This method actually copies the content of the underlying array into ArrayList provided.


        3) Since you are creating copy of original array, you can add, modify and remove any element without affecting original one.*/

        List<String> assetList = new ArrayList();
        String[] asset = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures", "options"};
        Collections.addAll( assetList, asset );
        System.out.println( assetList );
        assetList.add( "Mohammed" );
        System.out.println( assetList );

        List newAssetList = new ArrayList();
        newAssetList.addAll( Arrays.asList( asset ) );
        System.out.println( newAssetList );
        newAssetList.add( "YNS" );
        System.out.println( newAssetList );
        /*String [] currency = {"SGD", "USD", "INR", "GBP", "AUD", "SGD"};
        System.out.println("Size of array: " + currency.length);
        List<String> currencyList = CollectionUtils.arrayToList(currency);
*/
    }

    void doVector() {
        Vector<String> v = new Vector<String>();//creating vector
        v.add( "umesh" );//method of Collection
        v.addElement( "irfan" );//method of Vector
        v.addElement( "kumar" );
        //traversing elements using Enumeration
        Enumeration e = v.elements();
        while (e.hasMoreElements()) {
            System.out.println( e.nextElement() );
        }
    }

    void listToArray() {
        List<String> stockList = new ArrayList<String>();
        stockList.add( "stock1" );
        stockList.add( "stock2" );
        stockList.add( "stock3" );
        //stockList = Collections.unmodifiableList(stockList); // creates readable list


        String[] stockArr = new String[stockList.size()];
        stockArr = stockList.toArray( stockArr );


        String[] arr = stockList.stream().toArray( String[]::new );

        for (String s : stockArr) {
            System.out.println( s );

        }

    }

    void removeDuplicates() {
        List<String> stockList = new ArrayList<String>();
        stockList.add( "stock1" );
        stockList.add( "stock1" );
        stockList.add( "stock2" );
        stockList.add( "stock2" );
        stockList.add( "stock2" );
        LinkedHashSet linkedHashSet = new LinkedHashSet( stockList );
        System.out.println( linkedHashSet );
        Object[] obj = stockList.toArray();
    }
   /* FileOutputStream fos=new FileOutputStream("file");
    ObjectOutputStream oos=new ObjectOutputStream(fos);
              oos.writeObject(al);
              fos.close();
              oos.close();
    //Deserialization
    FileInputStream fis=new FileInputStream("file");
    ObjectInputStream ois=new ObjectInputStream(fis);
    ArrayList  list=(ArrayList)ois.readObject();
            System.out.println(list);*/


    /*
No capacity required only 2 constructors
addFirst();addLast(); object geFirst();object getLast(); oobject removeFirst() object removeLast()
*/
    void operateLinkedList() {

        List linkedList = new LinkedList();
        linkedList.add( "syed" );
        linkedList.add( "Mohammed" );
        linkedList.add( "Younus" );
        System.out.println( linkedList );
        linkedList.set( 0, "SYED" );
        System.out.println( linkedList );
        linkedList.add( 0, "Mr." );
        System.out.println( linkedList );


    }

/*
    difference ArrayList vs Vector
*/
}
