package oops.encapsulation;
/*Encapsulation :Hide the implementation details from users(ex: a capsule) A java bean class is fully encapsulated
* Make all fields private
* Have setters & getters
* */
public class Student {

   private int studentId;
   private  String studentName;
   private float studentMarks;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getStudentMarks() {
        return studentMarks;
    }

    public void setStudentMarks(float studentMarks) {
        this.studentMarks = studentMarks;
    }


}
