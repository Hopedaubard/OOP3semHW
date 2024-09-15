package Seminar5.service;

import Seminar5.model.Student;
import Seminar5.model.Teacher;
import Seminar5.model.User;

import java.util.List;

// Создать класс УчебнаяГруппаСервис, в котором реализована функция
// (входные параметры - (Teacher, List<Strudent>)) формирования
// из Студентов и Преподавателя УчебнойГруппы и возвращения его;
public class StudyGroupService {
    private Teacher groupTeacher;
    private List<Student> groupStudents;
    public List<User> currentStudyGroup;

    public List<User> toCreateStudyGroup(Teacher teacher,
                                         List<Student> studentList) {
        this.groupTeacher = teacher;
        this.groupStudents = studentList;
        this.currentStudyGroup.add(teacher);
        this.currentStudyGroup.addAll(studentList);
//        for (Student student:studentList) {
//            this.currentStudyGroup.add(student);
//        }
        return currentStudyGroup;
    }
    public void printTeacher(){
        System.out.println(groupTeacher.toString());
    }
    public Teacher getTeacher(){
        return this.groupTeacher;
    }
    public List<Student> getGroupStudents(){
        return this.groupStudents;
    }

}
