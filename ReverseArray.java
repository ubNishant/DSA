class ReverseArray {
    public static void main(String Args[]) {
        int arr[] = { 2, 4, 5, 7, 11, 13, 17 };
        int arr2[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[arr.length - 1 - i];
        }
        for (int num : arr2) {
            System.out.println(num);
        }
    }
}