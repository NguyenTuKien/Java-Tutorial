public class StudentManager {
    private Student[] students;
    private int size;

    public StudentManager(int size) {
        this.size = size;
        this.students = new Student[size];
    }

    public void addStudent(Student s) {
        if (size < students.length) {
            students[size] = s;
            size++;
        } 
    }

    public void getInfo(int index) {
        System.out.println(students[index].getName());
        System.out.println(students[index].getAge());
        System.out.println(students[index].getAddress());
        System.out.println(students[index].getMath());
        System.out.println(students[index].getLit());
        System.out.println(students[index].getEng());
        System.out.println(students[index].average());
        System.out.println(students[index].level());
    }
} 