package singleton;

/**
 * @author $yed
 */
public class MyEagerSingleton {
    private static MyEagerSingleton myEagerSingletonObj = new MyEagerSingleton();

    private MyEagerSingleton() {
        System.out.println( "Hi I am Eagerly Initialized Singleton" );
    }

    public static MyEagerSingleton getSingletonInstance() {
        return myEagerSingletonObj;
    }
}
