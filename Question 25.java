import java.util.Scanner;

public class TicTacToePosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int row = (n - 1) / 3;
        int col = (n - 1) % 3;

        System.out.println(row + " " + col);

        scanner.close();
    }
}
