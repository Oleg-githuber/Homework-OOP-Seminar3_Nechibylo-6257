import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Streams implements Iterable<StudentStream>{
    private List<StudentStream> streams;

    // Конструктор
    public Streams() {
        this.streams = new ArrayList<>();
    }

    // Добавление потока в список
    public void addStream(StudentStream stream) {
        this.streams.add(stream);
    }

    // Геттер
    public List<StudentStream> getStreams() {
        return this.streams;
    }

    @Override   // Итератор
    public Iterator<StudentStream> iterator() {
        return new StreamsIterator(this.streams);
    }
}
