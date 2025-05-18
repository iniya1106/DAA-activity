import java.util.Scanner;

public class CurrencyAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dollars1 = scanner.nextInt();
        int cents1 = scanner.nextInt();
        int dollars2 = scanner.nextInt();
        int cents2 = scanner.nextInt();

        int totalCents = cents1 + cents2;
        int extraDollars = totalCents / 100; // Converting excess cents to dollars
        int remainingCents = totalCents % 100;

        int totalDollars = dollars1 + dollars2 + extraDollars;

        System.out.println(totalDollars);
        System.out.println(remainingCents);

        scanner.close();
    }
}
