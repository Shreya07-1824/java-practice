package nov_18_PracticalSession;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int sum=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				sum+=i;
			}
		}
		if(a==sum) {
			System.out.println("number is perfect");
		}
		else {
			System.out.println("not perfect");
		}
	}

}
