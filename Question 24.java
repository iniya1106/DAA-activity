import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int reversed = (number % 10) * 100 + ((number / 10) % 10) * 10 + (number / 100);

        System.out.println(reversed);

        scanner.close();
    }
}
