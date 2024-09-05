package Seminar3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    public List<Stream> streamList;

    public void addStreamToList(Stream stream){
        this.streamList.add(stream);
    }

    public List<Stream> getSortedStreamList(){
        this.streamList.sort(new StreamComparator());
        return streamList;
    }
}
