package nov_19Practicalsession;

import java.util.Scanner;

public class MakeNumNegative {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int rev=0;
		while(a>0) {
			int num=a%10;
			rev=rev*10+num;
			a=a/10;
					
		}
		System.out.println(rev);

}
}
