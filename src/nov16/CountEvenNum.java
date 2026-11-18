package nov16;

public class CountEvenNum {
	public static void main(String[] args) {
		int count=0;
		for(int i=101;i<=201;i++) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("the total even nums in given range is" +count);
	}

}
