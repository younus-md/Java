package exceptions;

public class ExceptionCode {
    int a = 10;

    void runTimeException(){
        try{
            final int i = a / 0;

        }catch(Exception ex){
            throw new RuntimeException();
          //  System.out.println("in catch block");  -- unreachable code

        }finally {
            System.out.println("in finally block");
        }
    }
}
