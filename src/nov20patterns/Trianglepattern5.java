package nov20patterns;

public class Trianglepattern5 {
public static void main(String[] args) {
		
		for (int r = 5; r >= 1; r--) {
             char a='A';
			for (int c = 1; c <= r; c++) {

				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
