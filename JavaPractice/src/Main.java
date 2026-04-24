
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // If position > 3, no swaps affect it
        if (n > 3) {
            System.out.println(n);
            return;
        }

        // Process 3 swap pairs
        for (int i = 0; i < 3; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (n == a) {
                n = b;
            } else if (n == b) {
                n = a;
            }
        }

        System.out.println(n);
    }
}