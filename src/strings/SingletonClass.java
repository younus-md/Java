package strings;

/*In oops, a singleton class is a class that can have only one object (an instance of the class) at a time.Singletons often control access to resources, such as database connections or sockets.

 Constructor should be private
 Make a private constant static instance (class-member) of this Singleton class.
 or Declare a static private variable object of the class
 Declare a static method to return the instance or Write a static/factory method that returns the object of the singleton class that we have created as a class-member instance.
 *
 * */
public class SingletonClass {
    // early loading
    private static final SingletonClass obj = new SingletonClass();

    private SingletonClass() {
    }

    public static SingletonClass getInstance() {
        return obj;
    }

    // lazy loading
    //Make a private static instance (class-member) of this singleton class. But, DO NOT instantiate it.
    private static SingletonClass SINGLE_INSTANCE = null;

    public static SingletonClass getTInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass.class) {
                SINGLE_INSTANCE = new SingletonClass();
            }
        }
        return SINGLE_INSTANCE;
    }

    // making it thread -safe

    public static SingletonClass getSafeInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (SingletonClass.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new SingletonClass();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
}
