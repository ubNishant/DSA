public class Frequency {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 6, 4, 5, 6, 8 };
        int num = 4;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        System.out.println(count);

    }
}
