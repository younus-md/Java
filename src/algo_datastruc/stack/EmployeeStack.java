package algo_datastruc.stack;

import algo_datastruc.stack.BaseStack;

/**
 * @author $yed
 */
public class EmployeeStack {

    //    StackDS<String> stack = new StackDS<>();
    BaseStack<String> stack = new BaseStack<>();

    public void createEmployeeStack() {
        //stack Permanent Empl
        stack.push( "Permanent Employee" );
        stack.push( "Rahul" );
        stack.push( "Rakesh" );
        stack.push( "Ranjeet" );
        stack.push( "Syed" );
        stack.push( "Iliyas" );
        stack.push( "Younus" );

        //stack Contr Empl
        stack.push( "Contract Type" );
        stack.push( "Kavya" );
        stack.push( "Jaanaki" );
        stack.push( "Joseph" );
        stack.push( "Jadega" );
        stack.push( "Sourav" );
    }

    public void deleteEmployeeStack() {
        while (stack.size() > 0) {
            System.out.println( stack.pop() );
        }
    }

    public boolean isEmployeeExists(String name) {
        return stack.contains( name );
    }

    public void searchEmployee(String name) {
        System.out.println( stack.search( name ) );
    }

    public void getSize() {
        System.out.println( stack.size() );
    }
}
