
import java.util.Scanner;

public class Calculator {
    int num1;
    int powerInt;
    double num2;
    int powerDouble;

    public int powerInt(int num1, int powerInt){
        return (int)Math.pow(num1, powerInt);
    }

    public double powerDouble(double num2, int powerDouble){
        return (int)Math.pow(num2, powerDouble);
    }

    public void printNumInt(int ansInt){
        System.out.println("The power of num1 with num is: " + ansInt);
    }

    public void printNumDouble(double ansDouble){
        System.out.println("The power of num1 with num is: " + ansDouble);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your integer num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your power power1: ");
        int powerInt = sc.nextInt();
        System.out.println("Enter your double num2: ");
        double num2 = sc.nextDouble();
        System.out.println("Enter your power powerDouble: ");
        int powerDouble = sc.nextInt();

        Calculator calc = new Calculator();
        int ansInt = calc.powerInt(num1, powerInt);
        double ansDouble = calc.powerDouble(num2, powerDouble);
        calc.printNumInt(ansInt);
        calc.printNumDouble(ansDouble);
    }
}
