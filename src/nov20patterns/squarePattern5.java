package nov20patterns;

public class squarePattern5 {
	public static void main(String[] args) {
		int k=5;
        for(int r=1;r<=5;r++) {
        	
		
		for(char c=1;c<=5;c++) {
			if(r==c || k==c) {
				System.out.print("$"+" ");
			}
			else {
				System.out.print("*"+" ");
			}
			
		}
		k--;
		System.out.println();
        }
        }

}
