

public class Swapping_2_Numbers_3 {

	public static void main(String[] args) {
		
		int a=10,b=20;
		
		System.out.println("Before Swapping :"+a+ " "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After Swapping :"+a+ " "+b);
	}

}
