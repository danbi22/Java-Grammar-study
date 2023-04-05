package edu.java.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import javax.swing.SpringLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblresult;
	private String msg= "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 698, 589);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblresult = new JLabel("입력하세요");
		lblresult.setFont(new Font("D2Coding", Font.PLAIN, 34));
		lblresult.setHorizontalAlignment(SwingConstants.CENTER);
		lblresult.setBounds(56, 23, 574, 114);
		frame.getContentPane().add(lblresult);
		
		textInput = new JTextField();
		textInput.setFont(new Font("D2Coding", Font.PLAIN, 35));
		textInput.setBounds(56, 143, 574, 215);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		JButton btnInput = new JButton("button");
		btnInput.addActionListener(new ActionListener() {
			@Override 
			public void actionPerformed(ActionEvent e) {
				hadleButtonClick(); // 내부 클래스에서 외부 클래스의 메서드를 호출할 수 있음.
			}
		});
		btnInput.setFont(new Font("D2Coding", Font.PLAIN, 20));
		btnInput.setBounds(191, 412, 316, 94);
		frame.getContentPane().add(btnInput);
		
	
	}

	private void hadleButtonClick() {
		// JTextField의 입력 내용을 읽음.
		msg = msg + " " + textInput.getText();
		// 읽는 내용을 JLabel에 씀
		lblresult.setText(msg);
		// JTextField의 내용을 지움
		textInput.setText("");
	}
}
