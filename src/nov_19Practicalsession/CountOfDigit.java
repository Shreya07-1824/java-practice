package nov_19Practicalsession;

import java.util.Scanner;

public class CountOfDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int count=0;
		while(a>0) {
			int num=a%10;
			count++;
			a=a/10;
		}
		System.out.println("total digit in number is "+count);
	}

}
