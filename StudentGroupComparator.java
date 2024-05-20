import java.util.Comparator;

public class StudentGroupComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        if (o1.getStudentList().size() > o2.getStudentList().size()) return 1;
        if (o1.getStudentList().size() < o2.getStudentList().size()) return -1;
        return 0;
    }
}
