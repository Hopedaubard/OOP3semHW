package Seminar3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentGroup implements Iterable <Student>{
    private List <Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return Iterable.super.spliterator();
    }
}
