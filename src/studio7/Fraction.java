package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	public Fraction(int top, int bottom) {
		numerator = top;
		denominator = bottom;
	}
	
	public int getNum() {
		return numerator;
	}
	
	public int getDen() {
		return denominator;
	}
	
	public Fraction multiply(Fraction other) {
		numerator = this.getNum() * other.getNum();
		denominator = this.getDen() * other.getDen();
		return new Fraction(numerator, denominator);
	}
	
	public Fraction add(Fraction other) {
		if(this.getDen() == other.getDen()) {
			numerator = this.getNum() + other.getNum();
			denominator = this.getDen() + other.getDen();
		}
		else {
			numerator = (this.getNum() * other.getDen()) + (other.getNum() * this.getDen());
			denominator = (this.getDen() * other.getDen()) + (other.getDen() * this.getDen());
		}
		return new Fraction(numerator, denominator);
	}

	public Fraction simplify() {
		for(int i = 2; i <= getNum() || i <= getDen(); i++) {
			if(getNum() % i == 0 && getDen() % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
				i = 2;
			}
		}
		return new Fraction(numerator, denominator);
	}
	
public static void main(String[] args) {
	Fraction test = new Fraction(2, 3);
	System.out.println(test.getNum());
	System.out.println(test.getDen());
	Fraction test2 = new Fraction(7, 8);
	System.out.println(test.multiply(test2).simplify());
	System.out.println(test.add(test2).simplify());
}

@Override
public String toString() {
	return numerator + "/" + denominator;
}

}
