package nov_17_transferControlStatement;

public class TransferControl_in_while_Continue {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
