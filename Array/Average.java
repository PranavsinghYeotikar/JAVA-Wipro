
public class Average {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<10; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for(int i=0; i<10; i++){
            sum = sum + a[i];
        }
        int average = sum/a.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
