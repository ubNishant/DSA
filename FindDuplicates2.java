import java.util.Arrays;

public class FindDuplicates2 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 4, 6 };

        System.out.println("Dupicates number are");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
            }

        }

    }

}
