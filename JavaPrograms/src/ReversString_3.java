

public class ReversString_3 {

	public static void main(String[] args) {
		
    // Using StringBuffer class

    String s="GaneshHiranya";
    System.out.println("Actual String :"+s);
    String rev="";
    
    StringBuffer sb=new StringBuffer(s);
    System.out.println("Revers String :"+sb.reverse());

	}

}
