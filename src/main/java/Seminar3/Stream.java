package Seminar3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Stream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;
    private int groupCount;

    @Override

    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public void forEach(Consumer<? super StudentGroup> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<StudentGroup> spliterator() {
        return Iterable.super.spliterator();
    }

    public int getGroupCount() {
        groupCount = this.studentGroupList.size();
        return groupCount;
    }
}
