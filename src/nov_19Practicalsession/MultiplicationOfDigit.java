package nov_19Practicalsession;

import java.util.Scanner;

public class MultiplicationOfDigit {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int multi=1;
		while(a>0) {
			int num=a%10;
			multi*=num;
			a=a/10;
			
		}
		System.out.println(multi);
	}

}



