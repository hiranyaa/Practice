

import java.util.Scanner;

public class ReversNumber_2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter a value : ");
	    
	    int num=sc.nextInt();
	    
	    // Using String Buffer Class
	    
	    StringBuffer sb=new StringBuffer(String.valueOf(num));
	    
	    StringBuffer rev=sb.reverse();
	    
	    System.out.println("Revers number is :"+rev);
		    
	}	
	}

