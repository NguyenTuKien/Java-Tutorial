package Week1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StudentManager students = new StudentManager(n);
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            String address = sc.next();
            double math = sc.nextDouble();
            double lit = sc.nextDouble();
            double eng = sc.nextDouble();
            Student s = new Student(name, age, address, math, lit, eng);
            students.addStudent(s);
            sc.nextLine();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int index = sc.nextInt();
            students.getInfo(index);
        }
        sc.close();
    }
}