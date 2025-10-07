import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the String");
        String str = sc.nextLine();

        System.out.println(str.replaceAll("\\s", ""));
    }
}