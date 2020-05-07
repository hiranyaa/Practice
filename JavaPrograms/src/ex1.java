

import java.util.Scanner;

public class ex1 {
	
		public static class demos
		{
		    public static void main(String args[])
		    {
		     Scanner s=new Scanner(System.in);  
		     int l=s.nextInt();
		     String[] t=new String[l];

		        for(int i=0;i<l;i++)
		        {
		        String u=s.next();//String readings
		        t[i]=u;

		String s1=t[i].substring(4,t[i].lastIndexOf("."));

		String s2=s1.replaceAll("[aeiouAEIOU]","");

		String s4=t[i].substring(t[i].lastIndexOf("."));

		String s5=s2.concat(s4);
		 
		int l1=s5.length();
		int l2=t[i].length();

		System.out.println(l1+"/"+l2);
		}
		}
		}

	}


