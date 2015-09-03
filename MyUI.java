import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyUI implements ActionListener {
	//fields
	public JFrame frame;
	private JTextField text;
	private String value, input;
	private JButton equal, plus, minus, mult, divide;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero;	
	private JButton power, sqrt, help, C, off, ac, sin, cos, tan;
	public Calculator calc = new Calculator(input);
	
	public MyUI() {
		//container (holds the other components)
		frame = new JFrame();
		frame.setTitle("My Fraction Calculator");
		frame.setSize(212, 242);
		frame.getContentPane().setBackground(Color.WHITE); 
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Font font1 = new Font("SansSerif", Font.PLAIN, 20);
		text = new JTextField(10);
		text.setFont(font1);
		
		equal = new JButton();
		equal.setText("=");
		equal.setSize(50, 25);
		equal.setOpaque(true);
		equal.setBackground(Color.RED);
		
		one = new JButton();
		one.setText("1");
		one.setSize(50, 25);
		one.setOpaque(true);
		one.setBackground(Color.GRAY);
		
		two = new JButton();
		two.setText("2");
		two.setSize(50, 25);
		two.setOpaque(true);
		two.setBackground(Color.GRAY);
		
		three = new JButton();
		three.setText("3");
		three.setSize(50, 25);
		three.setOpaque(true);
		three.setBackground(Color.GRAY);
		
		four = new JButton();
		four.setText("4");
		four.setSize(50, 25);
		four.setOpaque(true);
		four.setBackground(Color.GRAY);
		
		five = new JButton();
		five.setText("5");
		five.setSize(50, 25);
		five.setOpaque(true);
		five.setBackground(Color.GRAY);
		
		six = new JButton();
		six.setText("6");
		six.setSize(50, 25);
		six.setOpaque(true);
		six.setBackground(Color.GRAY);
		
		seven = new JButton();
		seven.setText("7");
		seven.setSize(50, 25);
		seven.setOpaque(true);
		seven.setBackground(Color.GRAY);
		
		eight = new JButton();
		eight.setText("8");
		eight.setSize(50, 25);
		eight.setOpaque(true);
		eight.setBackground(Color.GRAY);
		
		nine = new JButton();
		nine.setText("9");
		nine.setSize(50, 25);
		nine.setOpaque(true);
		nine.setBackground(Color.GRAY);
		
		zero = new JButton();
		zero.setText("0");
		zero.setSize(50, 25);
		zero.setOpaque(true);
		zero.setBackground(Color.GRAY);
		
		plus = new JButton();
		plus.setText(" + ");
		plus.setSize(50, 25);
		plus.setOpaque(true);
		plus.setBackground(Color.BLUE);

		minus = new JButton();
		minus.setText(" - ");
		minus.setSize(50, 25);
		minus.setOpaque(true);
		minus.setBackground(Color.BLUE);
		
		mult = new JButton();
		mult.setText(" * ");
		mult.setSize(50, 25);
		mult.setOpaque(true);
		mult.setBackground(Color.BLUE);
		
		divide = new JButton();
		divide.setText(" / ");
		divide.setSize(50, 25);
		divide.setOpaque(true);
		divide.setBackground(Color.BLUE);
		
		sin = new JButton();
		sin.setText("sin");
		sin.setSize(50, 25);
		sin.setOpaque(true);
		sin.setBackground(Color.BLACK);
		
		cos = new JButton();
		cos.setText("cos");
		cos.setSize(50, 25);
		cos.setOpaque(true);
		cos.setBackground(Color.BLACK);
		
		tan = new JButton();
		tan.setText("tan");
		tan.setSize(50, 25);
		tan.setOpaque(true);
		tan.setBackground(Color.BLACK);
		
		ac = new JButton();
		ac.setText("AC");
		ac.setSize(50, 25);
		ac.setOpaque(true);
		ac.setBackground(Color.BLACK);
		
		off = new JButton();
		off.setText("Off");
		off.setSize(50, 25);
		off.setOpaque(true);
		off.setBackground(Color.BLACK);
		
		power = new JButton();
		power.setText("^");
		power.setSize(50, 25);
		power.setOpaque(true);
		power.setBackground(Color.BLACK);
		
		sqrt = new JButton();
		sqrt.setText("√");
		sqrt.setSize(50, 25);
		sqrt.setOpaque(true);
		sqrt.setBackground(Color.BLACK);
		
		help = new JButton();
		help.setText("help");
		help.setSize(50, 25);
		help.setOpaque(true);
		help.setBackground(Color.BLACK);
		
		C = new JButton();
		C.setText("C");
		C.setSize(50, 25);
		C.setOpaque(true);
		C.setBackground(Color.BLACK);

		equal.addActionListener(this); one.addActionListener(this);   two.addActionListener(this);  three.addActionListener(this);
		four.addActionListener(this);  five.addActionListener(this);  six.addActionListener(this);  seven.addActionListener(this);
		eight.addActionListener(this); nine.addActionListener(this);  zero.addActionListener(this); sin.addActionListener(this);
		cos.addActionListener(this);   tan.addActionListener(this);   ac.addActionListener(this);   off.addActionListener(this); 
		plus.addActionListener(this);  minus.addActionListener(this); mult.addActionListener(this); divide.addActionListener(this);
		power.addActionListener(this); sqrt.addActionListener(this);  help.addActionListener(this); C.addActionListener(this);
		
		JPanel panel = new JPanel(new GridLayout(6,4));
		
			panel.add(off);   panel.add(ac);       panel.add(C);     panel.add(help);
			panel.add(one);   panel.add(two);      panel.add(three); panel.add(sin);
			panel.add(four);  panel.add(five);     panel.add(six);   panel.add(cos);
			panel.add(seven); panel.add(eight);    panel.add(nine);  panel.add(tan);
			panel.add(plus);  panel.add(minus);    panel.add(zero);  panel.add(sqrt);
			panel.add(divide);panel.add(mult);     panel.add(equal);panel.add(power);
		
		JPanel secondPanel = new JPanel(new FlowLayout());
			secondPanel.add(text);

		frame.setLayout(new BorderLayout());
		frame.add(secondPanel, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == equal) {
		try {
			String s =""+ calc.store(text.getText());
			text.setText(s);
		} catch(Exception ex) {
			text.setText("Please try again.");
		}
		}
		else if(e.getSource() == one) 
			text.setText(text.getText() + "1");
		else if(e.getSource() == two) 
			text.setText(text.getText() + "2");
		else if(e.getSource() == three) 
			text.setText(text.getText() + "3");
		else if(e.getSource() == four) 
			text.setText(text.getText() + "4");
		else if(e.getSource() == five) 
			text.setText(text.getText() + "5");
		else if(e.getSource() == six) 
			text.setText(text.getText() + "6");
		else if(e.getSource() == seven) {
			text.setText(text.getText() + "7");
		}else if(e.getSource() == eight) 
			text.setText(text.getText() + "8");
		else if(e.getSource() == nine) 
			text.setText(text.getText() + "9");
		else if(e.getSource() == zero) 
			text.setText(text.getText() + "0");
		else if(e.getSource() == plus) 
			text.setText(text.getText() + " + ");
		else if(e.getSource() == minus) 
			text.setText(text.getText() + " - ");
		else if(e.getSource() == mult) 
			text.setText(text.getText() + " * ");
		else if(e.getSource() == divide) 
			text.setText(text.getText() + "/");
		else if(e.getSource() == sin) 
			text.setText(text.getText() + "sin");
		else if(e.getSource() == cos) 
			text.setText(text.getText() + "cos");
		else if(e.getSource() == tan) 
			text.setText(text.getText() + "tan");
		else if(e.getSource() == ac) 
			text.setText("");
		else if(e.getSource() == off) {
			frame.setVisible(false); //you can't see me!
			frame.dispose();
		} else if(e.getSource() == power) 
			text.setText(text.getText() + " ^ ");
		  else if(e.getSource() == sqrt) 
			text.setText(text.getText() + " √ ");
		 else if(e.getSource() == sqrt) 
			text.setText("click any buttons");
		 else if(e.getSource() == C) 
			text.setText(text.getText().substring(0, text.getText().length()-1));		
	}	
	public String getText() { return value; }
}
