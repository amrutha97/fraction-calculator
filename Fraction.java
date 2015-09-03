public class Fraction {
	private int num, den;
	private double n;
	
	public Fraction(int num, int denom) {
		this.num = num;
		this.den = denom;
	}
	
	public Fraction(int num) { //whole number
		this.num = num;
		this.den = 1;
	}
	
	public Fraction(double num) {
		this.n = num;
		this.den = 1;
	}

	public Fraction add(Fraction f) {
		if(f.den == this.den) 
			return new Fraction(f.num + this.num, f.den);
		 else 
			return new Fraction((f.num * this.den) + (this.num * f.den), (f.den * this.den));
	}
	
	public Fraction subtract(Fraction f) {
		if(f.den == this.den) 
			return new Fraction(this.num - f.num, f.den);
		else 
			return new Fraction((this.num * f.den) - (f.num * this.den), (f.den * this.den));
	}
	
	public Fraction multiply(Fraction f) {
		return new Fraction((f.num * this.num), (this.den * f.den));
	}
	
	public Fraction divide(Fraction f) {
		return multiply(new Fraction(f.den, f.num));
	}
	
	public double toDouble() {
		return this.n;
	}
	
	//Accessor + toString methods: 
	public int getNum() {
		return this.num;
	}
	public int getDen() {
		return this.den;
	}
	public String toString() {
		if(this.den == 1) return this.num + "";
		else 			  return this.num + "/" + this.den;
	}
}
