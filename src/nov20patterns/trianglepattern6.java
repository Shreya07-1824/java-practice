package nov20patterns;

public class trianglepattern6 {
	public static void main(String[] args) {
		int ch=5;
		for(int r=1;r<=5;r++) {
			for(int k=1;k<=(ch-r);k++) {
				System.out.print(" ");
			}	
			for(int c=1;c<=r;c++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
