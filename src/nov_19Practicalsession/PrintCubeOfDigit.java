package nov_19Practicalsession;

import java.util.Scanner;

public class PrintCubeOfDigit {
	public static void main(String[] args) {
		
	
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number ");
	int a=s.nextInt();
	int cube=0;
	while(a>0) {
		int num=a%10;
		cube=num*num*num;
		System.out.print(cube);
		a=a/10;
		
	}

}
}