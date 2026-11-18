package nov_18_PracticalSession;

public class Multiplicationofoddnum {
	public static void main(String[] args) {
		int multi=1;
		for(int i=701;i>=501;i--) {
			if(i%2!=0) {
				multi*=i;
			}
		}
		System.out.println(multi);
	}

}
