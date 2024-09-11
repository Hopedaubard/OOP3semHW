package Seminar4;

import java.util.Iterator;

public class Teacher extends User implements Comparable <Teacher>{
    private Long teacherID;
    private TeacherController teacherController;
    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }
    @Override
    public int compareTo(Teacher o) {
        return this.teacherID.compareTo(o.teacherID);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                " firstName=" + super.getFirstName() +
                " lastName=" + super.getLastName() +
                " middleName=" + super.getMiddleName() +
                '}';
    }
}
