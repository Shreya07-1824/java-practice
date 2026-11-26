package nov26practice;

class PerfectNum {
	public void perfectnum(int num) {
		int temp=num;
		int sum=0;
		for(int i=1;i<num;i++){
			if (num%i==0){
				sum+=i;
			}
		}
		if (sum==temp) {
			System.out.println("perfect number");
			
		}
		else {
			System.out.println(" not a perfect number");
		}
		
	}



public static void main(String[] args) {
		
		PerfectNum p=new PerfectNum();
		p.perfectnum(28);
	}
}


