import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of team members: ");
        int n = sc.nextInt();

        
        double[][] data = new double[n][3];

        
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter height (in meters): ");
            double height = sc.nextDouble();

            System.out.print("Enter weight (in kg): ");
            double weight = sc.nextDouble();

            double bmi = weight / (height * height);

                        data[i][0] = height;
            data[i][
