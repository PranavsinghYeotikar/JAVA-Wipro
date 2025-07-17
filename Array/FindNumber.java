import java.util.Scanner;

public class FindNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your target num: ");
        int num = sc.nextInt();
        System.out.println();

        int[] array = {12, 34, 25, 564, 34};

        int index = findNum(num, array);
        System.out.println("Found the element on index: " + index);
    }

    public static int findNum(int num, int[] array){
        for (int i = 0; i < array.length; i++) {
            if(num == array[i]){
                return i;
            }
        }
        return -1;
    }
}
