public class Inheritance1 {
    public static class A{
        int m,n;
        public void display(){
            System.out.println("Value of m: " + m + " " + " and n: " + n);
        }
    }

    public static class B extends A{
        int c;
        public void display2(){
            System.out.println("Value of c: " + c);
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.m = 12;
        a.n = 10;
        b.c = 32;
        a.display();
        b.display2();
    }
}
