import java.util.Scanner;
public class PATTERN 
{
	public static void main(String args[])
	{
		int i,j,m;
		System.out.println("Enter your choice : ");
		Scanner n = new Scanner(System.in);// taking inputs
		int x = n.nextInt();
		for(i = 0; i < x ; i++)
		{
			for(m = 0 ; m<x-i-1; m++)//creating space
			{
				System.out.print(" ");
			}	
			for(j = 0; j <= i; j++)//printing *
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}
/*
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
