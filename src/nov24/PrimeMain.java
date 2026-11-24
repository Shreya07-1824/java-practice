package nov24;


class Prime{
	public void prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
			if (count==2) {
				System.out.println("prime number");
			}
			else {
				System.out.println("NOt prime");
			}
			
		
	}
}
public class PrimeMain {
	public static void main(String[] args) {
		
	
	int num=2;
	Prime p=new Prime();
	p.prime(num);

}
}
