import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char ch = scanner.next().charAt(0); // Read a single character
        int ascii = (int) ch;               // Get ASCII value

        System.out.println(ascii);

        scanner.close();
    }
}
