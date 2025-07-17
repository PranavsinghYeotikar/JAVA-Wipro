import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 65, 23, 9};
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
