public class MaxMinHard {
    public static void main(String[] args) {
        int[] a = {12, 1, 34, 21, 3, 12, 90};

        int[] c = maxMin(a);

        System.out.println("Max: " + c[0] + " Min: " + c[1]);
    }

    public static int[] maxMin(int[] a){
        int max = a[0];
        int min = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
            else if(a[i] < min){
                min = a[i];
            }
        }
        return new int[]{max, min};
    }
}
