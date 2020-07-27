package strings;

public class StringBufferDemo {

/*  StringBuffer sb = new StringBuffer() // default capacity :16
 if u add 16 charcters the capacity will be 16
 adding 17th char - 16+1 * 2
   it is sycnchronizd
    setCharAt(index,char)
    append &insert method of Stringbuilder is overloaded
    public StringBuffer append(String s)`
    public StringBuffer append(int i)
    public StringBuffer reverse()
    public StringBuffer delete(int begin , int last)
    public StringBuffer deleteCharAt(int index
    )
    public void setLength(int length) // reduces length of charcters to given
    sb.ensureCapacity(int capactity)
    allows method chaining
    all methods are synchronized - performance problems
    1.o version but stringbuilder 1.5
    equals method is not overriden so Object class methods will be used

    In object class while omapring two different type then it returns false
    cant compare String & StringBuffrer
    when u try to print any object reference it prints toString method is called. If our class dont have toString method then it calls Object class toString() method which prints classnme@hashcode

    */

   /* String msg;

    StringBufferDemo(String msg) {
        this.msg = msg;
    }*/

    void stringBuffer() {

        StringBuffer sb = new StringBuffer();// creates an empty object with capacity 16 if u try adding 17th char
        // then new object will be created where all the 16 char are copied along with 17 new cpacity=(currentcapactiy +1)*2
        StringBuffer sb1 = new StringBuffer( 100 ); //with capacity 100
        String s = new String( "Syed" );
        StringBuffer sb2 = new StringBuffer( s ); // then new capacity will be s.length+16
        sb2.insert( 0, 1 );
        sb1.append( "mohammed" );
        System.out.println( sb1.capacity() );// 100
        sb1.trimToSize();
        System.out.println( sb1.capacity() ); //3
        sb1.append( "capgemini" ).append( 5 ).append( 'R' );// method chaining


    }


    void compare() {
        StringBuffer sb = new StringBuffer( 5 );
        String s = "";
        if (s.equals( sb )) {
            System.out.println( "1" );
        } else if (sb.toString().equals( s.toString() )) {
            System.out.println( "2" );
        } else {
            System.out.println( "3" );
        }
        StringBuilder sb1 = new StringBuilder( "Syed" );
        String s1 = sb1.toString();
        String s2 = s1;
        System.out.println( s1 == s2 ? true : false );
       // System.out.println( "Hi" + new StringBuffer( "Welcome" ) );// gives Hi Welcome
       // System.out.println( "Hello"+ new StringBufferDemo( "asc" ));// gives StringBufferDemo@hashcodde
    }

}

