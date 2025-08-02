public class StudentManager {
    private Student[] students;
    private int currentSize;  

    public StudentManager(int maxSize) {
        this.students = new Student[maxSize];
        this.currentSize = 0;
    }

    public void addStudent(Student s) {
        if (currentSize < students.length) {
            students[currentSize] = s;
            currentSize++;
        } 
    }

    public void getInfo(int index) {
        if (index >= 0 && index < currentSize) {
            System.out.println(students[index].getName());
            System.out.println(students[index].getAge());
            System.out.println(students[index].getAddress());
            System.out.println(students[index].getMath());
            System.out.println(students[index].getLit());
            System.out.println(students[index].getEng());
            System.out.println(students[index].average());
            System.out.println(students[index].level());
        } else {
            System.out.println("Invalid index!");
        }
    }
} 