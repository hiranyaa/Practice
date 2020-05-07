

public class Encapsulation {
	
	int i,j;
	void displayDetails()
	{
		i=i+1;
		j=j-2;
		
		System.out.println("i value : "+i);
		System.out.println("j value :"+j);
	}

	public static void main(String[] args) {
		
		Encapsulation e= new Encapsulation();
		e.i=800;
		e.j=900;
		e.displayDetails();

	}

}
