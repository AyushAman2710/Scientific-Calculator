package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Scientificcalculator {

	private JFrame frame;
	private JTextField textField;
	double first;
	 double second;
	 double result;
	 String operation;
	 String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scientificcalculator window = new Scientificcalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scientificcalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("              Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 374, 32);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBackground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(10, 41, 324, 39);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btnsqrt = new JButton("\u221A");
		btnsqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	double a=Math.sqrt(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsqrt.setBackground(Color.GREEN);
		btnsqrt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnsqrt.setBounds(10, 104, 65, 39);
		frame.getContentPane().add(btnsqrt);
		
		final JButton btn1x = new JButton("1/x");
		btn1x.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1x.setBackground(Color.LIGHT_GRAY);
		btn1x.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1x.setBounds(10, 141, 65, 39);
		frame.getContentPane().add(btn1x);
		
		final JButton btnX3 = new JButton("X^3");
		btnX3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	              double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX3.setBackground(Color.LIGHT_GRAY);
		btnX3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX3.setBounds(10, 215, 65, 39);
		frame.getContentPane().add(btnX3);
		
		final JButton btnX2 = new JButton("X^2");
		btnX2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX2.setBackground(Color.LIGHT_GRAY);
		btnX2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnX2.setBounds(10, 249, 65, 39);
		frame.getContentPane().add(btnX2);
		
		final JButton btnN = new JButton("n!");
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0) {
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnN.setBackground(Color.LIGHT_GRAY);
		btnN.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnN.setBounds(10, 283, 65, 39);
		frame.getContentPane().add(btnN);
		
		final JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setBackground(Color.LIGHT_GRAY);
		btnPlusMinus.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPlusMinus.setBounds(10, 320, 65, 39);
		frame.getContentPane().add(btnPlusMinus);
		
		final JButton btnEx = new JButton("e^x");
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setBackground(Color.GREEN);
		btnEx.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEx.setBounds(75, 104, 65, 39);
		frame.getContentPane().add(btnEx);
		
		final JButton btnlog = new JButton("Log");
		btnlog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log10(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnlog.setBackground(Color.PINK);
		btnlog.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnlog.setBounds(75, 141, 65, 39);
		frame.getContentPane().add(btnlog);
		
		final JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(75, 215, 65, 39);
		frame.getContentPane().add(btn7);
		
		final JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(75, 249, 65, 39);
		frame.getContentPane().add(btn4);
		
		final JButton btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(75, 283, 65, 39);
		frame.getContentPane().add(btn1);
		
		final JButton btn0 = new JButton("0");
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(75, 320, 130, 39);
		frame.getContentPane().add(btn0);
		
		final JButton btnSin = new JButton("Sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double a=Math.sin(Double.parseDouble(textField.getText()));
				
				textField.setText("");
				textField.setText(textField.getText()+a);
				
			}
		});
		btnSin.setBackground(Color.GREEN);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSin.setBounds(140, 104, 65, 39);
		frame.getContentPane().add(btnSin);
		
		final JButton btnsinh = new JButton("Sinh");
		btnsinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnsinh.setBackground(Color.PINK);
		btnsinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnsinh.setBounds(140, 141, 65, 39);
		frame.getContentPane().add(btnsinh);
		
		final JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(140, 215, 65, 39);
		frame.getContentPane().add(btn8);
		
		final JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(140, 249, 65, 39);
		frame.getContentPane().add(btn5);
		
		final JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(140, 283, 65, 39);
		frame.getContentPane().add(btn2);
		
		JButton btnNewButton_6_2 = new JButton("new");
		btnNewButton_6_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_6_2.setBounds(140, 320, 65, 39);
		frame.getContentPane().add(btnNewButton_6_2);
		
		final JButton btnCos = new JButton("Cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setBackground(Color.GREEN);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCos.setBounds(205, 104, 65, 39);
		frame.getContentPane().add(btnCos);
		
		final JButton btncosh = new JButton("Cosh");
		btncosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btncosh.setBackground(Color.PINK);
		btncosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btncosh.setBounds(205, 141, 65, 39);
		frame.getContentPane().add(btncosh);
		
		final JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setBackground(Color.CYAN);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 18));
		btnBackSpace.setBounds(205, 178, 65, 39);
		frame.getContentPane().add(btnBackSpace);
		
		final JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(205, 215, 65, 39);
		frame.getContentPane().add(btn9);
		
		final JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(205, 249, 65, 39);
		frame.getContentPane().add(btn6);
		
		final JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(205, 283, 65, 39);
		frame.getContentPane().add(btn3);
		
		final JButton btnDot = new JButton(".");
		btnDot.setBackground(Color.CYAN);
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(205, 320, 65, 39);
		frame.getContentPane().add(btnDot);
		
		final JButton btnTan = new JButton("Tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setBackground(Color.GREEN);
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnTan.setBounds(270, 104, 65, 39);
		frame.getContentPane().add(btnTan);
		
		final JButton btntanh = new JButton("Tanh");
		btntanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btntanh.setBackground(Color.PINK);
		btntanh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btntanh.setBounds(270, 141, 65, 39);
		frame.getContentPane().add(btntanh);
		
		final JButton btnEqual = new JButton("=");
		btnEqual.setBackground(Color.YELLOW);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+") {
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="-") {
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="*") {
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="/") {
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="%") {
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation=="X^Y") {
					double resultt=1;
					for(int i=0;i<second;i++) {
						resultt=first*resultt;
					}
					
					answer=String.format("%.2f",resultt);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnEqual.setBounds(270, 320, 65, 39);
		frame.getContentPane().add(btnEqual);
		
		final JButton btnDivide = new JButton("/");
		btnDivide.setForeground(Color.WHITE);
		btnDivide.setBackground(Color.BLACK);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDivide.setBounds(270, 283, 65, 39);
		frame.getContentPane().add(btnDivide);
		
		final JButton btnMul = new JButton("*");
		btnMul.setForeground(Color.WHITE);
		btnMul.setBackground(Color.BLACK);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "*";
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMul.setBounds(270, 249, 65, 39);
		frame.getContentPane().add(btnMul);
		
		final JButton btnSub = new JButton("-");
		btnSub.setForeground(Color.WHITE);
		btnSub.setBackground(Color.BLACK);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnSub.setBounds(270, 215, 65, 39);
		frame.getContentPane().add(btnSub);
		
		final JButton btnAdd = new JButton("+");
		btnAdd.setBackground(SystemColor.desktop);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAdd.setBounds(270, 178, 65, 39);
		frame.getContentPane().add(btnAdd);
		
		final JButton btnClear = new JButton("C");
		btnClear.setBackground(Color.CYAN);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnClear.setBounds(140, 178, 65, 39);
		frame.getContentPane().add(btnClear);
		
		final JButton btnPercent = new JButton("%");
		btnPercent.setBackground(Color.CYAN);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(75, 178, 65, 39);
		frame.getContentPane().add(btnPercent);
		
		final JButton btnXy = new JButton("X^Y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation= "X^Y";
			}
		});
		btnXy.setBackground(Color.LIGHT_GRAY);
		btnXy.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnXy.setBounds(10, 178, 65, 39);
		frame.getContentPane().add(btnXy);
	}
}
