package nov_18_PracticalSession;

public class Multi_and_Sum {
	public static void main(String[] args) {
		int sum=0;
		int multipli=1;
		for(int i=1;i<=10;i++) {
			sum+=i;
			multipli*=i;
		}
		System.out.println("sum is: "+sum);
		System.out.println("multiplication  is: "+multipli);

	}

}
