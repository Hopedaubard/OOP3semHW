package Seminar6.Service;

import Seminar6.Model.Stream;
import Seminar6.Comparator.StreamComparator;

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
