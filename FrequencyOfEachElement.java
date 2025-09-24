public class FrequencyOfEachElement {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 6, 7, 4, 1, 5, 2, 3, 6, 5, 4, 1, 12, 12, 12, 14, 14 };

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int count[] = new int[max + 1];
        // int countt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i]) {
                count[arr[i]]++;

            }
            // count[i] = arr[countt];
        }
        for (int i = 0; i < count.length; i++)
            System.out.println("frequency of" + i + " " + "is" + " " + count[i]);
    }
}
// frequency of0 is 0
// frequency of1 is 4
// frequency of2 is 3
// frequency of3 is 2
// frequency of4 is 3
// frequency of5 is 3
// frequency of6 is 2
// frequency of7 is 1
// frequency of8 is 0
// frequency of9 is 0
// frequency of10 is 0
// frequency of11 is 0
// frequency of12 is 3
// frequency of13 is 0
// frequency of14 is 2