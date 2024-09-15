package Seminar5.controller;

import Seminar5.model.Student;
import Seminar5.model.Type;
import Seminar5.model.User;
import Seminar5.service.DataService;
import Seminar5.service.StudyGroupService;
import Seminar5.view.StudentView;

import java.util.List;

public class Controller {

    private final DataService service = new DataService();
    private final StudentView view = new StudentView();
    private final StudyGroupService studyGroupService = new StudyGroupService();

    public void createStudent(String firstName,
                              String lastName,
                              String middleName) {
        service.create(firstName, lastName, middleName, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            Student student = (Student) user;
            view.printOnConsole(student);
        }
    }
    public void getListStudyGroup(){
        getAllStudent();
        studyGroupService.printTeacher();
        studyGroupService.toCreateStudyGroup(studyGroupService.getTeacher(),
                studyGroupService.getGroupStudents());
    }

}
