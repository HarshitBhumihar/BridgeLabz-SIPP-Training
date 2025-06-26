import java.util.Scanner;

public class TableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a number to print its multiplication table from 6 to 9: ");
        int num = sc.nextInt();

       
        System.out.println("\nMultiplication Table of " + num + " from 6 to 9:");
        for (int i = 6; i <= 9; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        sc.close();
    }
}
