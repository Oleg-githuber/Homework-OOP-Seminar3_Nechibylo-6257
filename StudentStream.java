import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentStream implements Comparable<StudentStream>, Iterable<StudentGroup>{
    private List<StudentGroup> groupList;
    private int streamID;

    // Конструктор
    public StudentStream(int ID) {
        this.groupList = new ArrayList<>();
        this.streamID = ID;
    }

    // Геттер
    public List<StudentGroup> getGroupList() {
        return groupList;
    }

    public int getGroupsValue() {
        return groupList.size();
    }

    public int getStudentsValue() {
        int sum = 0;
        for (StudentGroup group : groupList) {
            sum += group.getStudentList().size();
        }
        return sum;
    }

    public void addGroup(StudentGroup group) {
        this.groupList.add(group);
    }

    @Override
    public String toString() {
        return String.format("Поток № %d, количество групп: %d, количество студентов: %d", this.streamID, this.groupList.size(), this.getStudentsValue());
    }

    @Override   // Сравниваем количество групп в потоке
    public int compareTo(StudentStream o) {
        if (this.groupList.size() > o.getGroupsValue()) return 1;
        if (this.groupList.size() < o.getGroupsValue()) return -1;
        return 0;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(this.groupList);
    }
}
