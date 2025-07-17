public class Hello {
    int ins_val;

    public void printInsVal(int n){
        ins_val = n;
        System.out.println("Instance value: " + ins_val);
    }
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.printInsVal(10); 
    }
}
