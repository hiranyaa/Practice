

public class DisplayDetails {
	
	int idNo;
	String Name;
	float sal;
	   void displayDetails()
	   {
		   sal+=109.90f;
		   System.out.println("idNo :"+idNo);
		   System.out.println("Name :"+Name);
		   System.out.println("sal :"+sal);
	   }
	   public static void main(String[] args)
	   {
		   DisplayDetails d=new DisplayDetails();
		   
		   d.idNo=8;
		   d.Name="Hiranya";
		   d.sal=500000.00f;
		   d.displayDetails();
	   }
}
