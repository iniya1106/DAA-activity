import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hours = new int[7];
        for (int i = 0; i < 7; i++) {
            hours[i] = scanner.nextInt();
        }
        
        int totalSalary = 0;
        
        for (int day = 0; day < 7; day++) {
            int dailyHours = hours[day];
            if (dailyHours == 0) {
                continue; 
            }
            
            int basePay = dailyHours * 100;
            int overtimePay = 0;
            
            if (day != 0 && day != 6) { 
                if (dailyHours > 8) {
                    overtimePay = (dailyHours - 8) * 15;
                }
            }
            
            int dailyTotal = basePay + overtimePay;
            
            if (day == 0) { // Sunday
                dailyTotal += dailyTotal * 50 / 100;
            } else if (day == 6) { // Saturday
                dailyTotal += dailyTotal * 25 / 100;
            }
            
            totalSalary += dailyTotal;
        }
        
        System.out.println(totalSalary);
    }
}
