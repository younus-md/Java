package oops.polymorphism;

/* two methods having same name but different argument types
compiler take care of method resolution based on reference type
*/
public class Overloading {
    /* when u call add(n) then below method will be executed where 'n' is any integer
    if u call add('a') then you will not get any compile time error rather it will be promoted to next data type
     so charcter will be promoted to integer .similar case with all data types*/
    private void add(int a) {

        System.out.println( "Hi I got " + a + "nd iam multiplying it with 2...." + a * 2 );


    }

    private void add(String s) {
        System.out.println( "hi  have been called from add (String) and i am giving its length.." + s.length() );
    }

    public void add(Object s) {
        System.out.println( "hi  have been called from add (Object) and i am giving its String representation.." + s.toString() );
    }


    public void add(float a, int b) {
        System.out.println( "From Float-int" + (a + b) );
    }

    public void add(int a, float b) {
        System.out.println( "From int-float" + (a + b) );
    }


}
