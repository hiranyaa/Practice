
import java.util.Scanner;

public class Stars {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int side, i, j;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Side of a Square : ");
		side = sc.nextInt();	
			
		for(i = 1; i <= side; i++)
		{
			for(j = 1; j <= side; j++)
			{
				System.out.print("*"); 
			}
			System.out.print("\n"); 
		}	
	}

}