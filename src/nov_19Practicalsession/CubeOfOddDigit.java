package nov_19Practicalsession;

import java.util.Scanner;

public class CubeOfOddDigit {
	
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the number ");
			int a=s.nextInt();
			while(a>0) {
				int num=a%10;
				if(num%2!=0) {
					System.out.println(num*num*num);
				}
				a=a/10;
						
			}
			
	}


	}
