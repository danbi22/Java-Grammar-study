package edu.java.swing03_1;

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

public class SwingMain03_1 {

	private JFrame frame;
	private JTextField num1TextField;
	private JTextField num2TextField;
	private JLabel lblNum1;
	private JLabel lblNum2;
	private JTextArea textArea;
	private JButton btnPlus;
	private JButton btnMinus;
	private JButton btnMulti;
	private JButton btnDivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain03_1 window = new SwingMain03_1();
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
	public SwingMain03_1() {
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
		
		btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnPlus.setFont(new Font("굴림", Font.PLAIN, 25));
		btnPlus.setBounds(12, 120, 79, 46);
		frame.getContentPane().add(btnPlus);
		
		btnMinus = new JButton("-");
		btnMinus.setFont(new Font("굴림", Font.PLAIN, 25));
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnMinus.setBounds(117, 120, 79, 46);
		frame.getContentPane().add(btnMinus);
		
		btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnMulti.setFont(new Font("굴림", Font.PLAIN, 25));
		btnMulti.setBounds(222, 120, 79, 46);
		frame.getContentPane().add(btnMulti);
		
		btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
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

	protected void handleButtonClick(ActionEvent event) {
//		event.getSource(); // 
		//-> augument로 전달된 ActionEvent 객체에서 이벤트가 발행한 GUI 컴포넌트 정보를 알 수 있다.
		// JTextField에 입력된 문자열을 읽어서 double 타입으로 변환
		double number1 = 0;
		double number2 = 0;
		try {
			number1 = Double.parseDouble(num1TextField.getText());
			number2 = Double.parseDouble(num2TextField.getText());
		} catch (Exception e2) {
			textArea.setText("number1,2는 숫자로 입력하세요");
			return; // 메서드 종료
		}
		
		double result = 0; // 사칙 연산 결과를 저장할 변수
		String op = ""; // 사칙 연산 연산자 문자열을 저장할 변수(+, -, *, /)
		
		Object source = event.getSource(); // 이벤트가 발생한 컴포넌트
		if (source == btnPlus) {
			result = number1 + number2;
			op = "+";
		} else if (source == btnMinus) {
			result = number1 - number2;
			op = "-";
		} else if (source == btnMulti) {
			result = number1 * number2;
			op = "*";
		} else if (source == btnDivide) {
			result = number1 / number2;
			op = "/";
		}
		String msg = String.format("%f %s %f = %f", number1, op, number2, result);
		textArea.setText(msg);
	}
}
