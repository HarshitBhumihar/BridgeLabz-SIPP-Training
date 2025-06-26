import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int EMP_COUNT = 10;

        double[] oldSalary = new double[EMP_COUNT];
        int[] serviceYears = new int[EMP_COUNT];
        double[] bonus = new double[EMP_COUNT];
        double[] newSalary = new double[EMP_COUNT];

        double totalBonus = 0;

        
        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            oldSalary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            serviceYears[i] = sc.nextInt();

           
            if (serviceYears[i] >= 10) {
                bonus[i] = oldSalary[i] * 0.10;
            } else if (serviceYears[i] >= 5) {
                bonus[i] = oldSalary[i] * 0.05;
            } else {
                bonus[i] = oldSalary[i] * 0.02;
            }

            newSalary[i] = oldSalary[i] + bonus[i];
            totalBonus += bonus[i];
        }

        
        System.out.println("\n--- Employee Bonus Report ---");
        System.out.println("Emp\tOld Salary\tBonus\t\tNew Salary");

        for (int i = 0; i < EMP_COUNT; i++) {
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\n", 
                              (i + 1), oldSalary[i], bonus[i], newSalary[i]);
        }

        System.out.printf("\nTotal Bonus to be paid by Zara: ₹%.2f\n", totalBonus);

        sc.close();
    }
}
