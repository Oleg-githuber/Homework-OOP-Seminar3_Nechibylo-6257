import java.util.Iterator;
import java.util.List;

public class StreamsIterator implements Iterator<StudentStream> {
    private List<StudentStream> streamList;
    private int count;

    // Конструктор
    public StreamsIterator(List<StudentStream> streamList) {
        this.streamList = streamList;
        count = 0;
    }

    @Override
    public boolean hasNext() {
        if (count < this.streamList.size()) return true;
        return false;
    }

    @Override
    public StudentStream next() {
        if (hasNext()) return streamList.get(count++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) this.streamList.remove(count);
    }
}
