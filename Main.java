//Amrutha Gujjar
//P1 AP CS 

public class Main {	
	public static boolean flag = true;
	public String input;
	public Calculator calc = new Calculator(input);
	
	public static void main(String[] args) {
		MyUI gui = new MyUI();
		execute(gui);
	}

	private static void execute(MyUI gui) {
		while(flag) {
			String input = gui.getText();
		}
	}
}
