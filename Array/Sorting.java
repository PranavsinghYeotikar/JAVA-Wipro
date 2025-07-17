//Ascending and Descending Sorting of Array
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter whether you want ascending or descending");
        System.out.println("A for ascending and D for descending");
        String order = sc.next();

        int[] arr = {12,4,34,2,43};

        if(order.equals("A")){
            arr = ascending(arr);
            System.out.println("You choosed the ascending option \n Your ascending sorted array is ");
        }
        else if(order.equals("D")){
            arr = descending(arr);
            System.out.println("You choosed the descending option \n Your descending sorted array is ");
        }
        else{
            System.out.println("You entered a wrong char");
            System.out.println("You get the array as it is");
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] ascending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<=i; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] descending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j=0; j<=i; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
