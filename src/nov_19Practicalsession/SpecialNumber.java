package nov_19Practicalsession;

import java.util.Scanner;

public class SpecialNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int sum=0;
		int multi=1;
		while(a>0) {
			int num=a%10;
		    sum+=num;
		    multi*=num;
			a=a/10;
					
		}
		if(sum==multi) {
		System.out.println("number is special");
		}
		else {
			System.out.println("number is not special");
		}
		
}


}
