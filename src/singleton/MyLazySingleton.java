package singleton;

/**
 * @author $yed
 */
public class MyLazySingleton {
    private static MyLazySingleton myLazySingletonInstance;

    private MyLazySingleton() {
        System.out.println( "From Lazy Singleton" );
    }

    // To make it Thread safe just add synchronized keyword after static
    public static MyLazySingleton getMyLazySingletonInstance() {
        if (myLazySingletonInstance == null) {
            myLazySingletonInstance = new MyLazySingleton();
        }
        return myLazySingletonInstance;
    }
}
