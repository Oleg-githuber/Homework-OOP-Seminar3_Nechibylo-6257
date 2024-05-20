import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupServise {
    private StudentGroup studentGroup;

    // Конструктор
    public StudentGroupServise(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    // Геттер
    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    // Сортировка по ID
    public List<Student> getSortedStudentGroupByID() {
        List<Student> sortingStudentList = new ArrayList<>(studentGroup.getStudentList());
        Collections.sort(sortingStudentList);
        return sortingStudentList;
    }

    public List<Student> getSortedStudentGroupByName() {
        List<Student> sortingStudentList = new ArrayList<>(studentGroup.getStudentList());
        sortingStudentList.sort(new StudentComparator());
        return sortingStudentList;
    }
}
