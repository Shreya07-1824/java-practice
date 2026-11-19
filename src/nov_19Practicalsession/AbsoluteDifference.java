package nov_19Practicalsession;

import java.util.Scanner;

public class AbsoluteDifference {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number ");
		int a=s.nextInt();
		int temp=a;
		int rev=0;
		while(a>0) {
			int num=a%10;
			rev=rev*10+num;
			a=a/10;
					
		}
		int absolutediff=rev-temp;
		System.out.println(absolutediff);
}

}


