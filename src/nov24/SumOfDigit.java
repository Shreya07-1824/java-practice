package nov24;

public class SumOfDigit {

	public int Sum(int num) {
		int sum=0;
		while(num>0) {
			int r=num%10;
			sum+=r;
			num/=10;
			
		}
		return sum;
	}
}


