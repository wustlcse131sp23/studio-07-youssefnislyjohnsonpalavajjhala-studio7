package studio7;

public class Die {
	private int sides;
	public Die(int n) {
		sides = n;
	}

	public int throwDie() {
	return((int)(Math.random() * sides) + 1);
	}

	public int getSides() {
	return(sides);
	}
	
public static void main(String[] args) {
	Die test = new Die(6);
	System.out.println(test.getSides());
	System.out.println(test.throwDie());
	Die test2 = new Die(20);
	System.out.println(test2.throwDie());
}

}
