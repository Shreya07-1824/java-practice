package nov3;

import java.util.Scanner;

public class DebitCard {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the card number");
		long num=s.nextLong();
		
		System.out.println("cvv number");
		int cvv=s.nextInt();
		
		System.out.println("enter expiry date");
		String date=s.next();
		
		
		System.out.println("total amount");
		double amt=s.nextDouble();
		
		System.out.println("enter OTP");
		long otp=s.nextLong();
		
		System.out.println("enter the account holders name");
		String name=s.next();
		
		
		System.out.println("card number is:"+num);
		System.out.println("expiry date:"+date);
		System.out.println("total amount:"+amt);
		System.out.println("OTP:"+otp);
		System.out.println("the account holders name is:"+name);


		
		
	}

}
