package nov20patterns;

public class homeworksquarepattern {
	public static void main(String[] args) {
		int num=5;
		for(int r=1;r<=5;r++) {
			
			for(int k=1;k<=num-r;k++) {
				System.out.print(" "+" ");
			}
			char a='A';
			for(int c=1;c<=r;c++) {
				System.out.print(a+" ");
				a++;
				
			}
			System.out.println();
		}
	}

}
