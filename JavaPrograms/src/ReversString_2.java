

public class ReversString_2 {

	public static void main(String[] args) {

    //Using Character Array
		
		String s="GANESH";
		System.out.println("Actual string :"+s);
		String rev="";
		
		char a[]=s.toCharArray();
		int len=a.length;
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		
		System.out.println("Revers string :"+rev);

	}

}
