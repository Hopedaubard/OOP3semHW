package Seminar3;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamIterator implements Iterator<StudentGroup> {
    private int count;
    private final List<StudentGroup> studentGroupList;
    public StreamIterator(Stream stream) {
        this.count = 0;
        this.studentGroupList = stream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentGroup next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }

    @Override
    public void forEachRemaining(Consumer<? super StudentGroup> action) {
        Iterator.super.forEachRemaining(action);
    }
}
