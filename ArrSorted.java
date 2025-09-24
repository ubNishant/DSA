class ArrSorted {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 10, 9 };

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted == true) {
            System.out.println("array is sorted");
        }
        if (isSorted == false) {
            System.out.println("array is not sorted");
        }
    }
}
