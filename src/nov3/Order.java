package nov3;

import java.util.Scanner;

public class Order {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("ordered by ");
		String customer=s.nextLine();
		
		System.out.println("ordered item");
		String itemname=s.nextLine();
		
		System.out.println("quantity");
		int qty=s.nextInt();
		
		System.out.println("order price");
		float price=s.nextFloat();
		
		float total=price*qty;
		double stategst=(total*2.5)/100;
		double centralgst=(total*2.5)/100;
		double parcelcharge=100.0;
		
		double nettotal=total+stategst+centralgst+parcelcharge;
		
		System.out.println("ordered by :"+customer);
		System.out.println("ordered item:"+itemname);
		System.out.println("quantity:"+qty);
		System.out.println("order price:"+price);
		
		System.out.println("Total amount to pay:"+total);
		System.out.println("the state gst is:"+stategst);
		System.out.println("the centralgst:"+centralgst);
		System.out.println("parcelcharges:"+parcelcharge);
		System.out.println("Net order Total is"+nettotal);
		

		
	}

}
