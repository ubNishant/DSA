public class SumArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 0, 6, 7 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array is " + " " + sum);
    }

}
