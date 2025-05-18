import java.util.Scanner;

public class FloatRounding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float num = scanner.nextFloat();

        int intPart = (int) num;
        int ceilValue = (int) Math.ceil(num);
        int floorValue = (int) Math.floor(num);

        System.out.println(intPart);
        System.out.println(ceilValue);
        System.out.println(floorValue);

        scanner.close();
    }
}
