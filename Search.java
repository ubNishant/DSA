public class Search {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int element = 6;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.err.println("Element foundat" + " " + i);

                found = true;
                break;
            }

        }
        if (!found) // if(found==flase)
        {
            System.out.println("elememt not found");
        }
    }
}
