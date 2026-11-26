package nov26practice;

public class CountPerfectNum {
	
	public boolean perfectnum(int num) {
		int temp=num;
		int sum=0;
		int i;
		for( i=1;i<num;i++){
			if (num%i==0){
				sum+=i;
			}
		}
		if (sum==temp) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	
	public void count(int a,int b) {
		int count=0;
		for(int i=a;i<=b;i++) {
			 if (perfectnum(i)==true) {
				 count+=1;
				 
			 }
		}
		System.out.println("total number of perfect num is:"+count);
	}
	
	
public static void main(String[] args) {
	CountPerfectNum p=new CountPerfectNum();
	p.count(1, 1000);
}
	

}
