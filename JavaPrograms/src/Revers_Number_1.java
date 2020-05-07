

import java.util.Scanner;

public class Revers_Number_1 {

	public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter a value : ");
    
    int num=sc.nextInt();
    
    // 1.using Algorithm
    
    int rev=0;
    while(num!=0)
    {
    	rev=rev*10+num%10;    	
    	num=num/10;
    	
    }
    System.out.println("Revers Number is :"+rev);
    }
  }
