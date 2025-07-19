public class ConstructorOrder {
    static class X{
        X(){
            System.out.println("X");
        }
    }
    static class Y extends X{
        Y(){
            System.out.println("Y");
        }
    }
    static class Z extends Y{
        Z(){
            System.out.println("Z");
        }
    }

    public static void main(String[] args) {
        Z z = new Z();
    }
}
