public class Inheritance3 {
    static class Employee{
        int EmployeeNo;
        String EmpName;

        Employee(){
            System.out.println("Employee No-arg constructor Begins");
            EmployeeNo = 0;
            EmpName = null;
            System.out.println("Employee No-arg constructor Ends");
        }

        Employee(int EmployeeNo){
            System.out.println("Employee 1-arg constructor Begins");
            this.EmployeeNo = EmployeeNo;
            this.EmpName = "UNKNOWN";
            System.out.println("Employee 1-arg constructor Ends");
        }

        Employee(int EmployeeNo, String EmpName){
            System.out.println("Employee 2-arg constructor Begins");
            this.EmployeeNo = EmployeeNo;
            this.EmpName = EmpName;
            System.out.println("Employee 2-arg constructor Ends");
        }

        void display(){
            System.out.println("Employee Number : "+EmployeeNo);
            System.out.println("Employee Name: "+EmpName);
        }
    }

    static class Manager extends Employee{
        String deptName;
        Manager(int EmployeeNo, String name, String deptName){
            super(EmployeeNo, name);

            System.out.println("Manager 3-arg constructor Begins");
            this.deptName = deptName;
            System.out.println("Manager 3-arg constructor Ends");
        }

        void display(){
            super.display();
            System.out.println("DeptName: "+deptName);
        }
    }

    public static void main(String[] args) {
        System.out.println("------------- Main function start ----------");
        System.out.println("Creating object for manager class");
        Manager mm = new Manager(0, "Panya", "CSE");
        System.out.println("Printing the manager details...");
        mm.display();
        System.out.println("------------- Main function ends ----------");
    }
}
