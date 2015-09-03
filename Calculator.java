import java.util.*;

public class Calculator {
	private String input;
	public Calculator(String input) {
		this.input = input;
	}
	
	public Fraction store(String s) {
		Scanner readLine = new Scanner(s);
		if(!s.contains("sin") && !s.contains("cos") && !s.contains("tan")) {
			ArrayList<String> myList = new ArrayList<String>();
			while(readLine.hasNext()) 
				myList.add(readLine.next());
			return convert(myList);
		} else if(s.startsWith("sin")) {
			return new Fraction((int) Math.sin(Integer.parseInt(s.substring(s.indexOf("n") +1))));
		} else if(s.startsWith("cos")) {
				return (new Fraction((int) Math.cos(Integer.parseInt(s.substring(s.indexOf("s") +1)))));
		} else if(s.startsWith("tan")) {
			return (new Fraction((int) Math.tan(Integer.parseInt(s.substring(s.indexOf("n") +1)))));
		}
		return null;
	}
	
	public static Fraction convert(ArrayList<String> myList) {
		ArrayList<Fraction> items = new ArrayList<Fraction>();
		char operator = ' ';	
		for(String s: myList) {
			if(!s.equals("+") && !s.equals("-") && !s.equals("*")  && !s.equals("/")  && !s.equals("^")  && !s.equals("√")) {
				if(s.contains("/")) {
					int num = Integer.parseInt(s.substring(0, s.indexOf("/")));
					int denom = Integer.parseInt(s.substring(s.indexOf("/")+1));
					items.add(new Fraction(num, denom));
				} else if(!myList.contains("√")){
					items.add(new Fraction(Integer.parseInt(s)));
				} else {
					items.add(new Fraction(Double.parseDouble(s)));
				}
			} else {
				operator = s.charAt(0);
			}
		} return (reduce(compute(items, operator)));
	}

	private static Fraction compute(ArrayList<Fraction> items, char operator) {
		if(operator == '+') 
			return items.get(0).add(items.get(1));
		else if(operator == '-') 
			return items.get(0).subtract(items.get(1));
		else if(operator == '*') 
			return items.get(0).multiply(items.get(1));
		else if(operator == '/') 
			return items.get(0).divide(items.get(1));
		else if(operator == '^') 
			return new Fraction(Math.pow(items.get(0).toDouble(), items.get(1).toDouble()));
		else if(operator == '√') 
			//double d = (items.get(0)).toDouble();
			return new Fraction(Math.sqrt(items.get(0).toDouble()));
		return null;
	}
		
	public static Fraction reduce(Fraction one) {
		int GCD = GCD(one.getNum(), one.getDen());		
		if(one.getDen()/GCD != 1) 
			return new Fraction(one.getNum()/GCD, one.getDen()/GCD);
		else 
			return new Fraction(one.getNum()/GCD);
	}
	
	private static int GCD(int a, int b) {
		if (b==0) return a;
		else return GCD(b,a%b);
	}
}
