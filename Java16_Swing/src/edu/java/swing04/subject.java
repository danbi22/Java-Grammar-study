package edu.java.swing04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class subject {
	// 이미지 파일의 경로들을 저장하는 배열
	private static final String[]	IMAGES = {
			"images/1.jpg",
			"images/2.jpg",
			"images/3.jpg",
			"images/4.jpg",
			"images/5.jpg",
	};

	private JFrame frame;
	private JButton btnLeft;
	private JButton btnRight;
	private JLabel lblView;
	private int n;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					subject window = new subject();
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
	public subject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblView = new JLabel("");
		lblView.setIcon(new ImageIcon("images/1.jpg"));
		lblView.setBounds(196, 155, 800, 600);
		frame.getContentPane().add(lblView);
		
		btnLeft = new JButton("<");
		btnLeft.setFont(new Font("굴림", Font.PLAIN, 30));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnLeft.setBounds(234, 820, 231, 81);
		frame.getContentPane().add(btnLeft);
		
		btnRight = new JButton(">");
		btnRight.setFont(new Font("굴림", Font.PLAIN, 30));
		btnRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
			}
		});
		btnRight.setBounds(674, 820, 231, 81);
		frame.getContentPane().add(btnRight);
	}

	private void handleButtonClick(ActionEvent event) {
		ImageIcon[] icons = new ImageIcon[5];
		icons[0] = new ImageIcon("images/1.jpg");
		icons[1] = new ImageIcon("images/2.jpg");
		icons[2] = new ImageIcon("images/3.jpg");
		icons[3] = new ImageIcon("images/4.jpg");
		icons[4] = new ImageIcon("images/5.jpg");
		Object source = event.getSource();
		if (source == btnLeft) {
			n--;
			if (n < 0) {
				n = 4;
			}
			lblView.setIcon(icons[n]);
		} else if (source == btnRight) {
			n++;
			if (n > 4) {
				n = 0;
			}
			lblView.setIcon(icons[n]);
		}
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
