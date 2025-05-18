import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scanner.nextInt();
        System.out.println("Enter m");
        int m = scanner.nextInt();

        System.out.println("The multiplication table of " + n + " is");
        for (int i = 1; i <= m; i++) {
            System.out.println(i + "*" + n + "=" + (i * n));
        }

        scanner.close();
    }
}
