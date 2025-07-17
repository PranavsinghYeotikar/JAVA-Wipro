public class Employee {
    int id = 101;
    String name = "Jay";

    public Employee() {
        System.out.println("The id of the employee: " + name + " having id: " + id);
    }

    public Employee(int no, String Name) {
        id = no;
        name = Name;
        System.out.println("The id of the employee: " + name + " having id: " + id);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(102, "Yash");
    }
}
