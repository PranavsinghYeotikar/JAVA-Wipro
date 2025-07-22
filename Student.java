class Student {
    Student() {
        this("Pranav");
        System.out.println("No-arg constructor");
    }

    Student(String name) {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
    }
}
