public class LargeAndSmallTwo {
    public static void main(String[] args) {
        int[] array = { 12, 23, 34, 4, 45, 56, 90, 234, -1, -78 };

        int[] ans = findLargeSmallTwo(array);
        System.out.println("Two largest elements are: " + ans[0] + " " + ans[1]);
        System.out.println("Two smallest elements are: " + ans[2] + " " + ans[3]);
    }

    public static int[] findLargeSmallTwo(int[] array) {
        if (array.length >= 4) {
            int max = array[0], max2 = array[0], min = array[0], min2 = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max2 = max;
                    max = array[i];
                } else if (array[i] < min) {
                    min2 = min;
                    min = array[i];
                }
            }
            return new int[] { max, max2, min, min2 };
        }
        return new int[]{-1, -1, -1, -1};
    }
}
