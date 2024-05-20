import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  // Очистка консоли. Google помог.
        // Экземпляры студентов
        Student student1 = new Student(1, "Иван", "Иваноыич", "Иванов");
        Student student2 = new Student(2, "Пётр", "Петрович", "Петров");
        Student student3 = new Student(3, "Сидор", "Сидорович", "Сидоров");
        Student student4 = new Student(4, "Иван", "Петрович", "Сидоров");
        Student student5 = new Student(5, "Олег", "Васильевич", "Нечибыло");
        Student student6 = new Student(6, "Филипп", "Бедросович", "Киркоров");
        Student student7 = new Student(7, "Василий", "Васильевич", "Васильев");
        Student student8 = new Student(8, "Иван", "Петрович", "Петров");

        // Создаём группы
        StudentGroup group1 = new StudentGroup(1);
        StudentGroup group2 = new StudentGroup(2);
        StudentGroup group3 = new StudentGroup(3);
        StudentGroup group4 = new StudentGroup(4);
        StudentGroup group5 = new StudentGroup(5);
        StudentGroup group6 = new StudentGroup(6);
        StudentGroup group7 = new StudentGroup(7);
        StudentGroup group8 = new StudentGroup(8);
        StudentGroup group9 = new StudentGroup(9);

        // Создаём потоки
        StudentStream stream1 = new StudentStream(2021);
        StudentStream stream2 = new StudentStream(2022);
        StudentStream stream3 = new StudentStream(2023);

        // Наполняем группы для первого потока
        group1.addStudent(student1);
        group1.addStudent(student2);
        group2.addStudent(student3);
        group2.addStudent(student4);
        group2.addStudent(student5);
        group3.addStudent(student6);
        group3.addStudent(student7);
        group3.addStudent(student8);

        // Наполняем первый поток
        stream1.addGroup(group1);
        stream1.addGroup(group2);
        stream1.addGroup(group3);

        // Наполняем группы для второго потока
        group4.addStudent(student1);
        group4.addStudent(student2);
        group5.addStudent(student3);
        group6.addStudent(student4);
        group6.addStudent(student5);
        group6.addStudent(student6);

        // Наполняем второй поток
        stream2.addGroup(group4);
        stream2.addGroup(group5);
        stream2.addGroup(group6);

        // Наполняем группы для третьего потока
        group7.addStudent(student1);
        group7.addStudent(student2);
        group7.addStudent(student3);
        group7.addStudent(student4);
        group8.addStudent(student5);
        group8.addStudent(student6);
        group8.addStudent(student7);

        // Наполняем третий поток
        stream3.addGroup(group7);
        stream3.addGroup(group8);

        // Сортировка второй группы по фамилиям
        System.out.println("Сортировка студентов по фамилии");
        System.out.println("До сортировки");
        for (Student student : group2) {
            System.out.println(student);
        }
        StudentGroupServise servise1 = new StudentGroupServise(group2);
        List<Student> studentList1 = servise1.getSortedStudentGroupByName();
        System.out.println("После сортировки");
        for (Student student : studentList1) {
            System.out.println(student);
        }

        // Сортировка групп в потоке по количеству студентов
        System.out.println("\nСортировка групп по количеству студентов");
        System.out.println("До сортировки");
        for (StudentGroup group : stream2) {
            System.out.println(group);
        }
        StudentStreamService service2 = new StudentStreamService(stream2);
        List<StudentGroup> groupList1 = service2.getSortedStreamByGroups();
        System.out.println("После сортировки");
        for (StudentGroup group : groupList1) {
            System.out.println(group);
        }

        // Создание списка потоков
        Streams institute = new Streams();
        institute.addStream(stream1);
        institute.addStream(stream2);
        institute.addStream(stream3);

        System.out.println("\nСортировка потоков по количеству студентов");
        System.out.println("До сортировки");
        for (StudentStream stream : institute.getStreams()) {
            System.out.println(stream);
        }
        StreamsService service3 = new StreamsService(institute);
        List<StudentStream> streamList = service3.getSortedStreamList();
        System.out.println("После сортировки");
        for (StudentStream stream : streamList) {
            System.out.println(stream);
        }
    }
}
