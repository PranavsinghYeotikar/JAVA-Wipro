

import java.util.ArrayList;

public class ThreeMaxMin{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int max = arr[0];
        int min = arr[0];

        ArrayList<Integer> minArr = new ArrayList<>();
        ArrayList<Integer> maxArr = new ArrayList<>();
        if(arr.length < 6) System.out.println("Not possible");

        while(maxArr.size() <=3 || minArr.size() <=3){
            for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                minArr.add(min);
            }
            if(max < arr[i]){
                max = arr[i];
                maxArr.add(max);
            }
        }
        }

        System.out.println(minArr);
        System.out.println(maxArr);
    }
}