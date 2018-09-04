import java.util.Scanner;
public class PATTERN 
{
	public static void main(String args[])
	{
		int i,j,m;
		System.out.println("Enter your choice : ");
		Scanner n = new Scanner(System.in);
		int k = n.nextInt();
		for(i = 0; i < k ; i++)
		{
			for(m = 0 ; m<k-i-1; m++)
			{
				System.out.print(" ");
			}	
			for(j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
}