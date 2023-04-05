package edu.java.swing04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextArea textresult;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMultifly;
	private JButton btnDivide;
	private JButton btnAc;
	private Double num1;
	private Double num2;
	private Double result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textNum1 = new JTextField();
		textNum1.setBounds(117, 32, 239, 59);
		frame.getContentPane().add(textNum1);
		textNum1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Num1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 32, 93, 59);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNum = new JLabel("Num2");
		lblNum.setHorizontalAlignment(SwingConstants.CENTER);
		lblNum.setBounds(12, 101, 93, 59);
		frame.getContentPane().add(lblNum);
		
		textNum2 = new JTextField();
		textNum2.setColumns(10);
		textNum2.setBounds(117, 101, 239, 59);
		frame.getContentPane().add(textNum2);
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlerButtonClick(e);
			}
		});
		btnPlus.setBounds(6, 203, 64, 44);
		frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlerButtonClick(e);
			}
		});
		btnMinus.setBounds(82, 203, 64, 44);
		frame.getContentPane().add(btnMinus);
		
		btnMultifly = new JButton("x");
		btnMultifly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlerButtonClick(e);
			}
		});
		btnMultifly.setBounds(158, 203, 64, 44);
		frame.getContentPane().add(btnMultifly);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlerButtonClick(e);
			}
		});
		btnDivide.setBounds(234, 203, 64, 44);
		frame.getContentPane().add(btnDivide);
		
		btnAc = new JButton("AC");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handlerButtonClick(e);
			}
		});
		btnAc.setBounds(310, 203, 64, 44);
		frame.getContentPane().add(btnAc);
		
		textresult = new JTextArea();
		textresult.setBounds(12, 273, 360, 263);
		frame.getContentPane().add(textresult);
	}

	private void handlerButtonClick(ActionEvent e) {
		try {
			num1 = Double.parseDouble(textNum1.getText());
			num2 = Double.parseDouble(textNum2.getText());
			textNum2.setText("");
		} catch (Exception e2) {
			textresult.setText("정수를 입력하세요");
			return;
		}
		Object source = e.getSource();
		if (source == btnPlus) {
			result = num1 + num2;
			textresult.setText(result+"");
			textNum1.setText(result+"");
		} else if (source == btnMinus) {
			result = num1 - num2;
			textresult.setText(result+"");
			textNum1.setText(result+"");			
		} else if (source == btnMultifly) {
			result = num1 * num2;
			textresult.setText(result+"");
			textNum1.setText(result+"");
			
		} else if (source == btnDivide) {
			result = num1 / num2;
			textresult.setText(result+"");
			textNum1.setText(result+"");
			
		} else if (source == btnAc) {
			textresult.setText("");
			textNum1.setText("");
			
		}
	}
}
