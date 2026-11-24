package nov23methods;

public class Calculatormain {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		Calculator c=new Calculator();
		
		c.Addition(a,b);
		c.Substraction(a, b);
		c.Multiplication(a, b);
		c.Division(a, b);
		c.Modulus(a, b);
	}

}
