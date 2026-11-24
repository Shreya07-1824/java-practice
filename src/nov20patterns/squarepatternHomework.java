package nov20patterns;

public class squarepatternHomework {
	public static void main(String[] args) {


        for (int i = 0; i < 7; i++) {

            for (int j = 0; j < 7; j++) {
                System.out.print((7 - i + j - 1) % 7 + 1);
            }

            System.out.println();
        }
    }
}

	


