public class ThreeVarChange{
    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int C = 30;

        int temp = B;
        B = A;
        A = C;
        C = temp;

        System.out.println("A: "+ A + " B: " + B + " C: " + C);
    }
}