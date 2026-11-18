package nov_18_PracticalSession;

public class SumOfFactors {
	public static void main(String[] args) {
		int a=28;
		int sum=0;
		for(int i=1;i<=28;i++) {
			if(a%i==0) {
				sum+=i;
			}
			
		}
		System.out.println(sum);
	}

}
