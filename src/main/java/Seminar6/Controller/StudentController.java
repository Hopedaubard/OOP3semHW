package Seminar6.Controller;

import Seminar6.Model.Stream;
import Seminar6.Model.Student;
import Seminar6.Service.StreamService;
import Seminar6.Service.StudentGroupService;
import Seminar6.View.StudentView;

import java.util.List;

public class StudentController implements UserCreateController<Student> {
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService();
    private final StudentView studentView = new StudentView();

    public void removeStudentByFIO(String firstName,
                                   String lastName,
                                   String middleName) {
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    public List<Student> getSortedStudentList() {
        List<Student> studentList = studentGroupService.getSortedStudentList();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    public List<Student> getSortedStudentByFIO() {
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    //    public void AddStreamToList(){
    //        streamService.addStreamToList();
    //    }
    public List<Stream> getSortedStreamList() {
        return streamService.getSortedStreamList();
    }

    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
