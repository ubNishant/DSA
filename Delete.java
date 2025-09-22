class Delete {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int newArr[] = new int[arr.length - 1];
        int index = 3;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j] = arr[i];
            j++;
        }
        for (int num : newArr) {
            System.out.println(num);
        }
    }
}
