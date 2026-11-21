package nov_19Practicalsession;

import java.util.Scanner;

public class SumOfSquareOfDigit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		while(a>0) {
			int num=a%10;
			sum+=num*num;
			a=a/10;
					
		}
		System.out.println(sum);
		
}



}
