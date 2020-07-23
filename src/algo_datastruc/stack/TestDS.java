package algo_datastruc.stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author $yed
 */
public class TestDS {

    public static void main(String[] args) {

        EmployeeStack empStack = new EmployeeStack();
        empStack.createEmployeeStack();
        empStack.deleteEmployeeStack();
        empStack.createEmployeeStack();
        empStack.getSize();
        empStack.isEmployeeExists( "Moha" );
        empStack.searchEmployee( "Kavya" );
        empStack.getSize();

        Stack<String> javaStack = new Stack<String>(); // synchronized
        javaStack.push( "Alpha" );
        javaStack.push( "Beta" );

        while (javaStack.size() > 0) {
            System.out.println( "ele" + javaStack.pop() );
        }
        System.out.println( "size" + javaStack.size() );
        /* peek gives u top element & wont remove the element.
        EmptyStack exception is thrown if stack is empty*/
        javaStack.push( "Beta" );
        javaStack.push( "Alpha" );
        javaStack.push( "Beta" );
        javaStack.push( "Beta" );
        javaStack.push( "Alpha" );
        javaStack.push( "Beta" );
        javaStack.push( "Chohaa" );
        System.out.println( "top elemnt" + javaStack.peek() );
        
        // search returns -1 if no element found searches from top
        System.out.println( javaStack.search( "Alpha" ) );
        // using java8
        javaStack.stream().forEach( ele -> {
            System.out.println( ele );
        } );


        // reverse stack elements using a stack
      /*  Iterator i = javaStack.iterator();
        Stack s1 = new Stack();
        while (javaStack.size() > 0) {
            s1.push( javaStack.peek() );
        }
        System.out.println( s1.peek() );*/

        // reverse list elements
        /*step 1: push elements to stack by removing from list
         step 2:    add elements to list by poping from stack*/
        List l = new ArrayList<>();
        l.add( "1" );
        l.add( "2" );
        l.add( "3" );
        Stack<String> stack = new Stack<String>();
        while (l.size() > 0) {
            stack.push( (String) l.remove( 0 ) );
        }

        while (stack.size() > 0) {
            l.add( stack.pop() );
        }
        System.out.println( l );
    }

}
