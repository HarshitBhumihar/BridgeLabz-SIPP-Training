import java.util.Scanner;

public class TwoDToOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int rows = 2;
        int cols = 3;

        int[][] twoDArray = new int[rows][cols];
        int[] oneDArray = new int[rows * cols];

        System.out.println("Enter elements for a 2x3 array:");

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                twoDArray[i][j] = sc.nextInt();
            }
        }

        
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneDArray[index++] = twoDArray[i][j];
            }
        }

        
        System.out.println("\nElements in the 1D array:");
        for (int i = 0; i < oneDArray.length; i++) {
            System.out.print(oneDArray[i] + " ");
        }

        sc.close();
    }
}
