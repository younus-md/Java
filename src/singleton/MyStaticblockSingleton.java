package singleton;

/**
 * @author $yed
 */
public class MyStaticblockSingleton {
    private static MyStaticblockSingleton myStaticblockSingletonInstance;

    private MyStaticblockSingleton() {

    }

    static {
        try {
            myStaticblockSingletonInstance = new MyStaticblockSingleton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MyStaticblockSingleton getStaticSingletonInstance() {
        return myStaticblockSingletonInstance;
    }
}
