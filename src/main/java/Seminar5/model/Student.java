package Seminar5.model;

public class Student extends User{
    private int studentID;

    public Student(String firstName,
                   String lastName,
                   String middleName,
                   int studentID) {
        super(firstName, lastName, middleName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}';
    }
}


