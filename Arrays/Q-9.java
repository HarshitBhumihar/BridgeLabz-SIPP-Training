import java.util.Scanner;

public class FactorsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number to find its factors: ");
        int num = sc.nextInt();

        
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }


        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        
        System.out.println("Factors of " + num + " are:");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + " ");
        }

        sc.close();
    }
}
