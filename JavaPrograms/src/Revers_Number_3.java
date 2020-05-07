

import java.util.Scanner;

public class Revers_Number_3 {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter a value : ");
	    
	    int num=sc.nextInt();
	    
	    // Using String Buffer Class
	    
	   StringBuilder sb=new StringBuilder();
	   sb.append(num);
	   StringBuilder rev=sb.reverse();
	    
	    System.out.println("Revers number is :"+rev);
	}

}
