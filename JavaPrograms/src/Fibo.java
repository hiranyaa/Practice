
public class Fibo {

	public static void main(String[] args) {
		
		int n=10, g=0 ,h=1;
		
		System.out.println("Fibo Series :");
		
		for(int i=1;i<=n;++i)
		{
			System.out.println(g);
			
			int c=g+h;
			g=h;
			h=c;
		}
	}

}
