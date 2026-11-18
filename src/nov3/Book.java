package nov3;

import java.util.Scanner;

public class Book {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the book name");
		String name=s.nextLine();
		
		System.out.println("enter the book price");
		int price=s.nextInt();
		
		System.out.println("enter the book quantity");
		int qty=s.nextInt();
		
		int total=price*qty;
		float finaltotal=total-(total*10/100);
		
		
		
		System.out.println("the book name is:"+name);
		System.out.println("the book price is"+price);
		System.out.println("the book quantity is:"+qty);
		System.out.println("total price"+total);
		System.out.println("price after deducting discount"+finaltotal);
		
		
		
		
		
		
	}

}
