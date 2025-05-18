import java.util.Scanner;

public class IPLRunRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBalls = scanner.nextInt();
        int targetRuns = scanner.nextInt();
        int currentRuns = scanner.nextInt();
        int ballsBowled = scanner.nextInt();

        int totalOvers = totalBalls / 6;
        float completedOvers = ballsBowled / 6 + (ballsBowled % 6) / 10.0f;

        float currentRunRate = currentRuns / completedOvers;
        float totalRunRate = targetRuns / (float) totalOvers;

        String eligibility = (currentRunRate > totalRunRate) ? "Eligible to Win" : "Not Eligible to Win";

        System.out.println(totalOvers);
        System.out.printf("%.1f%n", completedOvers);
        System.out.printf("%.1f%n", currentRunRate);
        System.out.printf("%.1f%n", totalRunRate);
        System.out.println(eligibility);

        scanner.close();
    }
}
