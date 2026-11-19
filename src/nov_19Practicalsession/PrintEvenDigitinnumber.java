package nov_19Practicalsession;

import java.util.Scanner;

public class PrintEvenDigitinnumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		while(a>0) {
			int  num=a%10;
			if(num%2==0) {
				System.out.print(num);
			
			}
			a=a/10;
		}
	}

}
