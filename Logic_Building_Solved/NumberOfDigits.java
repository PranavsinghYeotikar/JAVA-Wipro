package Milestone1;

public class NumberOfDigits {
    public static void main(String[] args) {
        int numOG = 12345;
        int digits = 0;

        while(numOG != 0){
            int num = numOG % 10;
            numOG = numOG / 10;
            digits = digits + num;
        }

        System.out.println(digits);
    }
}
