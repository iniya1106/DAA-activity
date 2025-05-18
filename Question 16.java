import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int units = scanner.nextInt();
        double billAmount = 0;

        if (units <= 200) {
            billAmount = units * 0.50;
        } else if (units <= 400) {
            billAmount = (units * 0.65) + 100;
        } else if (units <= 600) {
            billAmount = (units * 0.80) + 200;
        } else {
            billAmount = (units * 1.25) + 425;
        }

        System.out.println("Rs." + (int) billAmount);

        scanner.close();
    }
}
