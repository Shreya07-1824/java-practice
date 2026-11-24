package nov24;

class PowerM{
	public int power(int base,int pow) {
		int result=1;
		for(int i=1;i<=pow;i++) {
			result=result*base;
		}
		return result;
	}

}
public class Power{
	public static void main(String[] args) {
		int base=2;
		int pow=3;
		PowerM p=new PowerM();
		int value=p.power(base, pow);
		System.out.println(value);
	}
}
