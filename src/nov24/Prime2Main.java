package nov24;
class Prime2{
	public boolean prime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if (num%i==0) {
				count++;
			}
		}
			if (count==2) {
				return true;
			}
			else {
				return false;
			}
	}
			
	public void PrimeRange(int a,int y) {
		for(int i=a;i<=y;i++) {
			if(prime(i)==true) {
		
			System.out.println(i);
			}
		}
	}
			
}
public class Prime2Main {
       public static void main(String[] args) {
	      Prime2 p=new Prime2();
	      p.PrimeRange(1,100);
}
}
