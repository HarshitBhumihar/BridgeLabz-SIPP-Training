package Level_1;

import java.util.Scanner;

public class countDown {

	public static void main(String[] args) {
		// Taking the number input from the user 
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value: ");
		int counter = input.nextInt();
		while(counter > 0) {
			System.out.println(counter);
			counter--;
		}
		

	}

}
