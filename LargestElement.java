class LargestElement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int i = 0;
        int max = arr[i];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }
            // System.out.println("largest elemtent is" + " " + max);

        }
        System.out.println("largest elemtent is" + " " + max);
    }
}