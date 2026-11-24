package nov23methods;

public class CountNum {
	public static void countDigit(int num) {
		int count=0;
		while(num>0) {
		
		int r=num%10;
		count=count+1;
		num=num/10;
		}
		System.out.println("total Digit in number is:"+count);
		
	}

}


