import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();


        int[][] marks = new int[n][3];

        double[] percentage = new double[n];
        char[] grade = new char[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();


            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

       
        System.out.println("\n--- Student Report ---");
        System.out.println("Student\tPhysics\tChemistry\tMaths\t%age\tGrade");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%c\n",
                    (i + 1),
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }

        sc.close();
    }
}
