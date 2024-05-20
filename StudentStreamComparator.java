import java.util.Comparator;

public class StudentStreamComparator implements Comparator<StudentStream> {

    @Override
    public int compare(StudentStream o1, StudentStream o2) {
        if (o1.getStudentsValue() > o2.getStudentsValue()) return 1;
        if (o1.getStudentsValue() < o2.getStudentsValue()) return -1;
        return 0;
    }
}
