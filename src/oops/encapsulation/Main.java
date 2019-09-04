package oops.encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId( 101 );
        student.setStudentMarks( 98.5f );
        student.setStudentName( "Younus" );
        System.out.println( "Name" + student.getStudentName() );

    }
}
