import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double years = scanner.nextDouble();
        
        double interest = (principal * rate * years) / 100;
        double amount = principal + interest;
        double discount = 0.02 * interest;
        double finalSettlement = amount - discount;
        System.out.printf("%.2f%n", interest);
        System.out.printf("%.2f%n", amount);
        System.out.printf("%.2f%n", discount);
        System.out.printf("%.2f%n", finalSettlement);
        
        scanner.close();
    }
}
