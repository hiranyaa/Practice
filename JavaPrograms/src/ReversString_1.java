
public class ReversString_1 {

	public static void main(String[] args) {
		
	// Using String (+)Concatenation operation

     String s="Hiranya";
     System.out.println("Actual String :"+s);     
     String rev="";
    
     
     int len=s.length();
     
     for(int i=len-1;i>=0;i--)
     {
    	 rev=rev+s.charAt(i);
    	 
     }
        System.out.println("Revers String :"+rev);
	}

}
