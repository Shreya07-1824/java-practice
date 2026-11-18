package nov_17_transferControlStatement;

import java.util.Scanner;

public class program_donotprintnum_divisibleby_4And7 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter starting range");
		int a=s.nextInt();
		System.out.println("enter last range");
		int b=s.nextInt();
		
		for(int i=a;i<=b;i++) {
			if(i%4==0 && i%7==0) {
				continue;
			}
			System.out.println(i);
			
		}
	}

}
