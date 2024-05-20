import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Comparable<StudentGroup>, Iterable<Student>{
    private List<Student> studentList;
    private int groupID;

    public StudentGroup(int groupID) {
        this.studentList = new ArrayList<>();
        this.groupID = groupID;
    }

    public int getGroupID() {
        return groupID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    public void addStudent(Student student) {
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        return String.format("Группа № %d, количество студентов: %d", groupID, studentList.size());
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.groupID > o.getGroupID()) return 1;
        if (this.groupID < o.getGroupID()) return -1;
        return 0;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this.studentList);
    }
}
