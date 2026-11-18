package nov16;

import java.util.Scanner;

public class DivisibleBy3_7_by_userinput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter starting num ");
		int a=sc.nextInt();
		System.out.println("Enter last num");
		int b=sc.nextInt();
		
		int count=0;
		
		for(int i=a;i<=b;i++) {
			if(i%4==0 && i%7==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("nums divisible by 3 and 7 are" +count);
	}

}
