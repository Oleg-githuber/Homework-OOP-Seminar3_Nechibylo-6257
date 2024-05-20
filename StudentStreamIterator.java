import java.util.Iterator;
import java.util.List;

public class StudentStreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> studentGroups;
    int count;

    // Конструктор
    public StudentStreamIterator(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        if (this.count < this.studentGroups.size()) return true;
        return false;
    }

    @Override
    public StudentGroup next() {
        if (hasNext()) return this.studentGroups.get(count++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) this.studentGroups.remove(count);
    }
}
