import java.util.Scanner;

public class Student {
    String name;
    String stu_id;
    private int mark1;
    private int mark2;
    private int score;

    public Student(String initName, String initId) {
        name = initName;
        stu_id = initId;
    }

    public void setMarks(int m1, int m2) {
        mark1 = m1;
        mark2 = m2;
    }

    public void calculateScore() {
        score = (mark1 + mark2) / 2;
    }

    public void display() {
        System.out.println("The Name is " + name);
        System.out.println("The id is " + stu_id);
        System.out.println("The score is " + score);
    }
}

public class StdDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Student Name and ID:");
        String s = in.nextLine();
        String id = in.nextLine();
        Student stu = new Student(s, id);
        System.out.println("Input marks one and two:");
        int m1 = in.nextInt();
        int m2 = in.nextInt();
        stu.setMarks(m1, m2);
        stu.calculateScore();
        stu.display();
        in.close();
    }
}
