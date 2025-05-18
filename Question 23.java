import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        float cgpa = Float.parseFloat(scanner.nextLine());
        char grade = scanner.nextLine().charAt(0);

        // Truncate CGPA to 2 decimal places
        float truncatedCgpa = (float)((int)(cgpa * 100)) / 100;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.printf("CGPA: %.2f\n", truncatedCgpa);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
