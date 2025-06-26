import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[10];  // To store ages of 10 students

        System.out.println("Enter the age of 10 students:");

       
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        System.out.println("\nVoting Eligibility:");
        
        for (int i = 0; i < 10; i++) {
            if (age[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age " + age[i] + "): Eligible to vote");
            } else {
                System.out.println("Student " + (i + 1) + " (Age " + age[i] + "): Not eligible to vote");
            }
        }

        sc.close();
    }
}
