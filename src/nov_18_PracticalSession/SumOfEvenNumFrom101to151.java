package nov_18_PracticalSession;

public class SumOfEvenNumFrom101to151 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=101;i<=151;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}
