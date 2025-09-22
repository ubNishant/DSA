class Insert {

    public static void main(String[] args) {
        int index = 2;
        int element = 69;
        int Arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int newArr[] = new int[Arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = Arr[i];
            newArr[index] = element;

        }
        for (int i = index; i < Arr.length; i++) {
            newArr[i + 1] = Arr[i];
        }

        for (int num : newArr) {
            System.out.println(num);
        }
        for (int num2 : Arr) {
            System.out.println(num2);
        }
    }
}