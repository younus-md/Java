package exceptions;

/*
 During execution of a program, if an exception occurs inside a method,an Object named "Exception Object" is created by that method
 and is  handed over to jvm along with name & description of exception, and current state of the program where exception has occurred
 Creating the Exception Object and handling it to the run-time system is called throwing an Exception.

 If an exception is occurred inside method1,it creates an exception object & handover to jvm which in-turn check if there is
 any exception handling code written. if not written it terminates method abnormally removes its entry from stack & verifies if caller method has
 any handling code or not. if not found, jvm terminate it abnormally & this process is repeated till main method. If Handler code is not
 found, DefaultExceptionHandler prints info to console & terminates program abnormally .All this happens without a try-catch block.so
 it is called "DefaultExceptionHandling"

Run the below example & observe the output in console

*/
public class DefaultExceptionHandling {


    public static void main(String[] args) {
        doWorkout();
    }

    public static void doWorkout() {
        doMoreWorkout();
    }

    public static void doMoreWorkout() {
        int totalDaysInMonth = 30;
        int numOfDaysWorkedOut = 0;
        int weightLoss = 30 / 0;
        System.out.println( "weight Lost" + weightLoss );
    }


}
