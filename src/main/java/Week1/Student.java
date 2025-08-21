package Week1;

public class Student {
    private String name;
    private int age;
    private String address;
    private double math;
    private double lit;
    private double eng;

    public Student(String name, int age, String address, double math, double lit, double eng) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.math = math;
        this.lit = lit;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public double getMath() {
        return math;
    }

    public double getLit() {
        return lit;
    }

    public double getEng() {
        return eng;
    }

    public double average() {
        return (math + lit + eng) / 3;
    }

    public String level() {
        double avg = average();
        if (avg >= 8)
            return "Xuat sac";
        else if (avg >= 7)
            return "Gioi";
        else if (avg >= 6)
            return "Kha";
        else if (avg >= 5)
            return "Trung binh";
        else
            return "Yeu";
    }
}