package nov_19Practicalsession;

import java.util.Scanner;

public class PrintSquareDigitOfNum {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int square=0;
		while(a>0) {
			int num=a%10;
			square=num*num;
			System.out.print(square);
			a=a/10;
			
		}
		
	}

}
