package edu.java.swing03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SwingMain03 {

	private JFrame frame;
	private JTextField num1TextField;
	private JTextField num2TextField;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private int num1 = 0;
	private int num2;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain03 window = new SwingMain03();
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
	public SwingMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNum1 = new JLabel("New label");
		lblNum1.setBounds(12, 10, 124, 46);
		frame.getContentPane().add(lblNum1);
		
		lblNum2 = new JLabel("New label");
		lblNum2.setBounds(12, 66, 124, 44);
		frame.getContentPane().add(lblNum2);
		
		num1TextField = new JTextField();
		num1TextField.setBounds(148, 11, 244, 46);
		frame.getContentPane().add(num1TextField);
		num1TextField.setColumns(10);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(num1TextField.getText());
					num2 = Integer.parseInt(num2TextField.getText());
				} catch (Exception e2) {
					textArea.setText("정수를 입력하세요");
				}
			num1TextField.setText("");
			num2TextField.setText("");
			int result = num1 + num2;
			String resultString = "" + result;
			textArea.setText(resultString);
			num1TextField.setText(resultString);
			}
		});
		btnPlus.setFont(new Font("굴림", Font.PLAIN, 25));
		btnPlus.setBounds(12, 120, 79, 46);
		frame.getContentPane().add(btnPlus);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("굴림", Font.PLAIN, 25));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(num1TextField.getText());
					num2 = Integer.parseInt(num2TextField.getText());
				} catch (Exception e2) {
					textArea.setText("정수를 입력하세요");
					return;
				} 
				
				num1TextField.setText("");
				num2TextField.setText("");
				int result = num1 - num2;
				String resultString = "" + result;
				textArea.setText(resultString);
				num1TextField.setText(resultString);
			}
		});
		btnMinus.setBounds(117, 120, 79, 46);
		frame.getContentPane().add(btnMinus);
		
		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(num1TextField.getText());
					num2 = Integer.parseInt(num2TextField.getText());
				} catch (Exception e2) {
					textArea.setText("정수를 입력하세요");
				}
				num1TextField.setText("");
				num2TextField.setText("");
				int result = num1 * num2;
				String resultString = "" + result;
				textArea.setText(resultString);
				num1TextField.setText(resultString);
			}
		});
		btnMulti.setFont(new Font("굴림", Font.PLAIN, 25));
		btnMulti.setBounds(222, 120, 79, 46);
		frame.getContentPane().add(btnMulti);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num1 = Integer.parseInt(num1TextField.getText());
					num2 = Integer.parseInt(num2TextField.getText());
				} catch (Exception e2) {
					textArea.setText("정수를 입력하세요");
				}
				num1TextField.setText("");
				num2TextField.setText("");
				int result = num1 / num2;
				String resultString = "" + result;
				textArea.setText(resultString);
				num1TextField.setText(resultString);
			}
		});
		btnDivide.setFont(new Font("굴림", Font.PLAIN, 25));
		btnDivide.setBounds(326, 120, 79, 46);
		frame.getContentPane().add(btnDivide);
		
		textArea = new JTextArea();
		textArea.setBounds(12, 176, 410, 175);
		frame.getContentPane().add(textArea);
		
		num2TextField = new JTextField();
		num2TextField.setBounds(148, 66, 244, 44);
		frame.getContentPane().add(num2TextField);
		num2TextField.setColumns(10);
		
		
	}
//	private void returnNum1 () {
//		num1 = Integer.parseInt(num1TextField.getText());
//	}
//	
//	private void returnNum2 () {
//		num2 = Integer.parseInt(num2TextField.getText());
//	}
}
