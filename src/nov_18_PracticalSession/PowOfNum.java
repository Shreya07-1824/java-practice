package nov_18_PracticalSession;

import java.util.Scanner;


public class PowOfNum {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("Enter the power");
		int b=sc.nextInt();
		
		double result=Math.pow(a, b);
		System.out.println(result);
}
}
