package nov20patterns;

public class squarepatternsymbol3 {
	public static void main(String[] args) {
        for(int r=1;r<=5;r++) {
        	
		
		for(char c=1;c<=5;c++) {
			if(r==c) {
				System.out.println("$"+" ");
			}
			else {
				System.out.print("*"+" ");
			}
			
		}
		System.out.println();
        }
        }

}
