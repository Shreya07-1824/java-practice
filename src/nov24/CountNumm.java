package nov24;

class CountNum {
	public int Count(int num) {
		int count=0;
		while(num>0) {
			int r=num%10;
			count+=1;
			num/=10;
			
		}
		return count;
		
	}

}
public class CountNumm{
	public static void main(String[] args) {
		int num=1234;
		CountNum c=new CountNum();
		int value=c.Count(num);
		System.out.println(value);
		
	}
}
