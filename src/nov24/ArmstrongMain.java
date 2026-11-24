package nov24;




class Armstrong{
	
	public int Count(int num) {
		int count=0;
		while(num>0) {
			int r=num%10;
			count+=1;
			num/=10;
			
		}
		return count;
		
	}
	public int power(int base,int pow) {
		int result=1;
		for(int i=1;i<=pow;i++) {
			result=result*base;
		}
		return result;
	}
	public void Arm(int num) {
		int temp=num;
		int arm=0;
		int l=Count(num);
		while(num>0) {
			int r=num%10;
			arm=arm+power(r,l);
			num/=10;
		}
		if (arm==temp) {
			System.out.println("number is armstrong"); 
		}
		else {
			System.out.println("number not armstrong");
		}
	}
}
public class ArmstrongMain {
	
	public static void main(String[] args) {
		int num=153;
		Armstrong a=new Armstrong();
		a.Arm(num);
	}
	

}
