

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		int rem; 
		int rev = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		
		while(num!=0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("\nThe reverse Number: "+rev);

	}

}
