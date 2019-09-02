package exceptions;

public class ExceptionDemo {
    public static void main(String[] args) {

        try {
            throw new CustomException( "I am Custom Exception" );
        } catch (CustomException e) {
            System.out.println( "Cuaght" );
            e.printStackTrace();
        }

    }

}
