package com.tka.operator;

import java.util.Scanner;

public class Java2novtask {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the first num");
		int a=s.nextInt();
		System.out.println("enter second num");
		int b=s.nextInt();
		
		System.out.println("the square of num is:"+(a*a));
		System.out.println();
		
		System.out.println("the cube of num is:"+(a*a*a));
		System.out.println();
		
		
		System.out.println("addition of num is:"+(a+b));
		System.out.println();
		
		System.out.println("substraction of num is:"+(a-b));
		System.out.println();
		
		System.out.println("multiplication of num is:"+(a*b));
		System.out.println();
		
		System.out.println("division of num is:"+(a/b));
		System.out.println();
		
		System.out.println("modulus of num is:"+(a%b));
		System.out.println();
		
		System.out.println("enter the radius");
		int c=s.nextInt();
		
		System.out.println("area of circle of  is:"+(2*3.14*c*c));
		System.out.println();
		
		System.out.println("circumeference of circle is:"+(2*3.14*c));
		System.out.println();
		
		System.out.println("enter the length and breadth of rectangle");
		int d=s.nextInt();
		int e=s.nextInt();
		
		System.out.println("area of rectangle is:"+(d*e));
		System.out.println();
		
		System.out.println("enter the side of square");
		int f=s.nextInt();
		System.out.println("the area of square is:"+(f*f));
		System.out.println();
		
		int parbase=10;
		int parheight=12;
		System.out.println("area of parallelogram:"+(parbase*parheight));
		
		int height=10;
		int base=5;
		System.out.println("area of right angled triangle is:"+(0.5*base*height));
		
		
		
		
		
		
	}

}
