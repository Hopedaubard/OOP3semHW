package Seminar5.model;

import Seminar5.service.StudyGroupService;

import java.util.List;

public class StudyGroup {
//    private int studuGroupId;
    private Teacher teacher;
    private List<Student> studentList;
//    private List<User> studyGroup;
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
//        this.studyGroup = studyGroupService.toCreateStudyGroup(this.teacher, this.studentList);
    }

//    public List<User> getStudyGroup() {
//        return studyGroup;
//    }


//    public Teacher getTeacher() {
//        return teacher;
//    }
}
