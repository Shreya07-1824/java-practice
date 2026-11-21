package nov20patterns;

public class SquareSymbolPattern1 {
	public static void main(String[] args) {
            for(int r=1;r<=5;r++) {
            	
			
			for(char c=1;c<=5;c++) {
				if (c==3) {
				
				System.out.print("$"+" ");
				}
				else {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
            }
	}

}
