package nov_17_transferControlStatement;

import java.util.Scanner;

public class Program_UP_to_131_userInput {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter starting range");
		int a=s.nextInt();
		System.out.println("enter last range");
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++) {
			if(i>131) {
				break;
			}
			System.out.println(i);
			
		}
		
	}
	

	
	

}
