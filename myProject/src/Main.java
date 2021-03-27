import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("enter length : ");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int array = new int[num];

        System.out.println("enter elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextInt();
        }

        System.out.println("your array : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "] ");
        }

        System.out.println("\nrevers array");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("[" + array[i] + "] ");
        }

    }
}
