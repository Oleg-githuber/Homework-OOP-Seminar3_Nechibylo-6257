import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentStreamService{
    private StudentStream studentStream;

    public StudentStreamService(StudentStream studentStream) {
        this.studentStream = studentStream;
    }

    public StudentStream getStudentStream() {
        return studentStream;
    }

    // Сортировка групп по ID
    public List<StudentGroup> getSortedStreamByID() {
        List<StudentGroup> groupList = new ArrayList<>(studentStream.getGroupList());
        Collections.sort(groupList);
        return groupList;
    }

    // Сортировка групп по количеству студентов
    public List<StudentGroup> getSortedStreamByGroups() {
        List<StudentGroup> groupList = new ArrayList<>(studentStream.getGroupList());
        groupList.sort(new StudentGroupComparator());
        return groupList;
    }
}
