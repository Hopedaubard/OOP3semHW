package Seminar4;

import java.util.List;
import java.util.Scanner;

public class TeacherController implements UserController<Teacher> {
    private List<Teacher> teacherList;
    private TeacherView teacherView;

    @Override
    public void create(String firstName, String lastName, String middleName) {
        addTeacherToList(new Teacher(firstName, lastName, middleName));
    }

    public void addTeacherToList(Teacher teacher) {
        this.teacherList.add(teacher);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Teacher> getSortedTeacherList() {
        this.getTeacherList().sort(Teacher::compareTo);
        this.teacherView.sendOnConsole(teacherList);
        return teacherList;
    }

    public void removeTeacherByFIO(String firstName,
                                   String lastName,
                                   String middleName) {
        getTeacherList().removeIf(teacher -> teacher.getFirstName().equals(firstName)
                && teacher.getLastName().equals(lastName)
                && teacher.getMiddleName().equals(middleName));
    }

    public List<Teacher> editTeacher(String firstName,
                                     String lastName,
                                     String middleName) {
        Teacher removableTeacher = new Teacher(firstName, lastName, middleName);
        this.teacherList.remove(removableTeacher);
        System.out.println("Если нужно изменить firstName - введите 1, " +
                "lastName - введите 2, " +
                "middleName - введите 3");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        if (sc.hasNextInt(1)) {
            System.out.println("Введите новое значение firstName");
            firstName = sc.next();
        } else if (sc.hasNextInt(2)) {
            System.out.println("Введите новое значение lastName");
            lastName = sc.next();
        } else if (sc.hasNextInt(3)) {
            System.out.println("Введите новое значение middleName");
            middleName = sc.next();
        }
        this.teacherList.add(new Teacher(firstName, lastName, middleName));
        return this.teacherList;
    }

    @Override
    public String toString() {
        return "TeacherController{" +
                "teacherList=" + teacherList +
                '}';
    }
}
