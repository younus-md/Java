package java8;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class Main implements DefaultMethods {

    @Override
    public void doSomething() {
        System.out.println( "From Implementation class" );
    }

    public static void main(String[] args) {

        AdditionInterface a = (c, b) -> System.out.println( "Welcome To Lambda &the sum is" + (c + b) );
        a.add( 10, 20 );
        a.add( 20, 50 );
        LambdaFeature lambdaFeature = new LambdaFeature();
        lambdaFeature.implementRunnableUsingLambda();
        lambdaFeature.sortUsingLamda();
        Main main = new Main();
        main.doSomething(); // directly calling default method of interface
        DefaultMethods.iamStatic();// only way to call a static method we can also call main method in interface

        Test test = new Test();
        test.goToGym();

    }
}
