package singleton;

/**
 * @author $yed
 */
public class Main {
    public static void main(String[] args) {
        MyLazySingleton m1 = MyLazySingleton.getMyLazySingletonInstance();
        int hashCode1 = m1.hashCode();
        MyLazySingleton m2 = MyLazySingleton.getMyLazySingletonInstance();
        int hashCode2 = m2.hashCode();
        System.out.println( "hashcode1:::" + hashCode1 );
        System.out.println( "hashcode2:::" + hashCode2 );
        MyStaticblockSingleton.getStaticSingletonInstance();
        MyEagerSingleton.getSingletonInstance();
        // You can check the hash codes


    }
}
