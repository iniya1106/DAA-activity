import java.util.Scanner;

public class OpenMagicDoor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();
        input = input.replaceAll("[^0-9]", "");
        int firstDigit = Character.getNumericValue(input.charAt(0));
        int lastDigit = Character.getNumericValue(input.charAt(input.length() - 1));

        int result = firstDigit + lastDigit;
        System.out.println(result);

        scanner.close();
    }
}
