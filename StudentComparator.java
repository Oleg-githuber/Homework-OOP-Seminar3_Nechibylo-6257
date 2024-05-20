import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());  // Сравнение по фамилии
        if (result ==0) result = o1.getFirstName().compareTo(o2.getFirstName());    // по имени
        if (result == 0) result = o1.getSecondName().compareTo(o2.getSecondName()); // по отчеству
        if (result == 0) result = o1.compareTo(o2);         // по ID
        return result;
    }
}
