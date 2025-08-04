import java.util.*;

public class Set1 {

    static class Student implements Comparable<Student> {
        int rollno;
        String name;
        int marks;

        Student(int rollno, String name, int marks) {
            this.rollno = rollno;
            this.name = name;
            this.marks = marks;
        }

        public int compareTo(Student student) {
            // You can change the logic if you want descending order
            if (this.marks == student.marks)
                return this.rollno - student.rollno; // tie breaker
            return this.marks - student.marks;
        }

        @Override
        public String toString() {
            return rollno + ": " + name + ": " + marks;
        }
    }

    public static void main(String[] args) {
        TreeSet<Student> treeset = new TreeSet<>();
        treeset.add(new Student(1, "Ajay", 66));
        treeset.add(new Student(2, "Abhi", 96));
        treeset.add(new Student(3, "Sanjai", 45));
        treeset.add(new Student(4, "Ravi", 96)); // to test tie condition

        for (Student st : treeset) {
            System.out.println(st);
        }
    }
}
