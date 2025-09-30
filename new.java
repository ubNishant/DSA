class news {
    public static void main(String[] argd) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 8, 9, 10 };
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }

        int sumToMax = max * (max + 1) / 2;
        int Missing_number = sumToMax - sum;
        System.out.println("missing number is " + " " + Missing_number);
        System.out.println(sum);
        System.out.println(sumToMax);
        System.out.println(max);

    }

}
