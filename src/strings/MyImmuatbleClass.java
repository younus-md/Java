package strings;/*      Declare the class as final so it can’t be extended.
        Make all fields private so that direct access is not allowed.
        Don’t provide setter methods for variables
        Make all mutable fields final so that it’s value can be assigned only once.
        Initialize all the fields via a constructor performing deep copy.
        Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.
        if we declare a variable final it means we cant re assign that variable it doesnt mean it is immutable
        final variable & immutable object
        String buffer cant be immutable*/
public final class MyImmuatbleClass {

    /*private final String name;
    private final int regNo;

    public MyImmuatbleClass(String name, int regNo) {
        this.name = name;
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }*/

    private int rollNum;

    MyImmuatbleClass(int rollNum) {
        this.rollNum = this.rollNum;
    }

    public MyImmuatbleClass createUpdate(int rollNum) {
        if (this.rollNum == rollNum) {
            return this;
        } else {
            return new MyImmuatbleClass( rollNum );
        }
    }
}
