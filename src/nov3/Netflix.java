package nov3;

import java.util.Scanner;

public class Netflix {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("customer name");
		String name=s.nextLine();
		
		System.out.println("customer phone");
		long phone=s.nextLong();
		
		System.out.println("email id");
		String email=s.nextLine();
		
		
		System.out.println("subscription amount");
		float amt=s.nextFloat();
		
		System.out.println("customer name is :"+name);
		System.out.println("customer phone is "+phone );
		System.out.println("email id is:"+email);
		System.out.println("subscription amount is "+amt);
		
	}

}
