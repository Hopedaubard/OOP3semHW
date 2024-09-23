package Seminar6.Model;


public class Student extends User implements Comparable <Student> {
    private Long studentID;

    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    @Override
    public int compareTo(Student o) {
        return this.studentID.compareTo(o.studentID);
    }
}
