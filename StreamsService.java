import java.util.ArrayList;
import java.util.List;

public class StreamsService {
    private Streams streams;

    // Конструктор
    public StreamsService(Streams streams) {
        this.streams = streams;
    }

    // Геттер
    public Streams getStreams() {
        return this.streams;
    }

    // Сортировка потоков
    public List<StudentStream> getSortedStreamList() {
        List<StudentStream> streamList = new ArrayList<>(streams.getStreams());
        streamList.sort(new StudentStreamComparator());
        return streamList;
    }
}
