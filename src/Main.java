import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StudentManager students = new StudentManager(n);
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int age = sc.nextInt();
            sc.nextLine();
            String address = sc.nextLine();
            double math = sc.nextDouble();
            double lit = sc.nextDouble();
            double eng = sc.nextDouble();
            Student s = new Student(name, age, address, math, lit, eng);
            students.addStudent(s);
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            int index = sc.nextInt();
            sc.nextLine();
            students.getInfo(index);
        }
        sc.close();
    }
}
