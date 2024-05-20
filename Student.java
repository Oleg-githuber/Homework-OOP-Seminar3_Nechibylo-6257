public class Student implements Comparable<Student>{
    private int studentId;
    private String firstName;   // Имя
    private String secondName;  // Отчество
    private String lastName;    // Фамилия

    // Конструктор
    public Student(int studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    // Геттеры
    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override   // Сравдение студентов по ID
    public int compareTo(Student o) {
        if(this.studentId > o.getStudentId()) return 1;
        if(this.studentId < o.getStudentId()) return -1;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Студент № %d, фамилия: %s, имя: %s, отчество: %s", studentId, lastName, firstName, secondName);
    }
}
