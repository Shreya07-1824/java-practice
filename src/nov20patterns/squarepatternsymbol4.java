package nov20patterns;

public class squarepatternsymbol4 {
	public static void main(String[] args) {
        for(int r=5;r>=1;r--) {
        	
		
		for(char c=1;c<=5;c++) {
			if(r==c) {
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
