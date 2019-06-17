package strings;

public class StringBufferDemo {
/* it is sycnchronizd
    setCharAt(index,char)
    append &insert method of Stringbuilder is overloaded
    public StringBuffer append(String s)
    public StringBuffer append(int i)
    public StringBuffer reverse()
    public void setLength(int length)
    sb.ensureCapacity(int capactity)
    allows method chaining*/

    void stringBuffer() {

        StringBuffer sb = new StringBuffer();// creates an empty object with capacity 16 if u try adding 17th char
        // then new object will be created where all the 16 char are copied along with 17 new cpacity=(currentcapactiy +1)*2
        StringBuffer sb1 = new StringBuffer( 100 ); //with capacity
        String s=new String( "Syed" );
        StringBuffer sb2=new StringBuffer( s ); // then new capacity will be s.length+16
        sb2.insert( 0,1 );
        sb1.append( "mohammed" );System.out.println( sb1.capacity() );// 100
        sb1.trimToSize();
        System.out.println( sb1.capacity() ); //3


    }
}

