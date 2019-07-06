package java8;

/* Till 1.7 each method in interface is always  public & abstract(even if we dont specify)
  In 1.8 default method & static method is allowed
  In 1.9 private method is also allowed
  No change in variables .They remain public static final in all versions
  Like other methods we can override default method in implementing classes

  */
public interface DefaultMethods {
    default void doSomething() {
        System.out.println( "Hiii I am from default method in interface" );
    }

    /*They are not avaibale by default to impelemting classes. mostly used for utility purpose*/
    static void iamStatic() {
        System.out.println( "Hiii I am from static method in interface" );

    }
}
