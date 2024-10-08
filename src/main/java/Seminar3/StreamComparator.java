package Seminar3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {

    @Override
    public int compare(Stream o1, Stream o2) {
        if (o1.getGroupCount() > o2.getGroupCount()) {
            return 1;
        } else if (o1.getGroupCount() < o2.getGroupCount()) {
            return -1;
        }
        return 0;
    }
}
