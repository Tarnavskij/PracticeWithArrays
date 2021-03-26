import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math[];
        int num;
        System.out.println("enter length : ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        math = new int[num];
        System.out.println("enter elements");
        for (int i = 0; i < math.length; i++) {
            math[i] = s.nextInt();
        }

        System.out.println("your math : ");
        for (int i = 0; i < math.length; i++) {
            System.out.print("[" + math[i] + "] ");
        }

        System.out.println("\nrevers math");
        for (int i = math.length - 1; i >= 0; i--) {
            System.out.print("[" + math[i] + "] ");
        }

    }
}
