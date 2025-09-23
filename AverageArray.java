public class AverageArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 7 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array is " + " " + sum);
        System.out.println("Avg of array is " + " " + sum / arr.length);

    }

}
