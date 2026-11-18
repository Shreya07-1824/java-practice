package nov_17_transferControlStatement;

public class TransferControl_In_WhileLoop {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==5) {
				break;
			}
			System.out.println(i);
			i++;
		}
	}

}
