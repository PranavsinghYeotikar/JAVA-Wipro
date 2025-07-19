public class ConstructorOrder2 {
    static class A{
        A(){ System.out.println("A1");}
        A(int a){ System.out.println("a: " + a);}
    }
    static class B extends A{
        B(){ System.out.println("B1");}
        B(int b){  
            this("x"); 
            System.out.println("b: " + b);}
        B(String b){  
            super(1000);
            System.out.println("b: " + b);}
    }
    static class C extends B{
        C(){ System.out.println("C1");}
        C(int c){  
            super(100); 
            System.out.println("c: " + c);}
    }
    
    public static void main(String[] args) {
        C ca = new C(10);
    }
}
