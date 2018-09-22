/*
 * Class name: Expense_manager
 * @version 1.8.0_181
 * @author ShrutiSinha 
 * @date 22 Sept 2018
 * 
 * Description:
 * A program in Java to print the following pattern on console.

Enter your choice : 
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 

Enter your choice : 
2
 * 
* * 

Enter your choice : 
3
  * 
 * * 
* * * 

 */

package pattern;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pattern {
	public static void main(String args[]) {
		int i;
		int j;
		int m;
		System.out.println("Enter your choice : ");
		Scanner n = new Scanner(System.in);// taking inputs
		int x = 0;
		boolean validInput = false;
		while (!validInput) {// giving exception for invalid inputs
			try {
				x = n.nextInt();// storing user's choice
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Please Enter a Valid Choice!");
				n.next();
			}
		}
		while (x < 1) {
			System.out.println("Please Enter a Valid Choice!");
			n.next();
		}
		for (i = 0; i < x; i++) {
			for (m = 0; m < x - i - 1; m++) {// creating space
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {// printing *
				System.out.print("* ");
			}
			System.out.println();
		}
		n.close();
	}// end of main method

}// end of class
