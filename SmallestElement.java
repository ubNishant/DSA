public class SmallestElement {

    public static void main(String[] args) {
        int arr[] = { 13, 14, 15, 3, 4, 5, 6, 7, 2 };
        int i = 0;
        int sam = arr[i];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] < sam) {
                sam = arr[i];
            }
        }
        System.out.println("smallest number is " + " " + sam);
    }
}
