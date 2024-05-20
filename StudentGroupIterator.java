import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    private int count;

    public StudentGroupIterator(List<Student> studentList) {
        this.studentList = studentList;
        this.count = 0;
    }

    @Override
    public boolean hasNext() {
        return (count < studentList.size());
    }

    @Override
    public Student next() {
        if (hasNext()) return studentList.get(count++);
        return null;
    }

    @Override
    public void remove() {
        if (hasNext()) studentList.remove(count);
    }
}
