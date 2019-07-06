package java8;

import com.sun.org.apache.bcel.internal.generic.LMUL;

public class Main {
    public static void main(String[] args) {

        AdditionInterface a = (c, b) -> System.out.println( "Welcome To Lambda &the sum is" + (c + b) );
        a.add( 10, 20 );
        a.add( 20, 50 );

        LambdaFeature lambdaFeature = new LambdaFeature();
        lambdaFeature.implementRunnableUsingLambda();
        lambdaFeature.sortUsingLamda();

    }
}
